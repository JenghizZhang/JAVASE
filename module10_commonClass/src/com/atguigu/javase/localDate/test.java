package com.atguigu.javase.localDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class test {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDate of = LocalDate.of(2022, 04, 01);
        System.out.println(of);
    }
}
