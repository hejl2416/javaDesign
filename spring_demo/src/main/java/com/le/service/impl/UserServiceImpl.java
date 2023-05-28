package com.le.service.impl;

import com.le.dao.UserDao;
import com.le.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("UserServiceImpl......");
        userDao.add();
    }
}
