package com.jakubhnilica;

public class Bus extends Vehicle {

    public Bus(boolean typeOfAd, TypeOfFuel fuel, int mileage){
        this.typeOfAd = typeOfAd;
        this.fuel = fuel;
        this.mileage = mileage;
        this.category = Category.BUS;
    }
}
