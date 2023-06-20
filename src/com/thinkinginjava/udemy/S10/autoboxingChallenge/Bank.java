package com.thinkinginjava.udemy.S10.autoboxingChallenge;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;

    private ArrayList<Customer> customers;

    public Bank(){
        this.customers = new ArrayList<Customer>(500);
    }
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>(500);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer) {
        if (!customers.contains(customer)) {
            this.customers.add(customer);
        }
    }

    public void addTransaction(Customer customer, Double transaction) {
        if (customers.contains(customer)) {
            customer.addTransaction(transaction);
        }
    }

    public void printTransactions(Customer customer) {
        if (customers.contains(customer)) {
            List<Double> transactions = customer.getTransactions();
            System.out.println("Customer " + customer.getName());
            System.out.println("Transactions: ");
            for (double transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }
}
