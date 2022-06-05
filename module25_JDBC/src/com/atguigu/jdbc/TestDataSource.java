package com.atguigu.jdbc;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

public class TestDataSource {
    @Test
    public void test01() throws Exception {
        Properties properties = new Properties();
        InputStream is = TestDataSource.class.getClassLoader().getResourceAsStream("druid.properties");

        //1.2 使用properties对象加载流
        properties.load(is);

        //2. 使用DruidDataSourceFactory创建Druid连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
    
        dataSource.getConnection();
        dataSource.getConnection();
        dataSource.getConnection();
        dataSource.getConnection();
        dataSource.getConnection();
    }
    
}
