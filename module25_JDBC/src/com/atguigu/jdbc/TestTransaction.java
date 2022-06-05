package com.atguigu.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author yunsongzhang
 */
public class TestTransaction {
    @Test
    public void testTransfers() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigu?characterEncoding=utf8&serverTimezone=GMT", "root", "199834zys");
        
        connection.setAutoCommit(false);
        
        
        PreparedStatement preparedStatement = null;
        try {
            String sql = "update account set money=money+? where name=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, 500);
            preparedStatement.setString(2, "zs");
            
            int i1 = preparedStatement.executeUpdate();
            System.out.println("i1 = " + i1);
            preparedStatement.setObject(1, 1000);
            preparedStatement.setString(2, "ls");
            int i2 = preparedStatement.executeUpdate();
            System.out.println("i2 = " + i2);
            
            connection.commit();
        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
        } finally {
            connection.setAutoCommit(true);
        }
        
        preparedStatement.close();
        connection.close();
    }
}
