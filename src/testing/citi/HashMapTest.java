package testing.citi;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Satish");
        HashMap map= new HashMap<>();
        map.put(sb,23);
        sb.append("kumar");
        System.out.println(map.keySet()+" "+map.get(sb));

    }
}
