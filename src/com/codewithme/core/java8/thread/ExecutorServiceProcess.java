package com.codewithme.core.java8.thread;

import java.util.concurrent.*;

public class ExecutorServiceProcess {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executor= Executors.newFixedThreadPool(2);
       Future<String> creditScore  = executor.submit(()->{
            System.out.println("Credit Score verification");

                Thread.sleep(100);
            return "CS Verification done";
        });

        Future<String> empVarify  = executor.submit(()->{
            System.out.println("Employment verification");
            Thread.sleep(100);
            return "Employment Verification done";
        });

        //we can do it this way but we can't join the future object
        String cs=creditScore.get(); // it will block the first future object (i mean once complete the future1 object then only it goes to second future object)
        String emp=empVarify.get();
        System.out.println(cs+"  :"+emp);

        executor.shutdown(); // it is good practice to call shutdown method

    }
}
