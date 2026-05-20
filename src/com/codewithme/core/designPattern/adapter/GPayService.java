package com.codewithme.core.designPattern.adapter;

public class GPayService implements PaymentGateway {

    @Override
    public void typePatmentGateay(Integer vaule) {
        // here we can write business logic
        System.out.println(STR."this gpay gateway: \{vaule}");
    }
}
