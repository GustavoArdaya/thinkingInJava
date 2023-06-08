package com.thinkinginjava.udemy.S7.inheritanceChallenge;

public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public Worker() {
    }

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getAge() {
        int birthyear = Integer.parseInt(this.getBirthDate().substring(this.getBirthDate().length() - 4));
        return 2023 - birthyear;
    }

    public double collectPay() {
        return 0.0;
    }

    public String terminate(String endDate) {
        return "Worker is fired on " + endDate;
    }

}
