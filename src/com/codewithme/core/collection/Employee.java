package com.codewithme.core.collection;

import java.util.Objects;

public class Employee {
    private Integer employeeId;
    private Integer uniqeId;
    private String name;

    public Employee(Integer employeeId,Integer uniqeId,String name) {
        this.employeeId=employeeId;
        this.uniqeId=uniqeId;
        this.name=name;
    }

    public String getName(){
       return  this.name;
    }

    public Integer getEmployeeId(){
        return this.employeeId;
    }

    public Integer getUniqeId() {
        return uniqeId;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setUniqeId(Integer uniqeId){
        this.uniqeId=uniqeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", uniqeId=" + uniqeId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;

        if (getEmployeeId() != null ? !getEmployeeId().equals(employee.getEmployeeId()) : employee.getEmployeeId() != null)
            return false;
        if (getUniqeId() != null ? !getUniqeId().equals(employee.getUniqeId()) : employee.getUniqeId() != null)
            return false;
        return getName() != null ? getName().equals(employee.getName()) : employee.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getEmployeeId() != null ? getEmployeeId().hashCode() : 0;
        result = 31 * result + (getUniqeId() != null ? getUniqeId().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }
/*
   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(getEmployeeId(), employee.getEmployeeId()) && Objects.equals(getUniqeId(), employee.getUniqeId()) && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeId(), getUniqeId(), getName());
    }*/
}
