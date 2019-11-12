package com.designpattern.factory;

public class Animal implements Organism {
    @Override
    public void born() {
        System.out.println("An Animal was born");
    }

    public Animal(){
        born();
    }
}
