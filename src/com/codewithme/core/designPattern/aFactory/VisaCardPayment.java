package com.codewithme.core.designPattern.aFactory;

public class VisaCardPayment implements Payment{
    @Override
    public void payment(int amount) {
        System.out.println(STR."VisaCardPayment: \{amount}");
    }
}