package com.accenture.droolsdemo.model;

// variables
// credit limit, customer name, increase credit limit, previous credit limit,
// customerYears,creditIncreasePercentage, age,
public class Customer {
    
    private String name;
    private int age;
    private int yearsACustomer;
    private double creditLimit;
    private double previousCreditLimit;
    private double increasedCreditLimit;
    private double creditIncreasePercentage;
    private double extendedCreditLimit;
    private Boolean customerAllowedExtension = true; 

    public Customer() 
    {

    }

    public Customer(String name, int age, int yearsACustomer, double creditLimit, Boolean customerAllowedExtension,
    double previousCreditLimit, double increasedCreditLimit,double creditIncreasePercentage,
    double extendedCreditLimit)
    {
        this.name = name;
        this.age = age;
        this.yearsACustomer = yearsACustomer;
        this.creditLimit = creditLimit;
        this.previousCreditLimit = creditLimit;
        this.increasedCreditLimit = increasedCreditLimit;
        this.creditIncreasePercentage = creditIncreasePercentage;
        this.extendedCreditLimit = extendedCreditLimit;
        this.customerAllowedExtension = customerAllowedExtension;
    }


    public void hightenCreditLimit(double increasePercentage)
    {
        double onePercent = 0.00;
        onePercent = creditLimit / 100;
        increasedCreditLimit = (onePercent * increasePercentage) + creditLimit;
        extendedCreditLimit = increasedCreditLimit + 5000;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearsACustomer() {
        return yearsACustomer;
    }

    public void setYearsACustomer(int yearsACustomer) {
        this.yearsACustomer = yearsACustomer;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getPreviousCreditLimit() {
        return previousCreditLimit;
    }

    public void setPreviousCreditLimit(double previousCreditLimit) {
        this.previousCreditLimit = previousCreditLimit;
    }

    public double getIncreasedCreditLimit() {
        return increasedCreditLimit;
    }

    public void setIncreasedCreditLimit(double increasedCreditLimit) {
        this.increasedCreditLimit = increasedCreditLimit;
    }

    public double getCreditIncreasePercentage() {
        return creditIncreasePercentage;
    }

    public void setCreditIncreasePercentage(double creditIncreasePercentage) {
        this.creditIncreasePercentage = creditIncreasePercentage;
    }

    public double getExtendedCreditLimit() {
        return extendedCreditLimit;
    }
    public void setExtendedCreditLimit(double extendedCreditLimit) {
        this.extendedCreditLimit = extendedCreditLimit;
    }

    public Boolean getCustomerAllowedExtBoolean() {
        return customerAllowedExtension;
    }
    public void setCustomerAllowedExtension(Boolean customerAllowedExtension) {
        this.customerAllowedExtension = customerAllowedExtension;
    }

}
