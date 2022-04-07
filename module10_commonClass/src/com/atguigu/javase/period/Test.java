package com.atguigu.javase.period;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Test {
    public static void main(String[] args) {
        between();
        int i = Integer.parseInt("123");
        // Integer integer1 = new Integer("123");
        Integer integer = Integer.valueOf("123");
        System.out.println("i = " + integer.intValue());
    }
    
    public static void between(){
        LocalDate n1 = LocalDate.now();
        LocalDate n2 = LocalDate.of(1998, 03, 04);
        Period between = Period.between(n2, n1);
        System.out.println("between.getYears() = " + between.getYears());
        System.out.println("between.getMonths() = " + between.getMonths());
        System.out.println("between.getDays() = " + between.getDays());
    }
    
    public static void timeBetween(){
        LocalDateTime n1 = LocalDateTime.now();
        LocalDateTime n2 = LocalDateTime.of(2021, 4, 3, 18, 32, 21);
        Duration between = Duration.between(n1, n2);
        between.toDays();
        between.toMinutes();
    }
}
