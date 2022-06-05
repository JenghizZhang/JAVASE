package com.atguigu.jdbc;

import com.atguigu.jdbc.utils.JDBCTools;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class TestDBUtils {
    
    private QueryRunner queryRunner;
    
    @Test
    // 添加数据
    public void testInsert() throws Exception {
        //方式一：需要子集在执行sql语句的时候手动传入连接对象
        // 创建连接
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigu?characterEncoding=utf8&serverTimezone=GMT", "root", "199834zys");
        QueryRunner qr = new QueryRunner();
        // 增删改用update方法
        String sql = "insert into user values(?,?,?,?)";
        int update = qr.update(connection, sql, null, "aaa", "111", "路西");
        
        //方式二：直接将连接池对象交给QueryRunner
        QueryRunner queryRunner = new QueryRunner(JDBCTools.getDataSource());
        int update1 = queryRunner.update(sql, null, "aaa", "111", "路西");
    }
    
    @Before
    // 初始化
    public void init() throws Exception {
         queryRunner = new QueryRunner(JDBCTools.getDataSource());
    }
    
    @Test
    // 删除
    public void testDelete() throws Exception {
        String sql = "delete from user where username=?";
        int aaa = queryRunner.update(sql, "aaa");
    }
    
    @Test
    // 更新
    public void testUpdate() throws Exception {
        String sql = "update user set username=? where username=?";
        queryRunner.update(sql, "zhaogang", "aobama");
    }
    
    @Test
    // 查询
    public void testQuery() throws Exception {
        String sql = "select * from user where id = ?";
        User query = queryRunner.query(sql, new BeanHandler<>(User.class),1);
        System.out.println("query = " + query);
    }
    
    //查询所有的用户信息
    @Test
    public  void selectAll() throws SQLException {
        //创建queryRunner对象
        String sql = "select *from user";
        Object[] params = {};
        List<User> list = queryRunner.query(sql, new BeanListHandler<>(User.class), params);
        System.out.println(list.toString());
    }
    
    @Test
    // 批处理
    public void testBatchAdd() throws Exception {
        //编写批量添加
        String sql = "insert into user values(null,?,?,?)";
        //创建二维数组用于添加批量参数
        //第一维表示批量添加多少参数
        //第二维表示参数
        Object[][] params = new Object[10][3];
        for (int i = 0; i < params.length; i++) {
            params[i][0] = i+"-aobama";
            params[i][1] = i+"-qwe";
            params[i][3] = i+"奥巴马";
        }
        int[] batch = queryRunner.batch(sql, params);
        for (int i : batch) {
            System.out.println(i);
        }
    }
    
    //统计用户的个数
    @Test
    public  void getCount() throws SQLException{
        //创建queryRunner对象
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select count(*) from user";
        Long n = (Long) queryRunner.query(JDBCTools.getConnection(),sql, new ScalarHandler());
        System.out.println(n.intValue());
    }
}
