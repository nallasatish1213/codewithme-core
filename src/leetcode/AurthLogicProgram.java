package leetcode;

public class AurthLogicProgram {
    public static void main(String[] args) {
     //   factroial(2);
     //   fibonacci(15);
    //    reverseInteger(4567);
     //   reverseString("satish");
        isPrime(4);
       // reverseStringSB("satish");
    }

    private static  void  isPrime(int num){
      //  boolean isPrime=false;
        int count=0;
        int i=1;
        while(i<=num) {
            if (num % i == 0) {
                count++;
            }
            i++;
        }
        if(count==2){
            System.out.println(STR."\{num} is Prime Number");
          //  return true;
        }else {
            System.out.println(STR."\{num} is not a  Prime Number");
         //   return false;
        }
    }
    public static void reverseStringSB(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println(sb);
    }

    public static void reverseString(String input){
        String rev="";
        char[] chr=input.toCharArray();
        for(int i=chr.length-1; i>=0; i--){
            rev=rev+chr[i];
        }
        System.out.print(rev);
    }

    public static void reverseInteger(int input){
        int output=0;
        while(input !=0){
            int digit=input%2;
            output=(output*10)+digit;
            input/=10;
        }
        System.out.println(output);
    }

    public static void fibonacci(int input) {
        int i = 0;
        int j = 1;
        //  int fab;
        for (int k = 2; k <= input; k++) {
            System.out.print(i+ ", ");
            int fab = i + j;
            i = j;
            j = fab;
        }
        System.out.println(i);
    }

    public static  void factroial(int input){
        if(input > 1) {
           // int i=1;
            int output=1;
            for(int i=1;i<=input;i++){
                output=output*i;
            }
            System.out.println(STR."Factrial output: \{output}");
        } else{
            System.out.println(STR."Factrial output: \{1}");
        }
    }
}
