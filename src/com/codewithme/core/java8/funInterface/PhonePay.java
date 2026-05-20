package com.codewithme.core.java8.funInterface;

public class PhonePay implements Upi {

    @Override
    public void payNow(double payAmount) {
        Upi.getUpi();
        double offer=this.getThroughUpi();
        System.out.println(payAmount-offer);
    }

    @Override
    public double getThroughUpi() {
        return 0.1;
    }
}
