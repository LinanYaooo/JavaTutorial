package com.linany.spring;

import com.linany.spring.controller.UserController;
import com.linany.spring.dao.UserDao;
import com.linany.spring.entities.People;
import com.linany.spring.service.UserService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 声明这是一个 Java Config 配置类, 用于替代 applicationContext.xml
public class Config {
    @Bean // 通过方法创建对象，将返回的对象放入容器，beanId = 方法名
    public UserDao userData(){
        UserDao userDao = new UserDao();
        return userDao;
    }

    @Bean
    public UserService UserService(UserDao userDao){
        UserService userService = new UserService();
        userService.setUserDao(userDao);
        return userService;
    }
}
