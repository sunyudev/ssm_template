package com.zhiyou100.dao;

import com.github.pagehelper.PageInfo;
import com.zhiyou100.pojo.Permission;
import com.zhiyou100.pojo.User;

import java.util.List;

/**
 * @Author:段晨曦
 * @Date: 2019/3/7 10:11
 */
public interface UserDao {
    /**
     * 段晨曦MyBatis接口开发规范
     *     1.接口名必须与mapper的文件名保持一致
     *     2.接口包的路径和nameSpace保持一致
     *     namespace="com.zhiyou100.mapper.UserMapper"
     *     3，接口里面的方法名与id的名字保持一致
     *     4.接口里面的返回值类型与ResultType(Map) 保持一致
     *     5.接口里面的参数必须与ParamterType保持一致；
     */
    User findUserByName(String userName);

    List<User> findAllUser();

    int findUserCount();

    void delUser(int id);

    int findIdByName(User user);

    void addUser(User user);

    List<User> vagueFindUser(User user);
}
