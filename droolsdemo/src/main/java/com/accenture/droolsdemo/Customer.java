package com.accenture.droolsdemo;

public class Customer {

    private String name;
    private int age;
    private boolean customerAllowedExtension;
    private int creditIncreasePercent;
    private double creditLimit;
    private int activeYears;
    private int bonusIncreasePercent;

    public String getName() {
		return name;
	}

	public void setName(String customerName) {
		this.name = customerName;
	}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getCustomerAllowedExtension() {
		return customerAllowedExtension;
	}

    public void setCustomerAllowedExtension(boolean customerAllowedExtension) {
		this.customerAllowedExtension = customerAllowedExtension;
	}

    public int getBonusIncreasePercent() {
        return this.bonusIncreasePercent;
    }

    public void setBonusIncreasePercent(int bonusIncreasePercent) {
        this.bonusIncreasePercent = bonusIncreasePercent;
    }

    public int getCreditIncreasePercent() {
        return this.creditIncreasePercent;
    }

    public void setCreditIncreasePercent(int creditIncreasePercent) {
        this.creditIncreasePercent = creditIncreasePercent;
        this.setCreditIncrease(this.creditIncreasePercent);
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getActiveYears() {
        return this.activeYears;
    }

    public void setActiveYears(int activeYears) {
        this.activeYears = activeYears;
    }

    public void setCreditIncrease(int creditIncreasePercent) {
        this.creditLimit = this.getCreditLimit() * (1 + creditIncreasePercent/100);
    }
    
}
