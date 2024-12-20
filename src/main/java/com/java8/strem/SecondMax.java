package com.java8.strem;

import com.collections.Employee;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondMax {

    public static void main(String[] args) {
//    public Employee(int id, int age, String name, double salary, String dept) {
        List<Employee> list = Arrays.asList();
        list.add(new Employee(1,23,"test",12.0,"IT"));
        list.add(new Employee(1,33,"test1",12.0,"IT"));
        list.add(new Employee(1,03,"test2",12.0,"IT"));

        list.stream().max(Comparator.comparing(Employee::getAge)).get();
        int average = list.stream().mapToInt(Employee::getAge).sum();
        System.out.println(average);


    }
}
