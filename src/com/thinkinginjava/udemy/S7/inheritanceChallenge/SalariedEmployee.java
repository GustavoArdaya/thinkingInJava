package com.thinkinginjava.udemy.S7.inheritanceChallenge;

public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    public void retire() {
        System.out.println("Employee " + super.getName() + " with id " + super.getEmployeeId() + " retires.");
        this.isRetired = true;
    }

    @Override
    public double collectPay() {
        return Math.round((this.getAnnualSalary() / 12));
    }
}
