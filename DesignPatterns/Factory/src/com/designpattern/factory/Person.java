package com.designpattern.factory;

public class Person implements Organism{

    @Override
    public void born() {
        System.out.println("A person was born");
    }

    public Person(){
        born();
    }
}