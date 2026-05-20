package com.codewithme.core.java8;

import com.codewithme.core.java8.funInterface.EmployeeTest;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class AllJava8Functions {

    public static void main(String[] args) {
        List<Employee> list = EmployeeTest.getEmployeeList();

      //key is city but value is full employee object
      Map map = list.stream().collect(Collectors.groupingBy(e->e.getCity(),Collectors.toList()));

      //city with list of employee name
      Map map1 = list.stream().collect(Collectors.groupingBy(e->e.getCity(),Collectors.mapping(Employee::getName,Collectors.toList())));
    //  System.out.println(map1);

      Comparator<Employee> mark=Comparator.comparing(Employee::getMark,Comparator.reverseOrder());
      Map mapList = list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.reducing(BinaryOperator.maxBy(mark))));

      Map mapLists = list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.maxBy(mark)));

        System.out.println(mapLists);

    }
}
