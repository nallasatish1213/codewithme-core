package com.codewithme.core.designPattern.factory;

public class PayFactory {

    private UpiPayment upiPayment;
    private CardPayment cardPayment;
    public static Payment getPayment(String type) {

        if (type == null) {
            return null;
        }

        return switch (type.toUpperCase()) {

            case "UPI" -> new UpiPayment();

            case "CARD" -> new CardPayment();

            default -> null;
        };
    }
}
