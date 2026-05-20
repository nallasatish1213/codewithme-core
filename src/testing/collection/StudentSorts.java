package testing.collection;

import java.util.Comparator;

public class StudentSorts implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.studId < o2.studId){
            return -1;
        }else if(o1.studId > o2.studId){
            return 1;
        } else{
            return 0;
        }
    }

}
