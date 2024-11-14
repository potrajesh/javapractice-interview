package com.logicalprogrammes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private int id;

    public Employee(int i) {
        this.id=i;
    }
//13 23 73
    public int compareTo(Employee emp) {
        if (this.id == emp.id) {
            System.out.println(this.id);
            return 0;
        }
        if (this.id > emp.id) {
            System.out.println(this.id);
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                '}';
    }

    public static void main(String[] args) {
      List<Employee> employeeList= new ArrayList<>();

        employeeList.add(new Employee(23));
        employeeList.add(new Employee(13));
        employeeList.add(new Employee(73));

        Collections.sort(employeeList);
        System.out.println(employeeList.toString());
    }
}
