package com.atguigu.bufferedWriterAndBufferedReader;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        read();
    }
    
    public static void write() throws IOException {
        FileWriter fw = new FileWriter("out.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("BufferedWriter写入");
        bw.newLine();
        bw.write("第二行");
        bw.flush();
        bw.close();
    }
    
    public static void read() throws IOException{
        FileInputStream fis = new FileInputStream("out.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bis = new BufferedReader(isr);
        System.out.println(bis.readLine());
        char[] arr = new char[1024];
        int r;
        while((r = bis.read(arr))!=-1){
            System.out.println(new String(arr,0,r));
        }
        System.out.println(bis.readLine());
    
        bis.close();
    }
}
