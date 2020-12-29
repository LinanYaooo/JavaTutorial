package com.linany.spring.service;
import com.linany.spring.Application;
import com.linany.spring.dao.UserDao;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class UserService {
    @Autowired
    private UserDao userDao;

    public void createUser(){
        Application.print("注入UserDao");
        userDao.insert();
    }

}
