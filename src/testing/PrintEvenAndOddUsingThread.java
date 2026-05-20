package testing;

public class PrintEvenAndOddUsingThread extends Thread {

    Object object;
    static int i = 1;

    PrintEvenAndOddUsingThread(Object o) {
        this.object = o;
    }


    public static void main(String[] args) {

        Object o = new Object();

        PrintEvenAndOddUsingThread even = new PrintEvenAndOddUsingThread(o);
        PrintEvenAndOddUsingThread odd = new PrintEvenAndOddUsingThread(o);

        Thread t2 = new Thread(odd, "odd");
        Thread t1 = new Thread(even, "even");
        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        while (i <= 10) {
            if (i % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (object) {
                    try {
                        System.out.println(Thread.currentThread().getName() + ": " + i);
                        i++;
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if (i % 2 == 1 && Thread.currentThread().getName().equals("odd")) {
                synchronized (object) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    i++;
                    object.notify();
                }
            }
        }
    }


}
