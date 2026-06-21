package com.codewithme.core.java8;

import java.util.*;
import java.util.stream.Collectors;

public class UserMainTest {

    static void main(String[] args) {
        List<User> users=new ArrayList();
        users.add(new User(500,"user1"));
        users.add(new User(300,"user2"));
        users.add(new User(700,"user1"));
        users.add(new User(800,"user3"));
        users.add(new User(100,"user1"));

        users.stream().collect(Collectors.groupingBy(
                User::getName,Collectors.summingInt(u->u.getValue())
        )).entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getValue,Collections.reverseOrder()))
                .forEach(us->{
                    System.out.println(us.getKey()+" "+ us.getValue());
                });

    }
}
