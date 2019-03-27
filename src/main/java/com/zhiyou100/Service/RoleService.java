package com.zhiyou100.Service;

import com.github.pagehelper.PageInfo;
import com.zhiyou100.pojo.Permission;
import com.zhiyou100.pojo.Role;

import java.util.List;

/**
 * @Description:
 * @Author: Mr'Sun
 * @Date: 2019/3/20 0020 下午 3:57
 */
public interface RoleService {
    PageInfo<Role> findAllRole(int pageNum, int pageSize);

    int findRoleCount();

    PageInfo<Role> findRoleVague(String roleName, int pageNum, int pageSize);

    Role findRoleByName(String roleName);

    List<Integer> findPids(Integer id);
}
