package com.codewithme.core.designPattern.factory;

public class UpiPayment implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println(STR."Payment has been processed and success: \{amount}");
    }
}
