package com.codewithme.core.designPattern.aFactory;

public class GpayPayment implements Payment{
    @Override
    public void payment(int amount) {
        System.out.println(STR."GpayPayment: \{amount}");
    }
}