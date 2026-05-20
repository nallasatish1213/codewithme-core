package testing;

import com.codewithme.core.java8.Employee;
import com.codewithme.core.java8.funInterface.EmployeeTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Q1Testing {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 3, 2, 1};

        Arrays.stream(arr).boxed().distinct().sorted(Comparator.comparing(a->a,Comparator.reverseOrder())).forEach(p->{
         //   System.out.println(p);
        });

        Arrays.stream(arr).boxed().distinct().sorted(Comparator.comparing(a->a,(f,s)->s.compareTo(f))).forEach(p->{
          //  System.out.println(p);
        });

        Arrays.stream(arr).boxed().distinct().sorted(Comparator.comparing(Integer::intValue).reversed()).forEach(i->{
       //     System.out.println(i);
        });

        String[] words={"nalla","working","lenovo laptops","microservice"};

        Arrays.stream(words).sorted()
                .map(space->space.replace(" ", ""))  // this is replacing the space
                .reduce((f,s)-> s.length()>f.length()?s:f)
                .stream().forEach(
                        s -> {
             //               System.out.println(s);
                        }
                );

        List<Employee> list = EmployeeTest.getEmployeeList();
    Map<String, String> nameAndLongCity  = list.stream().collect(Collectors.groupingBy(Employee::getName,
                Collectors.reducing("",Employee::getCity,
                        BinaryOperator.maxBy(Comparator.comparing(String::length)))));

        System.out.println(nameAndLongCity);

    }
}
