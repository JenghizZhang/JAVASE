package com.atguigu.javase.exceptionNew;

public class ScoreException extends RuntimeException {
    public ScoreException() {
        super("成绩越界异常");
        
    }
}
