package com.codewithme.core.designPattern.aFactory;

public abstract class AbstractSubTypeFactory {
    abstract Payment getPaymentType(String type);
}
