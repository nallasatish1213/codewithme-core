package testing.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapNullCheck {
    public static void main(String[] args) {
        Map<Integer,String> firstThread=new HashMap<>();
        firstThread.put(null,"null");
        firstThread.put(null,"0");
        firstThread.put(121,"t1");
        firstThread.put(121,"t2");

        System.out.println(firstThread);
    }
}
