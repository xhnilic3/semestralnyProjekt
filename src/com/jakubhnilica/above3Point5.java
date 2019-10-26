package com.jakubhnilica;

public class above3Point5 extends Vehicle {
    private Category category = Category.ABOVE_3POINT5;
    private TypeOfFuel fuel;

    public above3Point5(boolean typeOfAd, TypeOfFuel fuel, Category category, int mileage){
        this.typeOfAd = typeOfAd;
        this.fuel = fuel;
        this.category = category;
        this.mileage = mileage;
    }

}

