package com.atguigu.object.inherit;

/**
 * 新手机
 * 功能变强丹原油功能继续使用
 * 继承和方法重写丹思想
 */
public class NewPhone extends Phone {
    // 从写父类方法
    public void showCall() {
        // 复用显示号码的功能
        super.showCall();
        // 新增丹功能
        System.out.println("显示大头像");
        System.out.println("归属地");
        System.out.println("意思推销");
    }
}
