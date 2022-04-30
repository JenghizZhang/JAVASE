package com.atguigu.outputStreamWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test {
    public static void main(String[] args) throws IOException {
        writeGBK();
    }
    
    public static void write() throws IOException {
        FileOutputStream fos = new FileOutputStream("out.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        osw.write("尝试使用OutputStreamWriter的write方法");
        osw.flush();
        osw.close();
    }
    
    public static void writeGBK() throws IOException{
        FileOutputStream fos = new FileOutputStream("out.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
        osw.write("尝试使用OutputStreamWriter的write方法");
        osw.flush();
        osw.close();
    }
}
