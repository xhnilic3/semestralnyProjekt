package com.jakubhnilica;

public class Motocycles extends Vehicle {

    public Motocycles(boolean typeOfAd, TypeOfFuel fuel, int mileage){
        this.typeOfAd = typeOfAd;
        this.fuel = fuel;
        this.mileage = mileage;
        this.category = Category.MOTOCYCLES;
    }

}
