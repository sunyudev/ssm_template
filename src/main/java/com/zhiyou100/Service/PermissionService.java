package com.zhiyou100.Service;

import com.github.pagehelper.PageInfo;
import com.zhiyou100.pojo.Permission;

import java.util.List;

/**
 * @Description:
 * @Author: Mr'Sun
 * @Date: 2019/3/22 0022 下午 11:36
 */
public interface PermissionService {

    List<Permission> findAllPermission();

    PageInfo<Permission> findAllPermission(int pageNum,int pageSize);

    int findCount();

    void addPermission(Permission permission);

    void delPermission(int id);

    void modifyPermission(Permission permission);

    Permission findPermissionByName(String name);
}
