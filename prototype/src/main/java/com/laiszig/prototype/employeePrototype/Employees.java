package com.laiszig.prototype.employeePrototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

    private List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }

    public Employees(List<String> empList) {
        this.empList = empList;
    }

    public void loadData() {
        empList.add("John");
        empList.add("Lisa");
        empList.add("Mary");
        empList.add("Peter");
    }

    /**
     * Read all employees from database and put into the list
     */
    public List<String> getEmpList() {
        return empList;
    }

    /**
     * Overridden to provide a deep copy of the employees list
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for(String s : this.getEmpList()) {
            temp.add(s);
        }
        return new Employees(temp);
    }
}
