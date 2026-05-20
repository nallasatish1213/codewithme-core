package com.codewithme.core.java8.funInterface;


public class Paytm implements Upi{

    // this is one service who can pay through paytm
    @Override
    public void  payNow(double payAmount) {
        double offerFromUpi=getThroughUpi();

        System.out.println(payAmount-offerFromUpi);
    }
}
