package com.codewithme.core.java8.funInterface;

@FunctionalInterface
public interface Upi {
   public abstract  void payNow(double payAmount);

   default double getThroughUpi(){
       return 0.2;
   }

   static void getUpi(){
       System.out.println("static method in Functional Interface");
   }

}
