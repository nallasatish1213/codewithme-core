package com.codewithme.core.java8;

public class Employee {
    private Integer id;
    private String name;
    private String city;
    private String pincode;
    private String phoneNumber;
    private String dept;
    private Integer mark;

   public  Employee(Integer id,String name,String city,String pincode, String phoneNumber,String dept, Integer mark){
       this.id=id;
       this.name=name;
       this.city=city;
       this.pincode=pincode;
       this.phoneNumber=phoneNumber;
       this.dept=dept;
       this.mark=mark;
   }

    @Override
    public int hashCode() {
       int result=id.hashCode();
      //  result =result * 31 * name.hashCode();
       return 31*result;
    }

    @Override
    public boolean equals(Object obj) {
       Employee employee=(Employee)obj;
       if(obj instanceof Employee){
           return true;
       } else if (this.id==employee.id ) {
           return true;
       }
       return false;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dept='" + dept + '\'' +
                ", mark=" + mark +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }
}
