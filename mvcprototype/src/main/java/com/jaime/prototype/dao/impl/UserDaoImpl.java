package com.jaime.prototype.dao.impl;

import com.jaime.prototype.dao.UserDao;

public class UserDaoImpl implements UserDao {

    public boolean isValidUser(String username, String password) {
        if(username.equals("jaime"))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    

}
