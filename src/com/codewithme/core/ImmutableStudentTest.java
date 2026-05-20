package com.codewithme.core;

import com.codewithme.core.collection.Address;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ImmutableStudentTest {


    public static void main(String[] args) {
        List<String> mobiles= Arrays.stream(new String[]{"324","432"}).collect(Collectors.toList());
        Student s1=new Student(101,"satish", Date.from(Instant.now()),mobiles,
                new Address("hydarabad","500090"));

        s1.getAddress().setCity("pune");

        System.out.println(s1);

    }
}
