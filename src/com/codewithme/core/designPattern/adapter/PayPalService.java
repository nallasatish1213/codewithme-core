package com.codewithme.core.designPattern.adapter;

public class PayPalService implements PaymentGateway{

    @Override
    public void typePatmentGateay(Integer vaule) {
        // here we can write business logic
        System.out.println(STR."this Pay Pal Service  gateway: \{vaule}");
    }
}
