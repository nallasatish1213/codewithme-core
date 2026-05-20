package leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        Integer reverseint=    reverseInteger(1734560789);
        System.out.println("Reverse Integer: "+reverseint);
    }

    private static Integer reverseInteger(Integer num) {
        Integer ans=0;
        while(num!=0){
            Integer rem=num%10;
            Integer newAns=(ans*10)+rem;
            if(((newAns-rem)/10) != ans){
                System.out.println("out put Number:1534236469:: 0");
            }
            ans=newAns;
            num/=10;
        }
        return ans;
    }
}
