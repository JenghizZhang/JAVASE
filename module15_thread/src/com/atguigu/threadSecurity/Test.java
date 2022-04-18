package com.atguigu.threadSecurity;

class BuyTicket implements Runnable {
    private int ticketNum = 100;
    public Object o = new Object();
    
    public int getTicketNum() {
        return ticketNum;
    }
    
    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }
    
    private synchronized void sell() {
        // synchronized (o){
        // System.out.println("现在还有这么多张" + ticketNum);
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (ticketNum > 0) {
            System.out.println(Thread.currentThread().getName() + "出售第" + ticketNum);
            ticketNum--;
        } else {
            System.exit(0);
        }
        // }
    }
    

    
    @Override
    public void run() {
        while (true) {
            sell();
        }
    }
}

public class Test {
    public static void main(String[] args) {
        BuyTicket ticket = new BuyTicket();
        Thread t0 = new Thread(ticket);
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        
        t0.start();
        t1.start();
        t2.start();
    }
}
