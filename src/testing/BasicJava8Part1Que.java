package testing;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BasicJava8Part1Que {
    public static void main(String[] args) {
        Map<String,Integer> mapSalaries=getMapSalary();
        Map<String,Integer> mapSalariesWithDuplicate= getMapDuplicateSalary();
      //  System.out.println(findNthSalary(2,mapSalaries));

      Map values=  mapSalariesWithDuplicate.entrySet().stream()
                .collect(Collectors.groupingBy(e->e.getValue(),Collectors.toList()));
      Map.Entry duplicateSalary=findNthSalaryWithDuplicate(3,mapSalariesWithDuplicate);
        System.out.println(duplicateSalary);

    }

    public static Map.Entry<Integer, List<String>> findNthSalaryWithDuplicate(Integer nth, Map<String, Integer> map) {
        return  map.entrySet().stream()
                .collect(Collectors.groupingBy(e->e.getValue(),Collectors.mapping(e->e.getKey(),Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey,Comparator.reverseOrder()))
                .collect(Collectors.toList())
                .get(nth-1);
    }

    public static Map.Entry<String, Integer> findNthSalary(Integer nth, Map<String, Integer> map) {
        return map.entrySet().stream()
                .sorted(Comparator.comparing(e -> e.getValue(), Comparator.reverseOrder()))
                .collect(Collectors.toList())
                .get(nth - 1);
    }
    public static Map<String,Integer> getMapSalary(){
        Map<String,Integer> mapSalary=new HashMap<>();
        mapSalary.put("satish",28000);
        mapSalary.put("nalla",32000);
        mapSalary.put("ragov",45000);
        mapSalary.put("suresh",36000);
        mapSalary.put("raja",22000);
        mapSalary.put("siva",56000);
       return mapSalary;
    }

    public static Map<String,Integer> getMapDuplicateSalary(){
        Map<String,Integer> mapSalary=new HashMap<>();
        mapSalary.put("satish",28000);
        mapSalary.put("nalla",32000);
        mapSalary.put("ragov",45000);
        mapSalary.put("suresh",32000);
        mapSalary.put("raja",22000);
        mapSalary.put("siva",56000);
        mapSalary.put("Karthi",45000);
        mapSalary.put("sivani",28000);
        return mapSalary;
    }
}
