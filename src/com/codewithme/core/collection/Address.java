package com.codewithme.core.collection;

public class Address {
    private String city;
    private String pincode;

    public Address(String city,String pincode){
        this.city=city;
        this.pincode=pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
