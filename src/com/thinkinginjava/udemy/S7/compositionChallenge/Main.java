package com.thinkinginjava.udemy.S7.compositionChallenge;

public class Main {

    public static void main(String[] args) {

        CoffeeMaker cafetera = new CoffeeMaker();
        DishWasher lavadora = new DishWasher();
        Refrigerator heladera = new Refrigerator();

        SmartKitchen cocinaMolona = new SmartKitchen(cafetera, lavadora, heladera);

        cocinaMolona.addWater();
        cocinaMolona.doKitchenWork();
        cocinaMolona.doKitchenWork();
        cocinaMolona.loadDishwasher();
        cocinaMolona.pourMilk();
        cocinaMolona.doKitchenWork();
        cocinaMolona.pourMilk();
        cocinaMolona.doKitchenWork();

    }
}
