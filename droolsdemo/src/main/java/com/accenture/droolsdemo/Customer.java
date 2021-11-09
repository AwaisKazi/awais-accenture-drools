package com.accenture.droolsdemo;
//model for Credit Increase controller 


public class Customer {
    private String name;
    private int age;
    private int creditLine;
    private int creditIncrease;
    private int accountAge;
    private boolean boostEligible;

    Customer(){}

    Customer(String name, int age, int creditLine, int creditIncrease, int accountAge){
        this.name = name;
        this.age =age;
        this.creditLine = creditLine;
        this.creditIncrease = creditIncrease;
        this.accountAge =accountAge;
        this.boostEligible = false;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getCreditLine(){
        return this.creditLine;
    }

    public void setCreditLine(int creditLine){
        this.creditLine = creditLine;
    }

    public int getCreditIncrease(){
        return this.creditIncrease;
    }

    public void setCreditIncrease(int creditIncrease){
        this.creditIncrease = creditIncrease;
    }

    public void setCreditLineIncrease(int creditIncrease){
        this.creditLine = this.getCreditLine() * (1 + creditIncrease/100);
    }

    public int getAccountAge(){
        return this.accountAge;
    }

    public void setAccountAge(int accountAge){
        this.accountAge = accountAge;
    }
    public boolean getBoostEligible(){
        return this.boostEligible;
    }

    public void setBoostEligible(boolean boostEligible){
        this.boostEligible = boostEligible;
    }



}
