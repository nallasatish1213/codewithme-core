package com.codewithme.core.core;

public class FinalTesting {

    final int val=1;
    final int val2;
   static  final int val3=4;

    FinalTesting(){
        val2=3;
    } //we can assign in constructor as well method also.

    public static void main(String[] args) {
        System.out.println(val3);
    }

     public void method1(){
      System.out.println(val3);
     }
    public void method2(){
     //   this.val2=5; we can't reassign to final variable
        System.out.println(val3);
    }


  
}
