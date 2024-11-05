package com.collections;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("test");
        hs.add("test");
        hs.add("test1");

        Employee employee = new Employee();
        employee.setId(1);
        employee.setAge(12);
        employee.setName("raj");
        employee.setSalary(20000);
        employee.setDept("IT");

        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setAge(12);
        employee1.setName("raj");
        employee1.setSalary(20000);
        employee1.setDept("IT");

        HashSet<Employee> empSet = new HashSet<Employee>();
        empSet.add(employee);
        empSet.add(employee1);
        System.out.println(empSet.size());

        System.out.println(empSet);


    }
}
