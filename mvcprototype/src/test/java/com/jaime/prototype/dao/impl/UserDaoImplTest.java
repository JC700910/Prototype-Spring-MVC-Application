package com.jaime.prototype.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jaime.prototype.dao.UserDao;

public class UserDaoImplTest {

    @Test
    public void userJaimeIsValidUser() {
        UserDao tester = new UserDaoImpl();
        
        assertEquals("User jaime is a valid user",true,tester.isValidUser("jaime", "anything"));
    }
    
    @Test 
    public void nonJaimeUserIsNotValid(){
        UserDao tester = new UserDaoImpl();
        
        assertEquals("User jaime is a valid user",false,tester.isValidUser("not jaime", "anything"));
    }

}
