package com.atguigu.socketUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8080);
        
        FileInputStream fis = new FileInputStream("/Users/yunsongzhang/Desktop/尚硅谷/Java/第一阶段：JavaSE核心基础/day21【it自学网-www.gyfedu.com】/视频/12.使用反射获取类的相关信息【it自学网-www.gyfedu.com】.avi");
        byte[] arr = new byte[1024];
        int r = 0;
        
        OutputStream outputStream = socket.getOutputStream();
        while ((r = fis.read(arr)) != -1) {
            outputStream.write(arr, 0, r);
        }
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        r = inputStream.read(arr);
        System.out.println(new String(arr, 0, r));
        
        fis.close();
        socket.close();
    }
}
