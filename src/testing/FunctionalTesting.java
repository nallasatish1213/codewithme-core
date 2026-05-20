package testing;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalTesting {


    public static void main(String[] args) {
        // Function: apply method with single parameter and return type object  --> Transform input to output
        // Predicate: test method with single parameter and return type boolean --> Boolean condition check
        // Consumer: accept method with single parameter and return type void   --> Perform action on input
        // Supplier: get method no param  and return type object or r           --> Provide a value

        // Lambda expression
        new Thread(()->{
                System.out.println("thread testing");
            }
        ).start();


        Runnable run=()-> System.out.println ("Runnable lambad expression");

        new Thread(run).start();

    }

    static void printValue(){
        System.out.println("thread lambad expression");
    }
}
