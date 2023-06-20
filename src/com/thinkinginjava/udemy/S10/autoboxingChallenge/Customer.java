package com.thinkinginjava.udemy.S10.autoboxingChallenge;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer() {
        this.transactions = new ArrayList<Double>(500);
    }
    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>(500);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }

    public void addTransaction(Double transaction) {
        transactions.add(transaction);
    }




}
