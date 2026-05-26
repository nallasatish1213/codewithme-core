package com.codewithme.core.designPattern.aFactory;

public class CardFactory extends AbstractSubTypeFactory {
    @Override
    Payment getPaymentType(String type) {
        return switch (type.toUpperCase()){
            case "VISA" -> new VisaCardPayment();
            case "MASTERCARD" -> new MasterCardPayment();
            case "AMEX" -> new AmexCardPayment();
            default -> null;
        };
    }
}
