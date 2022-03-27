package com.atguigu.object.inherit;

public class ExtendsTest {
    public static void main(String[] args) {
        /*
         * 创建对象，Person的子类对象
         * Person：Teacher，Manager
         * */
        // Teacher teacher = new Teacher();
        // // teacher对象调用成员变量是调用的继承的
        // // 子类对象调用继承的成员变量
        // teacher.name = "张三";
        // teacher.age = 20;
        //
        // Manager manager = new Manager();
        // manager.name = "李四";
        // manager.age = 22;
        //
        // System.out.println("teacher.name = " + teacher.name);
        // System.out.println("teacher.name = " + teacher.age);
        // System.out.println("manager.name = " + manager.name);
        // System.out.println("manager.name = " + manager.age);
        
        // Child child = new Child();
        // // 子类对象调用成员a
        // System.out.println("child.a = " + child.a);
        //
        // new Child().print();
        
        // //创建子类对象
        // Zi zi = new Zi();
        // zi.print();
        
        //创建手机对象
        Phone phone = new Phone();
        phone.showCall();
        System.out.println("==========");
        //创建新手机对象
        NewPhone newPhone = new NewPhone();
        newPhone.showCall();
    }
}

