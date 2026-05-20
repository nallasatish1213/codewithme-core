package leetcode;

import java.util.List;


public class ReverseVowels {

    public static void main(String[] args) {
        reverseVowels("leetcode");
    }

    public static void reverseVowels(String s) {

        List<String> vowals=List.of("a","e","i","o","u");
        String rev="";

        for(int i=s.length()-1;i>=0;i--){
            if("aeiouAEIOU".equals(s.indexOf(i))) {
            rev=rev+s.charAt(i);}
        }

        System.out.println(rev);

    }

    public static void reverseString(String s) {
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
                rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}
