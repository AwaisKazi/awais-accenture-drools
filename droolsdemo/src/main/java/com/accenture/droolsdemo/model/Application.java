package com.accenture.droolsdemo.model;

public class Application {
    private String name;
    private int age;


    public Application() {
    }

    public Application(String name) {
        this.name = name;
        this.age = 0;
    }

    public Application(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
