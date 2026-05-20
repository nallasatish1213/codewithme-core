package testing.citi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateNumberInArray {

    public static void main(String[] args) {
        int[] arr={20,14,34,56,9,14,55,23,88,71,99,34,55};
       /*List<Integer> withoutDuplicate = Arrays.stream(arr).boxed().distinct().sorted((a,b)->a>b?-1:1)
               .collect(Collectors.toList());*/

        List<Integer> withoutDuplicate = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(STR."List collection: \{withoutDuplicate}");

        Set<Integer> withoutDuplicateSet = Arrays.stream(arr).boxed().sorted((a, b)->a>b?-1:1).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(STR."Set collection: \{withoutDuplicateSet}");



        }
}
