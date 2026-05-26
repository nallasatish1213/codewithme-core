package com.codewithme.core.java8.java17;

public class PatternMatching {

    /*
    * java can check the type of an object and extract/cast it automatically
    * */
    public static void main(String[] args) {

    }

    private void  beforeJavaMatching(Object type) {
        //before java 17
       if(type instanceof String){
           String s=(String) type;
           System.out.println(s.toLowerCase());
       }
    }

    private void  afterJavaMatching(Object type) {
        //after java 17
        if(type instanceof String str){ //java will auto boxing automatically
            System.out.println(str.toLowerCase());
        }
    }
}
