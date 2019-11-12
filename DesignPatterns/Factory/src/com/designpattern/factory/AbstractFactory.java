package com.designpattern.factory;

public interface AbstractFactory <T> {
    T create(String type);
}
