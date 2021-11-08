package com.accenture.droolsdemo;

public class Active {
    private String name;
    private int creditScore;
    private boolean activeCustomer;

    public String getName() {
		return name;
	}

	public void setName(String customerName) {
		this.name = customerName;
	}

    
    public double getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public boolean getActiveCustomer() {
		return activeCustomer;
	}

    public void setActiveCustomer(boolean activeCustomer) {
		this.activeCustomer = activeCustomer;
	}

}
