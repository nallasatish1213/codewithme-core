package com.codewithme.core.threads;

import java.util.concurrent.*;

public class CompatableFetureTesting {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Void> feture1=forkJoinPoolCF();
        CompletableFuture<Void> feture2=executorServicePoolCF();
        feture1.get();
        feture2.get();

    }

    public static CompletableFuture<Void> forkJoinPoolCF(){
        return CompletableFuture.runAsync(()->{
            int i=1;
            while(i<=5){
                System.out.println(Thread.currentThread().getName()+ ":"+ i);
                i++;
            }
        });
    }

    public static CompletableFuture<Void> executorServicePoolCF(){
        ExecutorService service= Executors.newFixedThreadPool(2);
        return CompletableFuture.runAsync(()->{
            int i=10;
            while(i>=6){
                System.out.println(Thread.currentThread().getName()+ ":"+ i);
                i--;
            }
        }, service);

    }
}
