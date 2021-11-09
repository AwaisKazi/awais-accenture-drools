package com.accenture.droolsdemo.model;

public class Customer {
    
    private Application application;
    private int tenure;
    private double optionalCreditIncrease;
    private double optionalCredit;
    private int currCreditLimit;
    private double newCreditLimit;
    private boolean isOverForty;
    private int creditScore;
    private boolean isActive;


    public Customer() {
    }

    public Customer(Application application, int tenure) {
        this.application = application;
        this.tenure = tenure;
        this.optionalCreditIncrease = 0;
        this.currCreditLimit = 1000;
        this.optionalCredit = 0;
        this.newCreditLimit = this.currCreditLimit;
        this.isOverForty = false;
        this.creditScore = 700;
        this.isActive = false;
    }

    public Customer(Application application, int tenure, int creditScore) {
        this.application = application;
        this.tenure = tenure;
        this.optionalCreditIncrease = 0;
        this.currCreditLimit = 1000;
        this.optionalCredit = 0;
        this.newCreditLimit = this.currCreditLimit;
        this.isOverForty = false;
        this.creditScore = creditScore;
        this.isActive = false;
    }

    public Application getApplication() {
        return this.application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public int getCurrCreditLimit() {
        return this.currCreditLimit;
    }

    public void setCurrCreditLimit(int currCreditLimit) {
        this.currCreditLimit = currCreditLimit;
    }

    public int getTenure() {
        return this.tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getOptionalCreditIncrease() {
        return this.optionalCreditIncrease;
    }

    public void setOptionalCreditIncrease(double optionalCreditIncrease) {
        this.optionalCreditIncrease = optionalCreditIncrease;
    }

    public double getNewCreditLimit() {
        return this.newCreditLimit;
    }

    public void setNewCreditLimit(double newCreditLimit) {
        this.newCreditLimit = newCreditLimit;
    }

    public boolean isIsOverForty() {
        return this.isOverForty;
    }

    public boolean getIsOverForty() {
        return this.isOverForty;
    }

    public void setIsOverForty(boolean isOverForty) {
        this.isOverForty = isOverForty;
    }

    public int getCreditScore() {
        return this.creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public double getOptionalCredit() {
        return this.optionalCredit;
    }

    public void setOptionalCredit(double optionalCredit) {
        this.optionalCredit = optionalCredit;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }


    @Override
    public String toString() {
        return "{" +
            " application='" + getApplication() + "'" +
            ", tenure='" + getTenure() + "'" +
            ", optionalCreditIncrease='" + getOptionalCreditIncrease() + "'" +
            ", optionalCredit='" + getOptionalCredit() + "'" +
            ", currCreditLimit='" + getCurrCreditLimit() + "'" +
            ", newCreditLimit='" + getNewCreditLimit() + "'" +
            ", isOverForty='" + isIsOverForty() + "'" +
            ", creditScore='" + getCreditScore() + "'" +
            ", isActive='" + isActive() + "'" +
            "}";
    }


    
}
