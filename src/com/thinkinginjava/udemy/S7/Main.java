package com.thinkinginjava.udemy.S7;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Customer1", 200.00, "email@email.com");
        Customer customer2 = new Customer();
        Customer customer3 = new Customer("customer3", "customer@email.com");

        System.out.println(customer.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer3.getEmail());
    }





}
