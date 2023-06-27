package com.thinkinginjava.udemy.S11.abstractClassChallenge;

public abstract class ProductForSale {

    protected String type;
    protected double price;
    protected String description;

    public ProductForSale() {
    }

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return price * quantity;
    }

    public void printPricedItem(int quantity) {
        System.out.printf("%2d quantity at $%8.2f each, %-15s %-35s %n", quantity, price, type, description);
    }

    public abstract void showDetails();
}
