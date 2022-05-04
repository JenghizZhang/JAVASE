package com.atguigu.lambda;

import java.util.function.*;

public class LambdaManager {
    public static void useConsumer(String s, Consumer<String> consumer) {
        consumer.accept(s);
    }
    
    public static void useSupplier(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }
    
    public static void usePredicate(String s, Integer i, BiPredicate<String, Integer> biPredicate) {
        System.out.println(biPredicate.test(s, i));
    }
    
    public static void userFunction(String s, Function<String,String> func){
        String result = func.apply(s);
        System.out.println("result = " + result);
    }
}
