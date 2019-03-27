package com.zhiyou100.controller;


import com.github.pagehelper.PageInfo;
import com.zhiyou100.Service.RoleService;
import com.zhiyou100.Service.UserRoleService;
import com.zhiyou100.Service.UserService;
import com.zhiyou100.pojo.ResultJson;
import com.zhiyou100.pojo.Role;
import com.zhiyou100.pojo.User;
import com.zhiyou100.pojo.UserRole;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @Autowired
    UserRoleService userRoleService;

    @RequestMapping("/login")
    public String loginAction(String username, String password, HttpSession session) {
        //认证 Subject: 主体
        Subject subject = SecurityUtils.getSubject();
        //根据用户信息.组成用户令牌token
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        System.out.println("---------------------password:"+password);
        try {
            subject.login(token);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("认证失败");
            System.out.println(e.getMessage());
            return "redirect:/index";
        }
        System.out.println("认证成功=====");
        //把用户信息存到session里面
        //通过主体获取user对象信息
        User user = (User) subject.getPrincipal();
        session.setAttribute("user", user);
        return "home/home";
    }

    //查询所有用户
    @RequiresPermissions("/user/forward")
    @RequestMapping("/forward")
    public ModelAndView registrationInfor(HttpSession session,@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "3") int pageSize) {
        ModelAndView modelAndView = new ModelAndView();
        if (session.getAttribute("limitname")!=null&&session.getAttribute("limitname")!=""){
            String name = (String) session.getAttribute("limitname");
            User user = new User(name);
            PageInfo<User> pageInfo = userService.vagueFindUser(user, pageNum, pageSize);
            int countByName = userService.findCountByName(user);
            modelAndView.addObject("count", countByName);
            modelAndView.addObject("projectList", pageInfo);
        }else {
            PageInfo<User> projectList = userService.findAllUser(pageNum, pageSize);
            int count = userService.findUserCount();
            modelAndView.addObject("count", count);
            modelAndView.addObject("projectList", projectList);
        }
        modelAndView.setViewName("user/index");
        return modelAndView;
    }


    //跳转到用户编辑界面
    @RequestMapping("/toEditPage")
    public ModelAndView toPage(String name, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "3") int pageSize) {
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.findUserByName(name);
        PageInfo<Role> allRole = roleService.findAllRole(pageNum, pageSize);
        modelAndView.addObject("user", user);
        modelAndView.addObject("roleList", allRole);
        modelAndView.addObject("pageNum", pageNum);
        modelAndView.setViewName("user/editUser");
        return modelAndView;
    }
    //编辑页面的更新
    @RequestMapping("/update")
    public String updateUser(Integer pageNum, User user,String roleId) {
        System.out.println(user.toString()+"----------------roleId" +roleId);
        userRoleService.updateUserMsg(user);
        System.out.println(user);
        return "redirect:/user/forward.do";
    }

    //删除用户
    @RequestMapping("/del")
    public String delUser(int id) {
        userService.delUser(id);
        return "redirect:/user/forward.do";
    }

    //添加用户跳转到添加页面
    @RequestMapping("/toAdd")
    public ModelAndView toAddPage(@RequestParam(defaultValue="1")int pageNum,@RequestParam(defaultValue="10")int pageSize){
    	ModelAndView modelAndView = new ModelAndView();
    	//查询所有角色用于显示角色可选项
    	PageInfo<Role> roleList = roleService.findAllRole(pageNum,pageSize);
    	modelAndView.addObject("roleList",roleList);
    	//传入当前页，用于返回事件
    	modelAndView.addObject("pageNum",pageNum);
    	modelAndView.setViewName("user/addUser");
    	return modelAndView;
    }


    //添加用户时,失去焦点事件查询用户名是否重复
    @RequestMapping("/repetition")
    @ResponseBody
    public ResultJson<Integer> repetition(User user) {
    	int id = userService.findIdByName(user);
    	System.out.println(id+"id++++++++++++++");
    	if (id!=0){
		    return new ResultJson<Integer>(1, "", id);
        }else {
    	    return new ResultJson<Integer>(0, "", id);
        }
	}

    //添加用户
    @RequestMapping("/addUser")
    @ResponseBody
    public ResultJson<String> addUser(User user){
        //先给user表插入数据
    	userService.addUser(user);
    	//再根据新插入的数据的用户名查询到user_id,往user_role插入user_id和role_id
        int userId = userService.findIdByName(user);
        UserRole userRole =new UserRole();
        userRole.setUserId(userId);
        userRole.setRoleId(user.getRoleId());
    	userRoleService.addUserAndRole(userRole);
    	return new ResultJson<String>(1, "", "");
    }

    //模糊查询
    @RequestMapping("/vague")
    public ModelAndView findUserVague(HttpSession session,String  username,@RequestParam(defaultValue = "1")int pageNum,@RequestParam(defaultValue = "3")int pageSize){
        if (username.equals("")){
            session.removeAttribute("limitname");
        }
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setUserName(username);
        int countByName = userService.findCountByName(user);
        modelAndView.addObject("count", countByName);
        PageInfo<User> projectList = userService.vagueFindUser(user, pageNum, pageSize);
        modelAndView.addObject("projectList",projectList);
        modelAndView.setViewName("user/index");
//        将该字段存入session，方便分页模糊查询
        if (username!=null&&username!=""){
            session.setAttribute("limitname",username);
        }
        return modelAndView;
    }

}
