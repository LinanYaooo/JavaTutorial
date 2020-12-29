package com.linany.spring.dao;

import com.linany.spring.Application;
import lombok.Data;

@Data
public class UserDao {
    public void insert(){
        Application.print("假装写入一条数据到数据库");
    }
}
