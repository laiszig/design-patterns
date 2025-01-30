package com.laiszig.prototype.employeePrototype;

import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        //Use the clone method to get the Employee object
        Employees employees2 = (Employees) employees.clone();
        Employees employees3 = (Employees) employees.clone();
        List<String> list = employees2.getEmpList();
        list.add("Seth");
        List<String> list1 = employees3.getEmpList();
        list1.remove("John");

        System.out.println("emps List: " + employees.getEmpList());
        System.out.println("empsNew List: " + list);
        System.out.println("empsNew1 List: " + list1);
    }
}
