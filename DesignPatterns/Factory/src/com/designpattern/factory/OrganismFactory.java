package com.designpattern.factory;

public class OrganismFactory implements AbstractFactory<Organism>{

    @Override
    public Organism create(String type) {

        if(type.equalsIgnoreCase(Organisms.ANIMAL.toString())){
            return new Animal();
        }else{
            return new Person();
        }

    }
}
