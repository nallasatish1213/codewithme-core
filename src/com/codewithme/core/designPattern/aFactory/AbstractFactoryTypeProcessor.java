package com.codewithme.core.designPattern.aFactory;

public class AbstractFactoryTypeProcessor {
    public static AbstractSubTypeFactory getFactory(String paymentType) {

        return switch (paymentType.toUpperCase()) {

            case "UPI" -> new UpiFactory();

            case "CARD" -> new CardFactory();

            case "IB" -> new IBFactory();

            default -> null;
        };
    }
}
