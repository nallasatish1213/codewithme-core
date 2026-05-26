package com.codewithme.core.designPattern.aFactory;

public class MasterCardPayment implements Payment{
    @Override
    public void payment(int amount) {
        System.out.println(STR."MasterCardPayment: \{amount}");
    }
}