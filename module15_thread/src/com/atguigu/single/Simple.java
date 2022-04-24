package com.atguigu.single;

public class Simple {
    // private static Simple s = new Simple();
    private static Simple s = null;
    
    public static Simple getInstance() {
        if (s == null)
            synchronized (Simple.class) {
                if (!(s instanceof Simple)) {
                    s = new Simple();
                }
            }
        return s;
    }
    
    private Simple() {
    
    }
}
