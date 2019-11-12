package com.designpattern;

import com.designpattern.factory.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AbstractFactory abstractFactory;
        abstractFactory = FactoryProvider.getFactory("Organism");
        Person person = (Person) abstractFactory.create("PERSON");
        Animal animal = (Animal) abstractFactory.create("ANIMAL");

    }
}
