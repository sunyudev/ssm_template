package com.zhiyou100.Service.impl;

import com.zhiyou100.Service.UserRoleService;
import com.zhiyou100.dao.UserDao;
import com.zhiyou100.dao.UserRoleDao;
import com.zhiyou100.pojo.User;
import com.zhiyou100.pojo.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: Mr'Sun
 * @Date: 2019/3/20 0020 下午 5:21
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleDao userRoleDao;
    @Override
    public boolean updateUserMsg(User user) {
       return userRoleDao.updateUserMsg(user);
    }

    @Override
    public void addUserAndRole(UserRole user) {
        userRoleDao.addUserAndRole(user);
    }
}
