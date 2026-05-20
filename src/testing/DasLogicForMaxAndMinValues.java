package testing;

public class DasLogicForMaxAndMinValues {
    // with out using sorting order
    public static void main(String[] args) {
        int[] numbers={43,53,22,67,11,17,84,35};
        int max=findMaxValue(numbers,0,numbers.length-1,0);

        int min=findMinValue(numbers,0,numbers.length-1,0);
        System.out.println("Max Number: "+max+", Min Number: "+min);
    }

    public static int findMaxValue(int[] numbers,int s, int e,int max) {
       if(s>e){
           return max;
       }
       if(numbers[s] > max){
           max=numbers[s];
       }
        return findMaxValue(numbers,s+1,e,max);
    }

    public static int findMinValue(int[] numbers,int s, int e,int min) {
        if(s>e){
            return min;
        }

        if(min==0){
            min=numbers[s];
        }

        if(numbers[s] < min){
            min=numbers[s];
        }
        return findMinValue(numbers,s+1,e,min);
    }
}
