package com.thinkinginjava.udemy.S7.compositionChallenge;

public class SmartKitchen {

    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator refrigerator;

    public SmartKitchen() {
    }

    public SmartKitchen(CoffeeMaker cofferMaker, DishWasher dishWasher, Refrigerator refrigerator) {
        this.coffeeMaker = cofferMaker;
        this.dishWasher = dishWasher;
        this.refrigerator = refrigerator;
    }

    public CoffeeMaker getCofferMaker() {
        return coffeeMaker;
    }

    public void setCofferMaker(CoffeeMaker cofferMaker) {
        this.coffeeMaker = cofferMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setDishWasher(DishWasher dishWasher) {
        this.dishWasher = dishWasher;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    public void addWater() {
        this.coffeeMaker.setHasWorkToDo(true);
    }

    public void pourMilk() {
        this.refrigerator.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        this.dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean coffeeState, boolean washerState, boolean refrigeratorState) {
        this.coffeeMaker.setHasWorkToDo(coffeeState);
        this.dishWasher.setHasWorkToDo(washerState);
        this.refrigerator.setHasWorkToDo(refrigeratorState);
    }

    public void doKitchenWork() {
        this.refrigerator.orderFood();
        this.dishWasher.doDishes();
        this.coffeeMaker.brewCoffee();
    }
}
