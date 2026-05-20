package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GreatestCandyOfKids {

    public static void main(String[] args) {

        int[] candies={2,3,5,1,3};

        List<Boolean> list=kidsWithCandies(candies,3);
        System.out.println(list);

    }

    public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new LinkedList<>();
        int prvKid=0;
        for(int i=0;i<candies.length; i++){
            if(i!=0){
               int  midKid =candies[i] + extraCandies;
               if(midKid>prvKid){
                   prvKid=midKid;
                   list.add(true);
               }else {
                   prvKid=midKid;
                   list.add(false);
               }
            }else {
                prvKid =candies[i] + extraCandies;
                if(extraCandies<prvKid){
                    list.add(true);
                } else{
                    list.add(false);
                }
            }
        }
        return list;
    }
}
