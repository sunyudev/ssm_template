package com.zhiyou100.Service;

import com.github.pagehelper.PageInfo;
import com.zhiyou100.pojo.Permission;
import com.zhiyou100.pojo.User;

import java.util.List;

/**
 * @Author:段晨曦
 * @Date: 2019/3/13 15:13
 */
public interface UserService {

    PageInfo<User> findAllUser(int pageNum, int pageSize);

    PageInfo<User> vagueFindUser(User user, int pageNum, int pageSize);

    int findUserCount();

    int findIdByName(User user);

    User findUserByName(String name);

    void delUser(int id);

    void addUser(User user);

    int findCountByName(User user);
}
