package com.company;

/**
 * Created by ian on 17/03/2017.
 */
public abstract class Animal {
    private String mName;
    private int mWeight;

    public Animal(String name, int weight) {
        mName = name;
        mWeight = weight;
    }

    public abstract void eat();

    public abstract void sleep();

    public String getName() {
        return mName;
    }
}
