package com.codewithme.core.designPattern.aFactory;

public class UpiFactory extends AbstractSubTypeFactory {

    @Override
    Payment getPaymentType(String type) {
      return  switch (type.toUpperCase()) {
           case "PHONEPAY" -> new PhonePayPayment();
           case "GPAY" -> new GpayPayment();
           case "PAYTM" ->new PaytmPayment();
           default -> null;
           };
    }
}
