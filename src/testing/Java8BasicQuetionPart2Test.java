package testing;

import testing.collection.Student;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Java8BasicQuetionPart2Test {

    public static void main(String[] args) {

        List<Student> students=List.of(new Student(101,"Raghav","sompeta","MPC",438),
        new Student(201,"Sija","kolam","BIPC",432),
                new Student(205,"Harish","mandasa","BIPC",438),
        new Student(103,"Palavi","palasa","MPC",467),
        new Student(301,"rajesh","haripuram","HEC",487),
        new Student(330,"latha","sompeta","HEC",445),
        new Student(110,"Adash","mandasa","MPC",459));

        Map cityWithNames  = students.stream().collect(Collectors.groupingBy(Student::getCity, Collectors.mapping(s->s.getName(),Collectors.toList())));
        System.out.println(cityWithNames);

        Map deptWithNames  = students.stream().collect(
                Collectors.groupingBy(Student::getDept,Collectors.maxBy(((a,b)->a.getMarks()>b.getMarks()? a.getMarks() : b.getMarks()))));

        Map deptWithNames1  = students.stream().collect(
                Collectors.groupingBy(Student::getDept,
                        Collectors.mapping(s->s.getMarks(),Collectors.reducing((a,b)->a>b?a:b))));
        System.out.println(deptWithNames);
        System.out.println(deptWithNames1);

        Comparator decOrder=Comparator.comparing(Student::getMarks);
        Map<String, Object> deptWithNames2  = (Map<String, Object>) students.stream().collect(
                Collectors.groupingBy(Student::getDept, LinkedHashMap::new,
                        Collectors.reducing(BinaryOperator.maxBy(decOrder))));

        System.out.println(deptWithNames2);

       Map deptWithNames3= students.stream().collect(Collectors.groupingBy(Student::getDept,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(
                                        Comparator.comparing(Student::getMarks))
                                ,Optional::get)));
        System.out.println(deptWithNames3);

        nThHightMarks(students,5);

    }

   public static void  nThHightMarks( List<Student> input,int nth){

     Map.Entry<Integer, List<String>> nthHighstMark= input.stream().collect(
                Collectors.groupingBy(Student::getMarks,
                        Collectors.mapping(Student::getName,Collectors.toList())))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(nth-1);
       System.out.println(nthHighstMark);

   }
}
