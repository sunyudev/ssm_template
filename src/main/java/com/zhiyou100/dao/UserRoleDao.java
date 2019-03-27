package com.zhiyou100.dao;

import com.zhiyou100.pojo.User;
import com.zhiyou100.pojo.UserRole;

/**
 * @Description:
 * @Author: Mr'Sun
 * @Date: 2019/3/21 0021 下午 11:55
 */
public interface UserRoleDao {
    boolean updateUserMsg(User user);

    void addUserAndRole(UserRole user);
}
