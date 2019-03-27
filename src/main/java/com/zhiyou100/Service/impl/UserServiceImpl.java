package com.zhiyou100.Service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou100.Service.UserService;
import com.zhiyou100.dao.UserDao;
import com.zhiyou100.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:段晨曦
 * @Date: 2019/3/13 15:14
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public PageInfo<User> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userDao.findAllUser();
        PageInfo<User> projectList = new PageInfo<>(users,pageSize);
        return projectList;
    }

    @Override
    public int findUserCount() {
        return userDao.findUserCount();
    }

    @Override
    public User findUserByName(String name) {
        return userDao.findUserByName(name);
    }

    @Override
    public void delUser(int  id) {
        userDao.delUser(id);
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public int findCountByName(User user) {
        List<User> users = userDao.vagueFindUser(user);
        int count = users.size();
        return count;
    }

    @Override
    public PageInfo<User> vagueFindUser(User user, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userDao.vagueFindUser(user);
        PageInfo<User> userPageInfo = new PageInfo<>(users, pageSize);
        return userPageInfo;
    }

    @Override
    public int findIdByName(User user) {
        return userDao.findIdByName(user);
    }
}
