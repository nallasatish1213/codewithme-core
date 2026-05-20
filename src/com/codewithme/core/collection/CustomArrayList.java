package com.codewithme.core.collection;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayList extends ArrayList {

   /*
     below method is restricted duplicate object
   * */
    @Override
    public boolean add(Object o) {
        if (this.contains(o)){
            return true;
        }else {
            return super.add(o);
        }
    }

    public static void main(String[] args) {

        CustomArrayList list=new CustomArrayList();
        list.add(101);
        list.add(102);
        list.add(101);
        System.out.println(list);
    }

    /*can we add final with arrayList
    yes we can write it but we cannet reassign the arraylist again
    but we can add data
    final ArrayList list=new ArrayList();
    list.add(111);
    list.add(222);

    list=new ArrayList(); // we cannot do that while assigning arraylist as a final
     */

}
