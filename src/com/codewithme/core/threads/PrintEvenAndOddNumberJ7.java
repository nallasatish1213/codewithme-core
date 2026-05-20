package com.codewithme.core.threads;

public class PrintEvenAndOddNumberJ7 implements Runnable{

    static int count=1;
    Object object;

    PrintEvenAndOddNumberJ7(Object object){
        this.object=object;
    }


    @Override
    public void run() {

        while(count <= 10) {

            if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (object) {
                    System.out.println(Thread.currentThread().getName() + ": " + count);
                    count++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (object) {
                    System.out.println(Thread.currentThread().getName()+" :"+count);
                    count++;
                    object.notify();
                }
            }
        }
    }


    public static void main(String[] args) {
        Object o1=new Object();
        Runnable r1=new PrintEvenAndOddNumberJ7(o1);
        Runnable r2=new PrintEvenAndOddNumberJ7(o1);
        new Thread(r1,"even").start();
        new Thread(r2,"odd").start();
    }

}
