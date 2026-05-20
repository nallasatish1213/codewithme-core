package com.codewithme.core.java8.funInterface;

public class FunctionalIntTest {
    public static void main(String[] args) {
        Upi upi=new Paytm();
        upi.payNow(10);
        Upi upiPhonePay=new PhonePay();
        upiPhonePay.payNow(10);

        System.out.println("Paytm: "+ upi+", Phonepay: "+upiPhonePay);

    }
}
