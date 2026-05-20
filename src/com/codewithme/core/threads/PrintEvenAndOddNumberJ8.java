package com.codewithme.core.threads;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrintEvenAndOddNumberJ8 {

   static Object object;

    public static void main(String[] args) {

     //   IntPredicate evenCondition=i%2==0;

    }

    public static void printValue(IntPredicate condition){
        IntStream.rangeClosed(1,10).filter(condition)
                .forEach(num->execute(num));
    }

    public static void execute(int i) {
        synchronized (object){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                object.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            object.notify();
        }
    }
}
