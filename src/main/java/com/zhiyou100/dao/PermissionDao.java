package com.zhiyou100.dao;

import com.zhiyou100.pojo.Permission;

import java.util.List;

/**
 * @Description:
 * @Author: Mr'Sun
 * @Date: 2019/3/22 0022 下午 11:39
 */
public interface PermissionDao {
    List<Permission> findAllPermission();

    int findCount();

    void addPermission(Permission permission);

    void delPermission(int id);

    void modifyPermission(Permission permission);

    Permission findPermissionByName(String name);
}
