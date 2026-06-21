package com.codewithme.core;

import com.codewithme.core.collection.Address;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private final Integer studentId;
    private final String studentName;
    private final Date dateOfJoin;

    private final List<String> mobileNum;

    private final Address address;

    public  Student(Integer studentId,String studentName,Date dateOfJoin,List<String> mobileNum,Address address){
        this.studentId = studentId;
        this.studentName = studentName;
        this.dateOfJoin = dateOfJoin;
        this.mobileNum = mobileNum;
        this.address = address;
    }

    public Integer getStudentId(){
        return studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public Date getDateOfJoin(){
      //  return dateOfJoin; //if you return dateOfJoin it would be updated it
       return new Date(); //every time it will create new date so no one can be updated it
     // return (Date) dateOfJoin.clone(); // or you can clone it so no one can be updated  it
    }

    public List<String> getMobileNum(){
      /*  return mobileNum;  // if you add this code, someone can be updated it
       return Collections.unmodifiableList(mobileNum); // if some one modified this they will get concurrency modification exception
       */

        return new ArrayList<>(mobileNum);

    }

    public Address getAddress() {
     //   return address; // address is mutable class so someone can be modified it or assign it
       /* so fix this issue

        */
        return new Address(address.getCity(),address.getPincode());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", dateOfJoin=" + dateOfJoin +
                ", mobileNum=" + mobileNum +
                ", address=" + address +
                '}';
    }
}
