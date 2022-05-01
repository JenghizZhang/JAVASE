package com.atguigu.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8080);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好".getBytes());
        
        InputStream inputStream = socket.getInputStream();
        byte[] arr = new byte[1024];
        int r = 0;
        while((r = inputStream.read(arr))!=-1){
            System.out.print(new String(arr,0,r));
        }
        
        socket.close();
    }
}
