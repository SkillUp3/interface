package com.company;

/**
 * Created by ian on 17/03/2017.
 */
public class Eagle extends Bird implements Flyable{
    public Eagle(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
