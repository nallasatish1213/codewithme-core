package com.codewithme.core.designPattern.aFactory;

public class ICICIIBPayment implements Payment {

    @Override
    public void payment(int amount) {
        System.out.println(STR."HdfcIBPayment: \{amount}");
    }
}