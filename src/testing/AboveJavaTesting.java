package testing;

import testing.collection.Student;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class AboveJavaTesting {
        //MPC: 101,BIPC: 201,HEC: 301
    public static void main(String[] args) {
        List<Student> students=List.of(new Student(101,"Raghav","sompeta","MPC",438),
                new Student(201,"Srija","kolam","BIPC",432),
                new Student(205,"Harish","mandasa","BIPC",438),
                new Student(103,"Palavi","palasa","MPC",467),
                new Student(301,"rajesh","haripuram","HEC",487),
                new Student(330,"latha","sompeta","HEC",445),
                new Student(110,"Adash","mandasa","MPC",459),
                 new Student(312,"rajesh kumar","palasa","HEC",356),
                new Student(105,"lalith","sompeta","MPC",423),
                new Student(106,"Avoy","palasa","BIPC",401),
                new Student(320,"somesh","sompeta","BIPC",439),
                new Student(115,"githa","palasa","MPC",389));




        Map <String, Long> cityDetails=students.stream().collect(Collectors.groupingBy(Student:: getCity,Collectors.counting()));
       // System.out.println(STR."City count: \{cityDetails}");

        // city with list of student details
        Map <String, List<Student>> cityWithStudentDetails = students.stream().collect(Collectors.groupingBy(Student::getCity,Collectors.toList()));
      //  System.out.println(STR."List of Student in city without order: \{cityWithStudentDetails}");

        // cith and gropping by marks
        Map<String, Map<Integer, List<Student>>> studentDetails = students.stream().collect(Collectors.groupingBy(Student::getCity,Collectors.groupingBy(Student::getMarks)));
      //  System.out.println(STR."List city and List marks: \{studentDetails}");

        Map cityWithMarks=students.stream().collect(Collectors.groupingBy(Student::getCity,Collectors.mapping(Student::getMarks,
                Collectors.reducing((a,b)->a>b?a:b))));
       // System.out.println(STR."List of Student in city and only marks: \{cityWithMarks}");

        Map deptWithMark=students.stream().collect(Collectors.groupingBy(Student::getDept,
                Collectors.maxBy(Comparator.comparing(Student::getMarks))));

      //  System.out.println(STR."List of Student in dept  and only mark: \{deptWithMark}");

        Map deptWithMarks=students.stream().collect(Collectors.groupingBy(Student::getDept,
                Collectors.maxBy((a,b)->a.getMarks().compareTo(b.getMarks()))));

        System.out.println(STR."List of Student in dept  and only marks: \{deptWithMarks}");

        Map deptWithNthMarks=students.stream().collect(Collectors.groupingBy(Student::getDept, LinkedHashMap::new,
              Collectors.reducing(BinaryOperator.maxBy((a,b)->a.getMarks().compareTo(b.getMarks())))
                ));
        System.out.println(deptWithNthMarks);
    }


}
