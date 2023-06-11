package com.thinkinginjava.udemy.S7.compositionChallenge;

public class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher() {
    }

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    protected boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    protected void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    protected void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Doing the dishes");
        }
        this.hasWorkToDo = false;
    }
}
