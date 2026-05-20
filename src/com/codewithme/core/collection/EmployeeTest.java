package com.codewithme.core.collection;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee=new Employee(121,12134,"satish");
        Employee employee1=new Employee(121,12134,"satish");
        Employee employee2=new Employee(123,12134,"satish2");

        /* if you won't implement hashcode and equal method
        then it will call to object class hashcode/equal method
        employee reference always call to toString method it will hexString
        class name@hexString of hashcode
         */

        System.out.println(employee.getUniqeId());
        System.out.println(employee1.getUniqeId());
        System.out.println(employee2.getUniqeId());
        System.out.println(employee == employee2);
        System.out.println(employee == employee1);
        System.out.println(employee.hashCode());
        System.out.println(employee1.hashCode());
        System.out.println(employee.hashCode() == employee1.hashCode());
        System.out.println(employee.getUniqeId().equals( employee1.getUniqeId()));
    }
}
