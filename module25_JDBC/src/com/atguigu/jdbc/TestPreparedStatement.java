package com.atguigu.jdbc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestPreparedStatement {
    
    private Connection connection;
    
    @Before
    public void init() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql:///atguigu?characterEncoding=utf8&serverTimezone=GMT", "root", "199834zys");
    }
    
    @Test
    public void testLogin() throws Exception {
        
        String username = "ww";
        String password = "555555";
        String nickname = "王五";
        String sql = "insert into user values(null,?,?,?)";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, username);
        pstm.setObject(2, password);
        pstm.setObject(3, nickname);
        int i = pstm.executeUpdate();
        System.out.println("i = " + i);
        
        pstm.close();
    }
    
    @After
    public void destroy() throws Exception {
        connection.close();
    }
    
    @Test
    public void testInsert() throws Exception {
        String sql = "insert into user(id,username,password,nickname) values(null,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, "xcq");
        preparedStatement.setObject(2, "123");
        preparedStatement.setObject(3, "qqq");
        int i = preparedStatement.executeUpdate();
        System.out.println(i);
        preparedStatement.close();
    }
    
    @Test
    public void testQuery() throws Exception {
        String sql = "select * from user where id > ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, 2);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Object o1 = resultSet.getObject(1);
            Object o2 = resultSet.getObject(2);
            Object o3 = resultSet.getObject(3);
            Object o4 = resultSet.getObject(4);
            System.out.println("" + o1 + o2 + o3 + o4);
        }
        resultSet.close();
        preparedStatement.close();
    }
}
