package testing;

import com.codewithme.core.java8.Employee;
import com.codewithme.core.java8.funInterface.EmployeeTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q2Testing {
    public static void main(String[] args) {

        List<Employee> listEmp = EmployeeTest.getEmployeeList();

        listEmp.stream().sorted(Comparator.comparing(Employee::getCity)
                .thenComparing(Comparator.comparing(Employee::getName).reversed())).forEach(emp ->
                {
                    //    System.out.println(emp);
                }
        );

        List<Q2Employee> employees = Arrays.asList(
                new Q2Employee("Delhi", "Amit", 30),
                new Q2Employee("Mumbai", "Zara", 25),
                new Q2Employee("Delhi", "Ravi", 28),
                new Q2Employee("Mumbai", "Anil", 35),
                new Q2Employee("Chennai", "Priya", 32)
        );

        employees.stream().sorted(Comparator.comparing(Q2Employee::getCity)
                .thenComparing(Comparator.comparing(Q2Employee::getName).reversed()));

        for(Q2Employee emp:employees){
            System.out.println(emp);
        }

    }
}
