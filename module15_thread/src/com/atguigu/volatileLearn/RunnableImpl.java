package com.atguigu.volatileLearn;

public class RunnableImpl implements Runnable{
    private volatile boolean flag = true;
    
    @Override
    public void run() {
        m();
    }
    
    private void m(){
        System.out.println("开始执行");
        while(flag){
        
        }
        System.out.println("结束执行");
    }
    
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
