package com.zhiyou100.Service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou100.Service.RoleService;
import com.zhiyou100.dao.RoleDao;
import com.zhiyou100.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: Mr'Sun
 * @Date: 2019/3/20 0020 下午 5:21
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;
    @Override
    public PageInfo<Role> findAllRole(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Role> roles = roleDao.findAllRole();
        PageInfo<Role> allRole= new PageInfo<>(roles, pageSize);
        return allRole;
    }

    @Override
    public int findRoleCount() {
        return roleDao.findRoleCount();
    }

    @Override
    public PageInfo<Role> findRoleVague(String roleName, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Role> roles = roleDao.findRoleVague(roleName);
        PageInfo<Role> rolePageInfo = new PageInfo<>(roles, pageSize);
        return rolePageInfo;
    }

    @Override
    public Role findRoleByName(String roleName) {
        return roleDao.findRoleByName(roleName);
    }

    @Override
    public List<Integer> findPids(Integer id) {
        return roleDao.findPids(id);
    }


}
