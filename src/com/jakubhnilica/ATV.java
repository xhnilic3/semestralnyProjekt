package com.jakubhnilica;

public class ATV extends Vehicle {

    public ATV(boolean typeOfAd, TypeOfFuel fuel, int mileage){
        this.typeOfAd = typeOfAd;
        this.fuel = fuel;
        this.mileage = mileage;
        this.category = Category.ATV;
    }
}
