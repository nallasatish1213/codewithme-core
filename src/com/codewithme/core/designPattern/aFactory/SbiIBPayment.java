package com.codewithme.core.designPattern.aFactory;

public class SbiIBPayment implements Payment {

    @Override
    public void payment(int amount) {
        System.out.println(STR."SbiIBPayment: \{amount}");
    }
}