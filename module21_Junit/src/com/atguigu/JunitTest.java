package com.atguigu;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * @author yunsongzhang
 */
public class JunitTest {
    @Before
    public void beforeTest() {
        System.out.println("初始化工作");
    }
    
    static {
        System.out.println("static block");
    }
    
    @Test
    public void test01() {
        System.out.println("123321");
        Assert.assertEquals(12,12);
        
    }
    
    @Test
    public void test02() {
        System.out.println("123321");
        Assert.assertEquals(12, 13 - 1);
    }
    
    @After
    public void afterTest() {
        List<String> list = new ArrayList<String>();
        list.clear();
        Map<String, String> map = new HashMap<String, String>();
        map.put("张三","深圳");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
        }
        System.out.println("销毁工作");
    }
}
