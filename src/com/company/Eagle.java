package com.company;

/**
 * Created by ian on 17/03/2017.
 */
public class Eagle extends Bird implements Flyable{
    public Eagle(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Eagle is sleeping");

    }


    @Override
    public void fly() {
        System.out.println("eagle is flying");
    }
}
