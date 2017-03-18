package com.company;

public class Zoo {

    public static void main(String[] args) {

        Eagle philippineEagle = new Eagle("philippine eagle", 20);
        Maya maya = new Maya("maya", 2);
        maya.eat();
        philippineEagle.fly();
        Chicken chicken = new Chicken("chicken", 3);
        chicken.eat();

    }
}
