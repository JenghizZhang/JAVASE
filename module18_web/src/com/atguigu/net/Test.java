package com.atguigu.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) throws IOException {
        ipMethod2();
    }
    
    public static void ipMethod() throws IOException {
        InetAddress lh = InetAddress.getLocalHost();
        String hostAddress = lh.getHostAddress();
        String hostName = lh.getHostName();
    
        System.out.println(lh);
        System.out.println(hostAddress);
        System.out.println(hostName);
    }
    
    public static void ipMethod2() throws IOException{
        InetAddress byAddress = InetAddress.getByName("www.atguigu.com");
        // InetAddress byAddress = InetAddress.getByAddress("202.108.35.210".getBytes());
        System.out.println("byAddress = " + byAddress);
    }
}
