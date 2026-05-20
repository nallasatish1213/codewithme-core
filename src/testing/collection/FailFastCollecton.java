package testing.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

public class FailFastCollecton {

    /**
     * we will caught up in collection and map non-concurrent collection like: AL, LL, HS,LHS, HM,LHM...etc
     * now writing example
     *
     * this issue will triggered while iterating and adding the object
     *
     * concurrent: CopyOnWriteArrayList, CopyOnWriteArraySet,ConcurrentHashMap
     * ConcurrentLinkedDeque, ConcurrentLinkedQueue, ConcurrentHashMap.KeySetView...etc
     */


    public static void main(String[] args) {
       // List<Integer> list=new ArrayList<>();
        List<Integer> list=new CopyOnWriteArrayList<>();
        list.add(112);
        list.add(113);
        list.add(114);
        list.add(115);

        Iterator<Integer> ite=list.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
            // here will trigger Concurrent Modification Exception but if you change the non-concurrent to concurrent class
            list.add(201);
        }

        /* after changing also we won't get last added record
        because it follows modCount is not matching then it will create one more cope collection,
         but it won't take
        */
    }
}
