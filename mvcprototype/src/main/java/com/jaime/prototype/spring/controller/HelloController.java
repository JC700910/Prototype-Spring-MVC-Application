package com.jaime.prototype.spring.controller;

import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jaime.prototype.dao.DataSourceObject;

@Controller
public class HelloController {
    
    
    @GetMapping("/hello")
    public String hello(Model model, DataSourceObject dataSource){
       model.addAttribute("name","Jaime");
       
       return "welcome";
    }

}
