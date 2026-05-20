package testing;


import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrintEvenAndOddUsingCF {
    static Object object=new Object();

    private static IntPredicate even=e->e%2==0;
    private static IntPredicate odd=e->e%2!=0;

    public static void printResult(IntPredicate conditions) {
        IntStream.rangeClosed(1,10)
                .filter(conditions)
                .forEach(PrintEvenAndOddUsingCF:: execute);
    }

    private static void execute(int i) {
        synchronized (object){
            try {
            System.out.println(Thread.currentThread().getName()+" : "+i);
            object.notify();
            object.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        CompletableFuture.runAsync(()->PrintEvenAndOddUsingCF.printResult(odd));
        CompletableFuture.runAsync(()->PrintEvenAndOddUsingCF.printResult(even));
        Thread.sleep(1000);

    }
}
