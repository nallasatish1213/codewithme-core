package com.codewithme.core.designPattern.adapter;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AdapterPatternService {

    private Map<String,PaymentGateway>  mapPaymentGateway;

    public AdapterPatternService(List<PaymentGateway> listOfGateway){
        mapPaymentGateway=listOfGateway.stream()
                .collect(Collectors.toMap(map->map.getClass().getSimpleName(), Function.identity()));
    }

    public void processPayment(String gateway,Integer amount) {
        PaymentGateway gateways=mapPaymentGateway.get(gateway+"Service");
        gateways.typePatmentGateay(amount);
    }


}
