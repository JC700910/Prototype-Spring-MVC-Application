package com.jaime.prototype.spring.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jaime.prototype.dao.DataSourceObject;

@Controller
public class HelloController {
    
    private DataSourceObject dataSource;
    
    @Autowired
    public void setDataSource(DataSourceObject dataSourceObject)
    {
        this.dataSource = dataSourceObject;
    }
    
    @GetMapping("/hello")
    public String hello(Model model){
       
       
        
        DataSource ds = dataSource.getDatasource();
        
        String timeStamp = null;
        
        try {
            Connection con = ds.getConnection();
            
            Statement stmt = con.createStatement();
            
            String sql = "select to_char(sysdate,'hh24:mi:ss dd Mon') from sys.dual";
            
            ResultSet rset = stmt.executeQuery(sql);
            while (rset.next())
            {
                timeStamp = rset.getString(1);
            }
            
            rset.close();
            stmt.close();
            con.close();
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
           
            
      
        
        
        model.addAttribute("name",timeStamp);
       
       return "welcome";
    }

}
