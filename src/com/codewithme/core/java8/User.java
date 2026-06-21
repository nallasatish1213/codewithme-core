package com.codewithme.core.java8;

public class User {

    Integer value;
    String name;

    public User(Integer value, String name){
        this.value=value;
        this.name=name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setValue(Integer value){
        this.value=value;
    }

    public Integer getValue(){
        return value;
    }

    public String getName(){
        return name;
    }
}
