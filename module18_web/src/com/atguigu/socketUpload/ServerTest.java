package com.atguigu.socketUpload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ServerTest {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        
        InputStream inputStream = socket.getInputStream();
        
        byte[] arr = new byte[1024];
        int r = 0;
        FileOutputStream fos = new FileOutputStream("/Users/yunsongzhang/Desktop/1.avi");
        while ((r = inputStream.read(arr)) != -1) {
            fos.write(arr);
        }
    
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("上传成功".getBytes());
        
        fos.close();
        socket.close();
        serverSocket.close();
    }
}
