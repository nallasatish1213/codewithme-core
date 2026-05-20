package com.codewithme.core.threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class PrintEvenAndOddNumberAdvJ8 {

    public static void main(String[] args) {

        //Executor  executor= Executors.newFixedThreadPool(2);

        ExecutorService executor=Executors.newFixedThreadPool(4);
        printNumbers(executor);
        executor.shutdown();

     /*   IntStream.rangeClosed(1,10).forEach(num->{
            CompletableFuture oddCompletableFuture=CompletableFuture.completedFuture(num)
                    .thenApplyAsync(i->{
                        if(i%2!=0){
                            System.out.println(Thread.currentThread().getName()+": "+i);
                        }
                        return num;
                    },executor);
            oddCompletableFuture.join();

            CompletableFuture evenCompletableFuture=CompletableFuture.completedFuture(num)
                    .thenApplyAsync(i->{
                        if(i%2==0){
                            System.out.println(Thread.currentThread().getName()+": "+i);
                        }
                        return num;
                    },executor);
            evenCompletableFuture.join();

        });*/

    }

    public static void printNumbers(ExecutorService service){

        IntStream.rangeClosed(1,10).forEach(num->{
            CompletableFuture oddCompletableFuture = CompletableFuture.completedFuture(num)
                    .thenApplyAsync(a -> {
                        if (a % 2 != 0) {
                            System.out.println(Thread.currentThread().getName() + ": " + a);
                        }
                        return num;
                    }, service);
            oddCompletableFuture.join();

            CompletableFuture evenCompletableFuture=CompletableFuture.completedFuture(num)
                    .thenApplyAsync(i->{
                        if(i%2==0){
                            System.out.println(Thread.currentThread().getName()+": " +i);
                        }
                        return num;
                    },service);
            evenCompletableFuture.join();

        });

    }
}
