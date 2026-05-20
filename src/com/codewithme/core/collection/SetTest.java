package com.codewithme.core.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetTest {
    /*
    *1:  will it duplicate allow...? yes it allow duplicate if you won't implement equal/hashcode method for custom object
    *2: suppose if you add two value is same name then which will be print: i cannot ensure it but either one of the print it (prog 2 &3)
    * 3: if null value is exist in set collection then it will print first later remaining value will be print it(prog3)
    * 4: concurrency modification exception
    * 5: fail fast (ArrayList ,HashSet, HashMap) vs fail safe (CopeOnWriteArrayList,CopeOnWriteArraySet, ConcurrenctHashMap)
    * 6: mode count
    * 7: ArrayList, HashSet and HashTable while iterate actual collection but where as a copeOnWriteArrayList/Set
    * it will clone it
    * */
    public static void main(String[] args) {
       /*
        //prog1
        Set<String> set=new HashSet<>();
        set.add("satish");
        set.add("satish");
       // System.out.println(set);

        //prog2
        Set<String> setNull=new HashSet<>();
        setNull.add(null);
        setNull.add("null");
        setNull.add(null);
       // System.out.println(setNull);

        //prog3
        Set<String> setNullPreference=new HashSet<>();
        setNullPreference.add("satish");
        setNullPreference.add("akash");
        setNullPreference.add("satish");
        setNullPreference.add(null);
        setNullPreference.add("null");
        setNullPreference.add(null);
        setNullPreference.add("null1");
     //   System.out.println(setNullPreference);

        */

        Set<String> failFast=new HashSet();
        failFast.add("raavi");
        failFast.add("satish");
        failFast.add("zanith");
        failFast.add("null");

        Iterator<String> iterator=failFast.iterator();
        if(iterator.hasNext()){
            String names= iterator.next();
            System.out.println(names);
            failFast.add("null1");
            iterator.remove();
        }
    }
}
