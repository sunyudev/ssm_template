package com.zhiyou100.Service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou100.Service.PermissionService;
import com.zhiyou100.dao.PermissionDao;
import com.zhiyou100.pojo.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: Mr'Sun
 * @Date: 2019/3/22 0022 下午 11:36
 */
@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionDao permissionDao;

    @Override
    public List<Permission> findAllPermission() {
        return permissionDao.findAllPermission();
    }

    @Override
    public PageInfo<Permission> findAllPermission(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Permission> allPermission = permissionDao.findAllPermission();
        PageInfo<Permission> permissionPageInfo = new PageInfo<>(allPermission, pageSize);
        return permissionPageInfo;
    }

    @Override
    public int findCount() {
        return permissionDao.findCount();
    }

    @Override
    public void addPermission(Permission permission) {
        permissionDao.addPermission(permission);
    }

    @Override
    public void delPermission(int id) {
        permissionDao.delPermission(id);
    }

    @Override
    public void modifyPermission(Permission permission) {
        permissionDao.modifyPermission(permission);
    }

    @Override
    public Permission findPermissionByName(String name) {
        return  permissionDao.findPermissionByName(name);
    }
}
