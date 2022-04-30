package com.atguigu.outputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        writeByteArrAppend();
    }
    
    public static void writeByteArrAppend() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("2.txt"), true);
            fos.write("\n".getBytes());
            fos.write("追加写入".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        
    }
    
    public static void writeByteArr() throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("2.txt"));
        byte[] bytes = new byte[]{97, 98, 99, 100};
        fos.write(bytes, 2, 1);
        fos.write("你好".getBytes());
        fos.close();
    }
    
    public static void writeByte() throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("1.txt"));
        fos.write(45);
        fos.write(49);
        fos.write(48);
        fos.write(48);
        fos.close();
    }
}
