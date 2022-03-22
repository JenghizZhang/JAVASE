package com.atguigu.javase.array.exe;

public class ArrayExe07Yanghui {
    public static void main(String[] args) {
        int[][] yanghui = new int[10][];
        
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
            for (int j = 0; j < yanghui[i].length; j++) {
                if (j == 0 || j == i) {
                    yanghui[i][j] = 1;
                } else {
                    yanghui[i][j] = yanghui[i - 1][j] + yanghui[i - 1][j - 1];
                }
                // System.out.print("yanghui[" + i + "][" + j + "] = " + yanghui[i][j]);
                System.out.print("" + yanghui[i][j]+'\t');
            }
            System.out.println("\n");
        }
    }
}
