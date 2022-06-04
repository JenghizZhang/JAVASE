package com.atguigu.jdbc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestJDBC {
    private Connection connection;
    private Statement statement;
    
    @Before
    public void init() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql:///atguigu?characterEncoding=utf8&serverTimezone=GMT";
        String user = "root";
        String password = "199834zys";
        connection = DriverManager.getConnection(url, user, password);
        statement = connection.createStatement();
    }
    
    @After
    public void destroy() throws Exception {
        statement.close();
        connection.close();
    }
    
    @Test
    public void testFindAll() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql:///atguigu?characterEncoding=utf8&serverTimezone=GMT";
        String user = "root";
        String password = "199834zys";
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String sql = "select * from user";
        ResultSet resultSet = statement.executeQuery(sql);
        HashSet<User> users = new HashSet<>();
        while (resultSet.next()) {
            int id = (int) resultSet.getObject("id");
            String un = (String) resultSet.getObject("username");
            String pwd = (String) resultSet.getObject("password");
            String nn = (String) resultSet.getObject("nickname");
            users.add(new User(id, un, pwd, nn));
        }
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
    
    @Test
    public void testInsert() throws Exception {
        String sql = "insert into user (username,password,nickname) values ('tq','7777','天气')";
        int i = statement.executeUpdate(sql);
        System.out.println(i);
    }
    

    @Test
    public void testDelete() throws Exception {
        String sql = "delete from user where id>=4";
        int i = statement.executeUpdate(sql);
        System.out.println("i = " + i);
    }
    
    @Test
    public void testUpdate() throws Exception {
        String sql = "update user set nickname = '王武' where id=  3";
        int i = statement.executeUpdate(sql);
        System.out.println("i = " + i);
    }
    
    @Test
    public void testFindById() throws Exception {
        String sql = "select * from user where id = 1";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            int id = (int) resultSet.getObject("id");
            String un = (String) resultSet.getObject("username");
            String pwd = (String) resultSet.getObject("password");
            String nn = (String) resultSet.getObject("nickname");
            User user = new User(id, un, pwd, nn);
            System.out.println(user);
        }
        resultSet.close();
    }
    
}
