package com.atguigu.lambda;

import org.junit.Test;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestLambda {
    @Test
    public void testFunction() throws Exception {
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "线程运行了");
        }).start();
    }
    
    @Test
    public void testCalculator() throws Exception {
        CalculatorManager.invokeCalculator(3, 4, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });
        
        CalculatorManager.invokeCalculator(3, 4, (int a, int b) -> a + b);
    }
    
    @Test
    public void testConsumer() {
        LambdaManager.useConsumer("qwe", System.out::println);
    }
    
    @Test
    public void testSupplier() {
        LambdaManager.useSupplier(() -> "123");
    }
    
    @Test
    public void testPredicate() {
        LambdaManager.usePredicate("234", 234, (String s, Integer i) -> Integer.parseInt(s) == i);
    }
    
    @Test
    public void testFunc() {
    //     LambdaManager.userFunction("qwe", (String s) -> s + "123");
    // }
        LambdaManager.userFunction("qwe", String::new);
    }
    
    @Test
    public void testList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        
        set.removeIf(v -> v.equals("a"));
        set.forEach(v -> System.out.println(v));
        
        /*set.forEach(s -> System.out.println(s));
        
        
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");
        map.put("e", "5");
        // map.replaceAll((a, b) -> b + 1);
        map.replaceAll((key, value) -> key.equals("a") ? value + "JavaWeb" : value);
        map.forEach((key, value) -> System.out.println(key + value));*/
    }
    
    @Test
    public void testJdkSupplier() {
        Stream.generate(Math::random).forEach(System.out::println);
    }
    
    @Test
    public void testOpEmp() {
        HashMap<Integer, Employee> map = new HashMap<>();
        Employee a = new Employee(1, "a", 1.1);
        Employee b = new Employee(2, "b", 2.1);
        map.put(a.getId(), a);
        map.put(b.getId(), b);
        
        map.forEach((integer, employee) -> System.out.println(employee));
        
        map.replaceAll(((integer, employee) -> {
            if (employee.getSalary() > 2.0) {
                employee.setSalary(2);
            }
            return employee;
        }));
        map.forEach((integer, employee) -> System.out.println(employee));
    }
    
    @Test
    public void testEmployeeManagement() {
        EmployeeManagement em = new EmployeeManagement();
        List<Employee> employees = em.findNot(e -> e.getSalary() > 2);
        employees.forEach(e -> System.out.println(e));
    }
    
    @Test
    public void testUseMethod() {
        String[] arr = {"Hello", "java", "chai"};
        Arrays.sort(arr, String::compareToIgnoreCase );
    
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void testConstructor(){
    }
}

class EmployeeManagement {
    List<Employee> all = new ArrayList<>();
    
    public EmployeeManagement() {
        Employee a = new Employee(1, "a", 1.1);
        Employee b = new Employee(2, "b", 2.1);
        
        all.add(a);
        all.add(b);
    }
    
    public List<Employee> findNot(Predicate<Employee> predicate) {
        all.removeIf(predicate);
        return all;
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;
    
    public Employee(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public Employee() {
        super();
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
    
}
