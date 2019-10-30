package com.jakubhnilica;

public interface AbstractFactory <T>{
    public T create(Enum models);
}
