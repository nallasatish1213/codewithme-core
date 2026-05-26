package com.codewithme.core.designPattern.aFactory;

public class AmexCardPayment implements Payment {

    @Override
    public void payment(int amount) {
        System.out.println(STR."AmexCardPayment: \{amount}");
    }
}
