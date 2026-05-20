package com.codewithme.core.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompalableStudent {

    public static void main(String[] args) {
        Student s1=new Student(111,"satish");
        Student s2=new Student(112,"akash");
        Student s3=new Student(113,"rajith");
        Student s4=new Student(111,"rakesh");

        List list=new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        Collections.sort(list);
        System.out.println(list);

    }
}
