package com.tdc.cleancode.lambda_expressions.before;

import com.tdc.cleancode.Employee;

import java.util.*;

public class ComparationJava7 {

    public void nameComparationJava7(){
        List<Employee> employees = new ArrayList<>();

        this.setEmployees(employees);

        Collections.sort(employees, new Comparator<Employee>() {
                @Override
                public int compare(Employee employee1, Employee employee2) {
                    return employee1.getName().compareTo(employee2.getName());
                }
            });
        System.out.println(employees.toString());
    }

    private void setEmployees(List<Employee> employees){

        Employee employee1 = new Employee();
        employee1.setName("Paula Santana");
        employee1.setAge("30");
        employee1.setSalary("100.00");
        employees.add(employee1);

        Employee employee2 = new Employee();
        employee2.setName("Rafael Benevides");
        employee2.setAge("43");
        employee2.setSalary("100000.00");
        employees.add(employee2);

        Employee employee3 = new Employee();
        employee3.setName("Roan Brasil");
        employee3.setAge("35");
        employee3.setSalary("1.00");
        employees.add(employee3);

        Employee employee4 = new Employee();
        employee4.setName("Otavio Santana");
        employee4.setAge("32");
        employee4.setSalary("50000.00");
        employees.add(employee4);
    }

    public static void main(String[] args) {
        ComparationJava7 comparationJava7 = new ComparationJava7();
        comparationJava7.nameComparationJava7();
    }
}
