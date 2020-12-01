package com.student.login;

import java.sql.*;
public class Conn_01 {
	
	Connection c;
	Statement s ;
	public Conn_01(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///check_info","root","saurabh");    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  

}
