package com.linany.spring.entities;

import com.linany.spring.Application;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Data
@Service
@Scope("prototype") // 设置多例
public class People {
    @Value("${metaData}")
    private String name;
    private String sex;
    private Integer age;

    @PostConstruct
    public void init(){
        Application.print("People对象初始化metaData=" + this.name);
    }


}
