package com.jaime.prototype.spring.config;

import javax.naming.NamingException;
import javax.sql.DataSource;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jndi.JndiTemplate;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.jaime.prototype.dao.DataSourceObject;
import com.jaime.prototype.dao.UserDao;
import com.jaime.prototype.dao.impl.UserDaoImpl;
import com.jaime.prototype.domain.LoginDelegate;
import com.jaime.prototype.service.UserService;
import com.jaime.prototype.service.impl.UserServiceImpl;


@Configuration
@EnableWebMvc   
@ComponentScan(basePackages="com.jaime.prototype")

public class AppConfig extends WebMvcConfigurerAdapter {
    
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        //viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        
        return viewResolver;
    }
    
    @Bean
    public DataSourceObject dataSourceObject()   {
        
        DataSourceObject dataSourceObject = new DataSourceObject();
        
        DataSource dataSource = null;
        try {
            JndiTemplate jndi = new JndiTemplate();
            dataSource = (DataSource) jndi.lookup("java:comp/env/jdbc/myoracle");
        } catch (NamingException e) {
          
            e.printStackTrace();
        }
        dataSourceObject.setDatasource(dataSource);
        
        return dataSourceObject;
    }

    @Bean
    public LoginDelegate loginDelegate() {
        
        LoginDelegate loginDelegate = new LoginDelegate();
        
        return loginDelegate;
    }
    
    @Bean UserService userService() {
        
        UserService userService = new UserServiceImpl();
        
        return userService;
    }
    
    @Bean UserDao userDao() {
        
        UserDao userDao = new UserDaoImpl();
        
        return userDao;
    }
   

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    

}
