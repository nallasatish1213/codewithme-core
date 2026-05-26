package com.codewithme.core.designPattern.factory;

public class CardPayment implements Payment{

    @Override
    public void pay(int amount) {
        System.out.println(STR."Payment was completed successfully:\{amount}");
    }
}
