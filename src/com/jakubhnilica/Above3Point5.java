package com.jakubhnilica;

public class Above3Point5 extends Vehicle {
    private Category category;
    private TypeOfFuel fuel;

    public Above3Point5(boolean typeOfAd, TypeOfFuel fuel, Category category, int mileage){
        this.typeOfAd = typeOfAd;
        this.fuel = fuel;
        this.category = category;
        this.mileage = mileage;
    }

}

