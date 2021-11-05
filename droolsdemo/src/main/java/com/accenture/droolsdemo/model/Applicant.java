package com.accenture.droolsdemo.model;

public class Applicant {
    private String name;
    private int age;
    private int yearsTogether;
    private double limitIncrease;
    private double optionalBonus;
    private double limit;

    public Applicant(){

    }

    public Applicant(String name, int age, int creditScore, double limit){
        this.name = name;
        this.age = age;
        this.limit = limit;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getYearsTogether() {
        return yearsTogether;
    }

    public void setYearsTogether(int yearsTogether) {
        this.yearsTogether = yearsTogether;
    }

    public double getLimit(){
        return limit;
    }

    public void setLimit(double limit){
        this.limit = limit;
    }

    public double getLimitIncrease(){
        return limitIncrease;
    }

    public void setLimitIncrease(double limitIncrease){
        this.limitIncrease = limitIncrease;
    }

    public double getOptionalBonus(){
        return optionalBonus;
    }

    public void setOptionalBonus(double optionalBonus){
        this.optionalBonus = optionalBonus;
    }
}