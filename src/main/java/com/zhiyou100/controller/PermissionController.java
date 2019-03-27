package com.zhiyou100.controller;

import com.github.pagehelper.PageInfo;
import com.zhiyou100.Service.PermissionService;
import com.zhiyou100.pojo.Permission;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description:
 * @Author: Mr'Sun
 * @Date: 2019/3/23 0023 上午 9:26
 */
@Controller
@RequestMapping("permission")
public class PermissionController {
    @Autowired
    PermissionService permissionService;

    @RequiresPermissions("permission/forward")
    @RequestMapping("forward")
    public ModelAndView queryAllPermission(@RequestParam(defaultValue = "1")int pageNum,@RequestParam(defaultValue = "3")int pageSize){
        ModelAndView modelAndView = new ModelAndView();
        PageInfo<Permission> allPermission = permissionService.findAllPermission( pageNum,pageSize);
        int count = permissionService.findCount();
        modelAndView.addObject("PermissionList",allPermission);
        modelAndView.addObject("count",count);
        modelAndView.setViewName("permission/index");
        return modelAndView;
    }

    @RequestMapping("toAdd")
    public ModelAndView toAdd(Permission permission){
        ModelAndView modelAndView = new ModelAndView();
        permissionService.addPermission(permission);
        modelAndView.setViewName("permission/add");
        return modelAndView;
    }

    @RequestMapping("del")
    public String del(int id){
        permissionService.delPermission(id);
        return "redirect:forward.do";
    }

    @RequestMapping("toEditPage")
    public ModelAndView edit(String name) {
        ModelAndView modelAndView = new ModelAndView();
        Permission permission = permissionService.findPermissionByName(name);
        System.out.println(permission.toString());
        modelAndView.addObject("permission",permission);
        modelAndView.setViewName("permission/edit");
        return modelAndView;
    }
    @RequestMapping("update")
    public ModelAndView update(Permission permission) {
        ModelAndView modelAndView = new ModelAndView();
        permissionService.modifyPermission(permission);
        modelAndView.setViewName("permission/edit");
        return modelAndView;
    }

    @RequestMapping("repetition")
    public ModelAndView repetion(Permission permission) {
        ModelAndView modelAndView = new ModelAndView();
        permissionService.modifyPermission(permission);
        modelAndView.setViewName("permission/edit");
        return modelAndView;
    }


}
