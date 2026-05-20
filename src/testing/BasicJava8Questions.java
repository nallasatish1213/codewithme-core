package testing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BasicJava8Questions {

    public static void main(String[] args) {
        String value="i love my hard work";
        String value1=  value.trim(); // it will remove start/end of the white space
        String strips=value.strip();
        String[] value2=  value.split(""); // it will check where ever space available
        // there will create next line character
        String values= value.replace(" ",""); // it will replace the space

      Map map = Arrays.stream(values.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       // System.out.println(map);

        List<String> morethenOne = Arrays.stream(values.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet().stream()
                        .filter(s->s.getValue()>1)
                        .map(Map.Entry::getKey)
                                .collect(Collectors.toList());
      //  System.out.println(morethenOne);

      Map keywithListValues=  Arrays.stream(values.split(""))
              .collect(Collectors.groupingBy(e->e,Collectors.toList()));
        System.out.println(keywithListValues);

        Arrays.stream(values.split(""))
                .collect(Collectors.groupingBy(e->e,Collectors.toList()))
                        .entrySet().stream()
                        .filter(e->e.getValue().size() > 1)
                                .forEach(System.out::println);
        int[] numbers={43,53,22,67,11,7,84,35};
        // find the max value
        Integer maxVal  = Arrays.stream(numbers).boxed().sorted(Comparator.comparing(i->i,Comparator.reverseOrder()))
                .findFirst().get();
        System.out.println(maxVal);
        // find the min value
        Integer mixVal  = Arrays.stream(numbers).boxed().sorted()
                .findFirst().get();
        System.out.println(mixVal);

        // second-highest number
        Integer secondMaxVal  = Arrays.stream(numbers).boxed().sorted(Comparator.comparing(i->i,Comparator.reverseOrder()))
                .skip(1).findFirst().get();
        System.out.println(secondMaxVal);

        String[] words={"nalla","working","lenovo laptops","microservice"};

       String longestStrValue= Arrays.stream(words)
               .map(s->s.replace(" ",""))
               .reduce((w1,w2)->w1.length()>w2.length()?w1:w2).get();
        System.out.println(longestStrValue);



    }
}
