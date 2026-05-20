package com.codewithme.core.java8.thread;

public class ManualThreadProcess extends Thread {

    /* suppose there is one or more task executing parallel
    * Load application:
    * verification of credit score
    * verification employment
    * account history
    * */

    /* what is disadvantage of manual thread process
    *  1: Exception handling
    *  2: Thread/resource management like create->call->destroy
    * */

    public static void main(String[] args) throws InterruptedException {

        Thread t1=new Thread( ()->
        {
            System.out.println(10/0);

            System.out.println("Credit score verification");});
        Thread t2=new Thread( ()-> System.out.println("Employment verification")
        );
        t1.start();;
        t2.start();
        t1.join();
        t2.join();

        System.out.println("all verification done successfully ");

    }
}
