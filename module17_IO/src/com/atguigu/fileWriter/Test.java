package com.atguigu.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("out.txt");
        fw.write("谢谢");
        fw.close();
    }
}
