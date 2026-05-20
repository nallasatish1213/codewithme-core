package com.codewithme.core.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionNullCheck {

    public static void main(String[] args) {
       /* Set set=new HashSet<String>();
        set.add("oserve");
        set.add("abserve");
        set.add("mull");
        set.add(null);
        System.out.println(set);*/

        Map<String,String> map=new HashMap<>();
        map.put("a",null);
        map.put(null,null);
        map.put(null,"b"); // if key is null then it will override the key and value we can predit the value bacause of un preserved structure data
        System.out.println(map);
    }
}
