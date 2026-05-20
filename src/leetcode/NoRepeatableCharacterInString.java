package leetcode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NoRepeatableCharacterInString {

    public static void main(String[] args) {
        String s="Ser vices";
        noRepatableChar(s);
      //  noRepatableCharSolution2(s);
    }

    public static void noRepatableChar(String s) {

        Map<Character, Integer> countMap = new LinkedHashMap();

        String values = s.toLowerCase().replace(" ", "");
        for (Character lat : values.toCharArray()) {
            if (countMap.containsKey(lat)) {
                countMap.put(lat, countMap.get(lat) + 1);
            } else {
                countMap.put(lat, 1);
            }
          //  countMap. (countMap.get(lat)+1,1);
        }



        Map.Entry<Character, Integer> maps = countMap.entrySet().stream().filter(map -> map.getValue() == 1).findFirst().get();
        System.out.println(maps);
    }

   public static void  noRepatableCharSolution2(String s){
     String values[]=   s.replace(" ","").toLowerCase().split("");

       Arrays.stream(values)
               .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
                       Collectors.counting()))
                       .entrySet()
                               .stream()
                                       .filter(f->f.getValue()==1).forEach(f->{
                   System.out.println(f);
               });
   }

}
