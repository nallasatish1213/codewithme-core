package com.codewithme.core.designPattern.aFactory;

public class Main {

    public static void main(String[] args) {

        // Get UPI Factory
        AbstractSubTypeFactory upiFactory =
                AbstractFactoryTypeProcessor.getFactory("UPI");

        Payment gpay = upiFactory.getPaymentType("GPAY");

        gpay.payment(5000);


        // Get CARD Factory

        AbstractSubTypeFactory cardFactory =
                AbstractFactoryTypeProcessor.getFactory("CARD");

        Payment visa = upiFactory.getPaymentType("VISA");

        visa.payment(5000);



        // Get IB Factory
        AbstractSubTypeFactory ibFactory =
                AbstractFactoryTypeProcessor.getFactory("IB");

        Payment hdfc = ibFactory.getPaymentType("HDFC");

        hdfc.payment(7000);
    }
}