package com.accenture.droolsdemo.model;

public class Customer {
    private String name;
    private int yearsInactive;
    private int overdraftFees;
    private boolean cancel;

  
    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public Customer(){

    }

    public Customer(String name, int overdraftFees, int yearsInactive){
        this.name = name;
        this.overdraftFees = overdraftFees;
        this.yearsInactive = yearsInactive;
        this.cancel = false;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getYearsInactive() {
        return yearsInactive;
    }
    public void setYearsInactive(int yearsInactive) {
        this.yearsInactive = yearsInactive;
    }

    public int getOverdraftFees() {
        return overdraftFees;
    }

    public void setOverdraftFees(int overdraftFees) {
        this.overdraftFees = overdraftFees;
    }

   
}
