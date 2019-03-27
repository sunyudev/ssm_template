package com.zhiyou100.controller;

import com.github.pagehelper.PageInfo;
import com.zhiyou100.Service.PermissionService;
import com.zhiyou100.Service.RoleService;
import com.zhiyou100.pojo.Permission;
import com.zhiyou100.pojo.Role;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Description:
 * @Author: Mr'Sun
 * @Date: 2019/3/22 0022 下午 5:38
 */
@Controller
@RequestMapping("roles")
public class RolesController {
    @Autowired
    RoleService roleService;

    @Autowired
    PermissionService permissionService;

    @RequiresPermissions("roles/forward")
    @RequestMapping("forward")
    public ModelAndView queryAllRoles(@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "3") int pageSize){
        ModelAndView modelAndView = new ModelAndView();
        PageInfo<Role> allRole = roleService.findAllRole(pageNum,pageSize);
        int count = roleService.findRoleCount();
        modelAndView.addObject("roleList",allRole);
        modelAndView.addObject("count",count);
        modelAndView.setViewName("role/index");
        return modelAndView;
    }

    //编辑角色
    @RequestMapping("toEditPage")
    public ModelAndView toPage(String roleName){
        ModelAndView modelAndView = new ModelAndView();
        Role role = roleService.findRoleByName(roleName);
        //查询所有权限
        List<Permission> permissions = permissionService.findAllPermission();
        //查询用户所有的权限id
        List<Integer> pids= roleService.findPids(role.getId());
        modelAndView.addObject("role",role);
        modelAndView.addObject("permissionList",permissions);
        modelAndView.addObject("pids",pids);
        modelAndView.setViewName("role/editRole");
        return modelAndView;

    }
    //模糊查询
    @RequestMapping("vague")
    public ModelAndView findRoleVague(String roleName,@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "3") int pageSize){
        ModelAndView modelAndView = new ModelAndView();
        PageInfo<Role> role = roleService.findRoleVague(roleName,pageNum,pageSize);
        modelAndView.addObject("roleList",role);
        modelAndView.setViewName("role/index");
        return modelAndView;
    }

}
