package com.company;

/**
 * Created by ian on 17/03/2017.
 */
public class Animal {
    private String mName;
    private int mWeight;

    public Animal(String name, int weight) {
        mName = name;
        mWeight = weight;
    }

    public void eat(){
        System.out.println( "Animal eat() is called");
    }

    public  void sleep(){
        System.out.println("Animal sleep() is called");
    }
}
