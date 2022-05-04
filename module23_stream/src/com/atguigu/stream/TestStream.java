package com.atguigu.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStream {
    @Test
    public void testCreate() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> stream1 = list.stream();
        
        int[] arr = {1, 2, 3};
        IntStream stream2 = Arrays.stream(arr);
        
        Stream<String> stream3 = Stream.of("1", "2");
        
        Stream<Integer> stream4 = Stream.iterate(1, num -> num + 1);
        stream4.forEach(System.out::println);
    }
    
    @Test
    public void testMid() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        // stream.filter(i -> i % 2 == 0).forEach(System.out::println);
        // Stream.of(1, 2, 3, 4, 5, 6)
        //         .filter(i -> i % 2 == 0)
        //         .forEach(System.out::println);
        
        // stream.distinct().forEach(System.out::println);
        
        // stream.limit(3).forEach(System.out::println);
        
        // stream.skip(3).forEach(System.out::println);
        
        // stream.peek(System.out::println).forEach(System.out::println);
        
        // stream.sorted((a,b)->b-a).forEach(System.out::println);
        
        stream.map(i -> ++i).forEach(System.out::println);
    }
    
    @Test
    public void testEnd() {
        Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6).stream();
        // System.out.println(stream.allMatch(i -> i <= 10));
        // System.out.println(stream.anyMatch(i -> i < 2));
        // Optional<Integer> first = stream.findAny();
        // System.out.println(first.get());
        // System.out.println(stream.max(Integer::compareTo).get());
        // Optional<Integer> reduce = stream.reduce((a, b) -> a + b);
        // System.out.println(reduce.get());
        // Integer reduce = stream.reduce(0, (a, b) -> a + b);
        // System.out.println(reduce);
        // System.out.println(stream.reduce((a, b) -> a > b ? a : b));
    
        List<Integer> collect = stream.map(a -> a + 1).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
