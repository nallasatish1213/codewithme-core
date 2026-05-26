package com.codewithme.core.designPattern.factory;

public class Main {

    /*
    The Factory Design Pattern is a creation design pattern used to create objects
    without exposing the object creation logic to the client.
    factory method instead of directly using new

    Adv: Centralized Creation, Easy Maintenance, Scalable, clean code
    dis: More Classes, More Abstraction

    if new type come then we have introduce new pay service then it will violates  Open Closed Principle

        Best Modern Approach:
            Factory + Dependency Injection + Interface-based design

        Technique           	                         Benefit
        Factory + Strategy  	                    Dynamic behavior
        Factory + Singleton 	                     Reuse objects
        Factory + Dependency Injection   	        Loose coupling
        Abstract Factory                	          Related object families
    * Payment (interface)
   ↑
UPIPayment
CardPayment

PaymentFactory
   ↓
returns Payment object

Main class
   ↓
uses pay()
    *
    * */

    public static void main(String[] args) {

        Payment payment = PayFactory.getPayment("UPI");

        if (payment != null) {
            payment.pay(5000);
        } else {
            System.out.println("Invalid payment type");
        }
    }
}