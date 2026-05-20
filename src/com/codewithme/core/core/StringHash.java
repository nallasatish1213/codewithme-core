package com.codewithme.core.core;

import java.util.HashMap;
import java.util.Map;

public class StringHash {
    public static void main(String[] args) {
        String s1="Aa";
        String s2="BB";
        String s3="AaAa";
        String s4="BBBB";

        System.out.println(s1.hashCode()+": "+ s2.hashCode()+": "+ s3.hashCode()+": "+ s4.hashCode());

        Map<String,Integer> map=new HashMap<>();
        map.put(null,2);
        map.put(null,1);
        map.put("AaAa",4);
        map.put("BBBB",4);

        System.out.println(map);
    }
}
