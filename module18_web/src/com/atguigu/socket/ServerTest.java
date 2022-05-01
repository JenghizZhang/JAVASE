package com.atguigu.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket accept = serverSocket.accept();
        System.out.println(accept);
        InputStream inputStream = accept.getInputStream();
        byte[] arr = new byte[1024];
        int r = 0;
        r = inputStream.read(arr);
        System.out.print(new String(arr, 0, r));
        
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("收到".getBytes());
        
        accept.close();
        serverSocket.close();
    }
}
