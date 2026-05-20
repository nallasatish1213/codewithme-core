package testing.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomFailFastThreadMap extends Thread {

 //  static  Map<Integer,String> firstThread=new HashMap<>();
    static  Map<Integer,String> firstThread=new ConcurrentHashMap<>();

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            firstThread.put(123,"t2");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        firstThread.put(121,"t1");
        firstThread.put(122,"t2");
        firstThread.put(124,"t2");

        CustomFailFastThreadMap thMap=new CustomFailFastThreadMap();
        thMap.start();

        for(Map.Entry obj:firstThread.entrySet()){
            System.out.println(obj.getKey()+ ":"+ obj.getValue());

            Thread.sleep(1000);
        }

    }
}
