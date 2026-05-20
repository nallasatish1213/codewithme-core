package designpattern;

public class Singleton {

    private static  Singleton singleton=null;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if(singleton ==null){
            synchronized (Singleton.class) {
                if (singleton ==null){
                    singleton=  new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton  singleton1=getInstance();
        Singleton  singleton2=getInstance();

        System.out.println("singleton1: "+singleton1 );
        System.out.println("singleton2: "+singleton2 );
    }
}
