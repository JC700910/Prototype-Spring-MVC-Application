package com.jaime.prototype.domain;

import org.springframework.beans.factory.annotation.Autowired;

import com.jaime.prototype.service.UserService;

public class LoginDelegate {
    
    @Autowired
    private UserService userService;
    
    

    public UserService getUserService() {
        return userService;
    }



    public void setUserService(UserService userService) {
        this.userService = userService;
    }



    public boolean isValidUser(String username, String password) {
        
        return userService.isValidUser(username,password);
    }

}
