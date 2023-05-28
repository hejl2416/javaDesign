package com.le.controller;


import com.le.framework.context.support.ClassPathXmlApplicationContext;
import com.le.service.UserService;

public class UserControllerTest {
    public static void main(String[] args) throws Exception {
        //创建spring容器对象
        ClassPathXmlApplicationContext a = new ClassPathXmlApplicationContext("application.xml");
        //从IOC容器中获取UserService对象
        UserService bean = a.getBean("userService", UserService.class);
        //调用UserService对象的add方法
        bean.add();
    }
}
