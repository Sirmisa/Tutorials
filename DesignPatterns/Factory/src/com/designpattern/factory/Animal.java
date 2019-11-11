package com.designpattern.factory;

public class Animal implements Organism {
    @Override
    public void born() {
        System.out.println("A Animal was born");
    }
}
