package com.atguigu.manager;

import com.atguigu.bean.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManager {
    private List<Customer> customerList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    
    public CustomerManager() {
        super();
        init();
    }
    
    private void init() {
        customerList.add(new Customer("Tom", 20, "123@qq.com"));
        customerList.add(new Customer("Tony", 22, "1214241@qq.com"));
        customerList.add(new Customer("Jack", 12, "qweqwe@qq.com"));
    }
    
    public void menu() {
        while (true) {
            System.out.println("欢迎进入客户欢迎管理系统");
            System.out.println("添加客户信息：1");
            System.out.println("修改客户信息：2");
            System.out.println("删除客户信息：3");
            System.out.println("查询客户信息：4");
            System.out.println("退出程序：5");
            System.out.print("请输入选择功能：");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    addCustomer();
                    break;
                case "2":
                    updateCustomer();
                    break;
                case "3":
                    deleteCustomer();
                    break;
                case "4":
                    searchCustomer();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("请重新输入：");
                    break;
            }
        }
    }
    
    private void searchCustomer() {
        System.out.println("选择查询客户数据");
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        if (customerList.isEmpty()){
            System.out.println("现在没有数据");
            return;
        }
        for(Customer c:customerList){
            if(c.getName().equals(name)){
                System.out.println("你查询的人是："+c);
                return;
            }
        }
        System.out.println("对不起找不到");
        return;
    }
    
    private void deleteCustomer() {
        System.out.println("选择删除客户数据");
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        if (customerList.isEmpty()){
            System.out.println("现在没有数据");
            return;
        }
        for(Customer c:customerList){
            if(c.getName().equals(name)){
                customerList.remove(c);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("对不起找不到");
        return;
    }
    
    private void updateCustomer() {
    }
    
    private void addCustomer() {
        System.out.println("选择添加客户数据");
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        boolean checkName = false;
        for (Customer c : customerList) {
            if (c.getName().equals(name)) {
                checkName = true;
            }
        }
        while (checkName) {
            System.out.println("无效名字，请重新输入姓名：");
            name = scanner.nextLine();
            checkName = false;
            for (Customer c : customerList) {
                if (c.getName().equals(name)) {
                    checkName = true;
                }
            }
        }
        
        System.out.println("请输入年龄：");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("请输入邮箱：");
        String email = scanner.nextLine();
        Customer c = new Customer(name, age, email);
        System.out.println("添加成功："+c);
        customerList.add(c);
    }
}
