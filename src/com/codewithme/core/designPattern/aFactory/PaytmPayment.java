package com.codewithme.core.designPattern.aFactory;

public class PaytmPayment implements Payment{
    @Override
    public void payment(int amount) {
        System.out.println(STR."PaytmPayment: \{amount}");
    }
}