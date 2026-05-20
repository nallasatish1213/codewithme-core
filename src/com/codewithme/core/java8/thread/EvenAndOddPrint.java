package com.codewithme.core.java8.thread;

public class EvenAndOddPrint extends Thread {
     Object object;

     static int i=1;
    public EvenAndOddPrint(Object object){
        this.object=object;
    }

    @Override
    public void run() {
        while(i<=10){
            if(i%2==0 && Thread.currentThread().getName().equals("even")){
                synchronized (object){
                    try {
                        System.out.println(Thread.currentThread().getName() + ": " +i);
                        i++;
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }else {
                if (i%2 !=0 && Thread.currentThread().getName().equals("odd")){
                    synchronized (object){
                        System.out.println(Thread.currentThread().getName() + ": " +i);
                        i++;
                        object.notify();

                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Object o=new Object();
        EvenAndOddPrint even=new EvenAndOddPrint(o);
        EvenAndOddPrint odd=new EvenAndOddPrint(o);

        Thread t1=new Thread(even,"even");
        t1.start();
        Thread t2=new Thread(odd,"odd");
        t2.start();


    }
}
