package com.codewithme.core.java8.thread;


import com.codewithme.core.java8.Employee;
import com.codewithme.core.java8.funInterface.EmployeeTest;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CompletableFutureProcess {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFutureProcess process=new CompletableFutureProcess();
        process.runAsyncOwnPool();
        process.runAsyncFolkJoinPool();

    }

    public void runAsyncFolkJoinPool() throws ExecutionException, InterruptedException {
        CompletableFuture runAsync=CompletableFuture.runAsync(()->{
            System.out.println(Thread.currentThread().getName());
            List<Employee> list= EmployeeTest.getEmployeeList();
            System.out.println(list.size());
        });
        runAsync.get();
    }

    public void runAsyncOwnPool() throws ExecutionException, InterruptedException {
        Executor executor= Executors.newFixedThreadPool(2);
        CompletableFuture runAsync=CompletableFuture.runAsync(()->{
            System.out.println(Thread.currentThread().getName());
            List<Employee> list= EmployeeTest.getEmployeeList();
            System.out.println(list.size());
        },executor);

        runAsync.get();
    }
}
