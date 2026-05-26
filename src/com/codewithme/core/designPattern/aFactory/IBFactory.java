package com.codewithme.core.designPattern.aFactory;

public class IBFactory extends AbstractSubTypeFactory{
    @Override
    Payment getPaymentType(String type) {
        return switch (type.toUpperCase()){
            case "SBI" -> new SbiIBPayment();
            case "HDFC" -> new HdfcIBPayment();
            case "ICICI" -> new ICICIIBPayment();
            default -> null;
        };
    }
}
