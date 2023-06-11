package com.thinkinginjava.udemy.S7.compositionChallenge;

public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker() {
    }

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    protected boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    protected void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    protected void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Breewing Coffee");
        }
        this.hasWorkToDo = false;
    }
}
