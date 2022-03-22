package com.atguigu.javase.array.exe;
/**
 * 用一个数组存储26个英文字母的小写形式，并遍历显示小写字母以及它对应的大写字母，例如：a->A
 * 提示：ASCII码表
 * */
public class ArrayExe05 {
    public static void main(String[] args) {
        // 创建字符保存26字母
        char[] wordArr = new char[26];
        for (int i = 0; i <= 25; i++) {
            wordArr[i] = (char) (i+97);
            System.out.println("wordArr["+(i+1)+"] = " + wordArr[i]);
        }

    }
}
