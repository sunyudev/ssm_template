package com.zhiyou100.Service;

import com.zhiyou100.pojo.User;
import com.zhiyou100.pojo.UserRole;

/**
 * @Description:
 * @Author: Mr'Sun
 * @Date: 2019/3/20 0020 下午 3:58
 */
public interface UserRoleService {
    boolean updateUserMsg(User user);

    void addUserAndRole(UserRole user);
}
