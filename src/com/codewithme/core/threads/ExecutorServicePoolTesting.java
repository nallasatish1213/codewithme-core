package com.codewithme.core.threads;

import java.util.List;
import java.util.concurrent.*;

public class ExecutorServicePoolTesting {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future feture1 = executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(60);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            List.of(1, 2, 3);
        });

        List<Integer> list = (List<Integer>) feture1.get();
        System.out.println("return values: " + list);

        CompletableFuture future = CompletableFuture.runAsync(() -> {
            System.out.println("Executing run method: " + Thread.currentThread().getName());
        });
        future.get();// it also block the thread upto completion of current thread
        future.complete("add some dummy data as per return statement");             // but if you want to complete forcefully then you can use below code

    }
}
