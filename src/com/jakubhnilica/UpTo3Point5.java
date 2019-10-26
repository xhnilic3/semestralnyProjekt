package com.jakubhnilica;


public class UpTo3Point5 extends Vehicle {

    public UpTo3Point5(boolean typeOfAd, TypeOfFuel fuel, int mileage){
        this.typeOfAd = typeOfAd;
        this.fuel = fuel;
        this.mileage = mileage;
        this.category = Category.UP_TO_3POINT5;
    }

    protected enum Brand {
        SKODA,
        VOLKSWAGEN,
        FORD,
        PEUGEOT,
        FIAT,
        SEAT
    }

}
