package com.codewithme.core.java8.funInterface;

import com.codewithme.core.java8.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> list =getEmployeeList();

    }

    public static List<Employee> getEmployeeList(){
        Employee e1=new Employee(101,"rocky","kerala","800023","8003042422","IT",87);
        Employee e2=new Employee(102,"rejina","kuthu","800025","8003042423","ECE",89);

        Employee e3=new Employee(103,"sworav","hyderabad","530092","8003042434","IT",79);
        Employee e4=new Employee(104,"ramswami","chennai","800023","8003042454","ECE",72);

        Employee e5=new Employee(104,"thiru","kerala","800023","8003042402","EEE",84);
        Employee e6=new Employee(106,"rocky","hyderabad","530065","8003042472","ECE",90);

        Employee e7=new Employee(107,"roshan","vizag","532000","8003043422","IT",85);

        Employee e8=new Employee(107,"satish","hyderabad","530090","8003012422","CSE",92);

        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);
        employeeList.add(e7);
        employeeList.add(e8);
        return employeeList;
    }
}
