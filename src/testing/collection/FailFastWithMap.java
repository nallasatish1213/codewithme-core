package testing.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class FailFastWithMap {

    public static void main(String[] args) {
        //   Map<Integer, String> map = new HashMap<>();

        Map<Integer, String> map = new ConcurrentHashMap<>();

        map.put(111, "mobile");
        map.put(112, "laptop");

      /*  Map<Integer, String> map = new HashMap<>();
          map.put(111, "mobile");
          map.put(112, "laptop");
        Iterator mapIte = map.keySet().iterator();
        while (mapIte.hasNext()) {
            System.out.println(mapIte.next());
            map.put(454,"C310 Cam");
        }*/
        Iterator mapIte = map.keySet().iterator();
        while (mapIte.hasNext()) {
            map.put(454, "C310 Cam");
            Integer key = (Integer) mapIte.next();
            System.out.println(key + ": " + map.get(key));


        }
    }
}
