package com.company;

/**
 * Created by ian on 17/03/2017.
 */
public class Chicken extends Bird {
    public Chicken(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println("Chicken is eating");

    }

    @Override
    public void sleep() {
        System.out.println("CHicken is sleeping");
    }


}
