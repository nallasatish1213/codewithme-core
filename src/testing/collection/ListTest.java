package testing.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListTest {

    // Sorting techniques solution
    //1,2,

    public static void main(String[] args) {
        List<Student> students = List.of(new Student(101, "Raghav", "sompeta", "MPC", 438),
                new Student(201, "Sija", "kolam", "BIPC", 432),
                new Student(205, "Harish", "mandasa", "BIPC", 438),
                new Student(103, "Palavi", "palasa", "MPC", 467),
                new Student(301, "rajesh", "haripuram", "HEC", 487),
                new Student(330, "latha", "sompeta", "HEC", 445),
                new Student(110, "Adash", "mandasa", "MPC", 459)); 


        /*
        * without comparable interface
        *
        * solution: 1
        *  Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        studentList.stream().forEach(s->{
            System.out.println(s);
        });
        *
        *
        *
        * */

        /*
        Soultion: 2
                please create custome comparator clase implement compare method as per basic logic
                and assign to sort method

        studentList.stream().sorted(new StudentSorts()).forEach(s->{
            System.out.println(s);
        });

        soultion:3
         studentList.sort(Comparator.comparing(a->a.studId));
        studentList.stream().forEach(s->{
            System.out.println(s);
        });
        */


        students.stream().sorted(Comparator.comparing(a -> a.studId, Comparator.reverseOrder()))
                .forEach(s -> {
                    System.out.println(s);
                });


    }


}
