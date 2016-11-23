package com.jaime.prototype.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.jaime.prototype.dao.UserDao;
import com.jaime.prototype.service.UserService;

public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserDao userDao;

    
    
    public UserDao getUserDao() {
        return userDao;
    }



    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }



    public boolean isValidUser(String username, String password) {
        // TODO Auto-generated method stub
        return userDao.isValidUser(username,password);
    }

}
