package com.codewithme.core.java8.java17;

public sealed class Shape permits Squre,Rectangle {
    /*
    Why this sealed: to controlled inheritance and  prevents unwanted implementations and
    only sub classes can be extended

    better design and security.

    Dis: Reduced Flexibility like we can't extend the class freely because of permits
    difficult to extends in future requirements i mean tightly coupled
    *
     */
}
