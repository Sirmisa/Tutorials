package com.designpattern.factory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String factoryType){
        System.out.println("Initializing Factory");
        return new OrganismFactory();
    }
}
