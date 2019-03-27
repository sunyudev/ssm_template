package com.zhiyou100;

import com.zhiyou100.Service.RoleService;
import com.zhiyou100.Service.UserService;
import com.zhiyou100.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import javax.xml.ws.Service;

/**
 * Hello world!
 *
 */
@Controller
public class App {
    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = applicationContext.getBean("userServiceImpl",UserService.class);
        User user = userService.findUserByName("sunyu");
        System.out.println(user.getPassword());
    }
}
