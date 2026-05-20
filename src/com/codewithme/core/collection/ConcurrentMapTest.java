package com.codewithme.core.collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapTest extends Thread {

    /*
    Implementation Requirements:
        The default implementation executes the Runnable task that the Thread was created with.
         If the thread was created without a task then this method does nothing.
    * */
   // static Map<Integer,String> map=new HashMap<>();
    static Map<Integer,String> map=new ConcurrentHashMap<>();

    @Override
    public void run() {
        map.put(1,"ritesh");
      /* try{
           Thread.sleep(10);
           map.put(1,"ritesh");
       }catch (InterruptedException ie){
           ie.fillInStackTrace();
       }*/
    }

    public static void main(String[] args) throws InterruptedException {

        map.put(2,"satish2");
        map.put(4,"satish4");
        map.put(5,"satish5");
        map.put(3,"satish3");
        //map.put(null,"null");
      //  System.out.println(map);
        ConcurrentMapTest test=new ConcurrentMapTest();
       // Thread t1=new Thread(test);
        test.start();
        test.join();



        /*
        //below code has been throws ConcurrentModificationException because if it.remove() method if you use HashMap
        Iterator it=map.keySet().iterator();
        if(it.hasNext()){
            Integer key=(Integer) it.next();
            map.put(7,"satish7");
            it.remove();
            System.out.println(key+": "+ map.get(key));
        }
         */

       for(Integer num: map.keySet()){
           System.out.println(num+ ": "+ map.get(num));
       }
    }
}
