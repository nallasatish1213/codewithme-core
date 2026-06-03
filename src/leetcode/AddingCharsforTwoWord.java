package leetcode;

public class AddingCharsforTwoWord {

    public static void main(String[] args) {
        mergingTwoWords("abcd","pq"); // output: apbqcd
        merge("abcd","pq"); //  output:  abcdpq
    }

    static void  merge(String s1,String s2) {
        StringBuilder sb=new StringBuilder(s1);
        sb.append(s2);
        System.out.println("Merge: "+ sb);
    }

   public static void  mergingTwoWords(String word1, String word2){
       int wordLen = word2.length()+  word1.length();
       StringBuilder sb=new StringBuilder(wordLen);
       for(int i=0; i<wordLen;i++){

           if(i<word1.length()){
               sb.append(word1.charAt(i));
           }

           if(i<word2.length()){
               sb.append(word2.charAt(i));
           }
       }
       System.out.println(sb.toString());
    }
}
