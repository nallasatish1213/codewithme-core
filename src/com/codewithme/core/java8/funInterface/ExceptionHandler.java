package com.codewithme.core.java8.funInterface;

import java.lang.annotation.Target;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandler {

    public static void main(String[] args) {
        List<String> list=List.of("12","43","432","sfsdf");
        // Approach-1
     //  list.forEach(i-> firstApproach(i));
        //  list.forEach( firstApproach2(i->System.out.println(Integer.parseInt(i))));

        list.forEach( handlingGenericException(i->System.out.println(Integer.parseInt(i)),NumberFormatException.class));

        List<Integer> list2=List.of(10,0,40);

        list2.forEach( handlingGenericException(i->System.out.println(10/i),ArithmeticException.class));



    }

    static <Target, Exobj extends Exception> Consumer<Target>
    handlingGenericException(Consumer<Target> target,Class<Exobj> exObj){
        return obj-> {
            try{
            target.accept(obj);}
            catch(Exception ex) {
                try{
                    Exobj objs=exObj.cast(ex);
                    System.out.println(ex);
                }catch (ClassCastException ccex){
                    throw ccex;
                }
            }
        };
    }

    public static void firstApproach(String input) {
        try {
            System.out.println(Integer.parseInt(input));
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
    }


    public static Consumer<String> firstApproach2(Consumer<String> i) {
        return obj -> {
            try {
                i.accept(obj);
            } catch (Exception e) {
                System.out.println(e);
            }
        };
    }
}
