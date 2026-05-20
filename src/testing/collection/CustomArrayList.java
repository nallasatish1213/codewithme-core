package testing.collection;

import java.util.ArrayList;
import java.util.Objects;

public class CustomArrayList extends ArrayList {

    @Override
    public boolean add(Object object) {
       if(this.contains(object)){
           return true;
       }else {
           return super.add(object);
       }
    }

    public static void main(String[] args) {
        CustomArrayList list=new CustomArrayList();
        list.add(24);
        list.add(45);
        list.add(24);

        System.out.println(list);
    }
}
