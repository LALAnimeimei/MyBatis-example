package com.example.multi_thread.Enum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum  MyObject {
    Factory;
    private    Connection connection;
    private  MyObject(){
        try{
            System.out.println("调用");
            String driver="com.mysql.jdbc.Driver";
            Class.forName(driver);
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis?useUnicode=true&characterEncoding=UTF-8&&useSSL=false&autoReconnect=true&failOverReadOnly=false","test","123456");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public  Connection getConnection() {
        return connection;
    }
}
