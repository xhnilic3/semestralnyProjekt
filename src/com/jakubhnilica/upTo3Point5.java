package com.jakubhnilica;

import java.util.Locale;

public class upTo3Point5 extends Vehicle {

    private Category category = Category.UP_TO_3POINT5;
    private TypeOfFuel fuel;

    public upTo3Point5(boolean typeOfAd, TypeOfFuel fuel, Category category){
        this.typeOfAd = typeOfAd;
        this.fuel = fuel;
        this.category = category;
    }


    public void setFuel(TypeOfFuel fuel) { this.fuel = fuel; }

    public void setPrice(double price) { this.price = price; }

    public Category getCategory() {
        return category;
    }

    public TypeOfFuel getFuel() { return fuel; }

    public boolean getTypeOfAd(){ return this.typeOfAd; }

    public double getPrice() { return this.price; }
}
