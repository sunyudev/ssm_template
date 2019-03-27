package com.zhiyou100.dao;

import com.zhiyou100.pojo.Permission;
import com.zhiyou100.pojo.Role;

import java.util.List;

/**
 * @Description:
 * @Author: Mr'Sun
 * @Date: 2019/3/21 0021 下午 11:19
 */
public interface RoleDao {
    List<Role> findAllRole();

    int findRoleCount();

    List<Role> findRoleVague(String roleName);

    Role findRoleByName(String roleName);

    List<Integer> findPids(Integer id);
}
