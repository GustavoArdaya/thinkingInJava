package com.thinkinginjava.udemy.S7.compositionChallenge;

public class Refrigerator {

    private boolean hasWorkToDo;

    public Refrigerator() {
    }

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    protected boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    protected void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    protected void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering food");
        }
        this.hasWorkToDo = false;
    }
}
