package com.thinkinginjava.udemy.S7.inheritanceChallenge;

public class Main {

    public static void main(String[] args) {

        SalariedEmployee employee = new SalariedEmployee("John", "01/02/1980", "", 10, "05/05/2023", 100000.0, false);
        System.out.println(employee.getName() + " is " + employee.getAge() + " years old");
        System.out.println(employee.getName() + " receives " + employee.collectPay() + " as payment.");
        employee.retire();
    }
}
