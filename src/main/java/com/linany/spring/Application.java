package com.linany.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.Oneway;

public class Application {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        for(String name:context.getBeanDefinitionNames()){
            print(name);
        }


    }


    public static void print(Object obj){
        System.out.println(obj.toString());
    }
}
