package com.atguigu.optional;

import org.junit.Test;

import java.util.Optional;

public class TestOptional {
    @Test
    public void testCreate() {
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);
        
        Optional<String> opt = Optional.of("a");
        System.out.println(opt.get());
        
        Optional<Object> nullable = Optional.ofNullable(null);
        System.out.println(nullable);
    }
    
    @Test
    public void testGetValue() {
        Optional<String> opt = Optional.ofNullable("123");
        // Optional<String> opt = Optional.ofNullable(null);
        // String s = opt.get();
        // System.out.println(s);
        
        // System.out.println(opt.orElse("q"));
        
        // System.out.println(opt.orElseGet(() -> "qwe"));
        
        // String s = opt.orElseThrow(() -> new RuntimeException("没有元素"));
        // System.out.println(s);
        
        // System.out.println(opt.isEmpty());
        
        // opt.ifPresent(System.out::println);
        Optional<Integer> integer = opt.map(Integer::parseInt);
        System.out.println(integer);
    }
    
    @Test
    public void testOptionalAll() {
        //		Boy boy = new Boy("张三",null);
        Boy boy = new Boy("张三", new Girl("翠翠"));
        Optional<Girl> girlFriend = Optional.ofNullable(boy.getGirlFriend());
        Optional.of(girlFriend.orElse(new Girl("嫦娥"))).ifPresent(g -> System.out.println(g));
    }
    
}

class Girl {
    private String name;
    
    public Girl(String name) {
        super();
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Girl [name=" + name + "]";
    }
    
}

class Boy {
    private String name;
    private Girl girlFriend;
    
    public Boy(String name, Girl girlFriend) {
        super();
        this.name = name;
        this.girlFriend = girlFriend;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Girl getGirlFriend() {
        return girlFriend;
    }
    
    public void setGirlFriend(Girl girlFriend) {
        this.girlFriend = girlFriend;
    }
    
    @Override
    public String toString() {
        return "Boy [name=" + name + ", girlFriend=" + girlFriend + "]";
    }
    
}
