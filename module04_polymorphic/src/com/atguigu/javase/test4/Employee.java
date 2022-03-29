package com.atguigu.javase.test4;

public class Employee extends Person{
    private String office;
    private double wage;
    private String hireDate;
    
    public String getOffice() {
        return office;
    }
    
    public void setOffice(String office) {
        this.office = office;
    }
    
    public double getWage() {
        return wage;
    }
    
    public void setWage(double wage) {
        this.wage = wage;
    }
    
    public String getHireDate() {
        return hireDate;
    }
    
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
