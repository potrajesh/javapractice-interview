package com.java8.strem;

import com.collections.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b","c","d","e");
        Stream<String> sm = list.stream();
        List<String> collect = sm.collect(Collectors.toList());
       // System.out.println(collect.get(0));
        //operations on stream
        //1.intermediate operations :
        //Intermediate operations are operations that transform a stream into another stream
        // --> filter(),map(),flatMap(), distinct(), peek(), limit(), skip();
        //2. terminal operations--> count(),collect(),foreach()

        //predicate method: its accept single argument that return bollean value.
        //predicate is a interface,it is a functional interface.its contains test() method.

        List<String> collect1 = list.stream().filter(s -> s.length() > 1).collect(Collectors.toList());
       // String first = collect1.getFirst();
        //System.out.println(first);
           // age greaterthan 30 we need  sum of salary.

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,12,"raj",20000,"IT"));
        employees.add(new Employee(4,32,"giri",20000,"CSE"));
        employees.add(new Employee(1,122,"tulasi",40000,"ECE"));

        double employeeStream = employees.stream().filter(emp->emp.getAge()>30)
                .mapToDouble(Employee::getSalary).sum();

       // System.out.println("salary-->"+employeeStream);
        //min
        Employee employee = employees.stream().min(Comparator.comparing(Employee::getAge)).get();
       // System.out.println(employee);
        //avg

        double asDouble = employees.stream().mapToDouble(Employee::getAge).average().getAsDouble();
        System.out.println(asDouble);

    }

}

