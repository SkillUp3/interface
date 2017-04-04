package com.company;

/**
 * Created by ian on 17/03/2017.
 */
public class Maya extends Bird implements Flyable{
    public Maya(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println("Maya is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Maya is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Maya is flying");
    }
}
