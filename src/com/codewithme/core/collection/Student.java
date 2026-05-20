package com.codewithme.core.collection;

import java.util.Objects;

public class Student
        implements Comparable
{

    private Integer studentId;
    private String studentName;

    public Student(Integer studentId,String studentName){
        this.studentId=studentId;
        this.studentName=studentName;
    }
    public Integer getStudentId(){
        return studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentId(Integer studentId){
        this.studentId=studentId;
    }

    public void setStudentName(String studentName){
        this.studentName=studentName;
    }

    @Override
    public boolean equals(Object o) {
        Student s=(Student)o;
       if(this == s){
           return true;
       } else if (Objects.equals(studentId,s.getStudentId()) && Objects.equals(studentName,s.studentName)) {
           return true;
       }
       return false;
    }

    @Override
    public int hashCode() {
       int result= getStudentId()!=null? getStudentId().hashCode(): null;
       result=31*( getStudentName()!=null?getStudentName().hashCode():null);
       return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student s=(Student) o;
        if(this.studentId < s.studentId)
            return -1;
        else if (this.studentId > s.studentId) {
            return 1;
        }else
             return 0;
    }
}
