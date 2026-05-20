package com.codewithme.core.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        Map<String, String> capitalCities = new HashMap<>();
      //  Map<String, String> capitalCities = new ConcurrentHashMap<>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Access an item
        System.out.println("Capital of England: " + capitalCities.get("England"));



        // Loop through the HashMap
        for (String country : capitalCities.keySet()) {
            // Remove an item
            capitalCities.remove("Germany");
            System.out.println("Country: " + country + ", Capital: " + capitalCities.get(country));
        }

        // Check the size of the HashMap
        System.out.println("Size of the HashMap: " + capitalCities.size());
    }
}