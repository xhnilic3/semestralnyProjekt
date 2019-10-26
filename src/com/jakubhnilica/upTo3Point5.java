package com.jakubhnilica;

import java.util.Locale;

public class upTo3Point5 extends Vehicle {

    private Category category = Category.UP_TO_3POINT5;
    private TypeOfFuel fuel;

    public upTo3Point5(boolean typeOfAd, TypeOfFuel fuel, Category category, int mileage){
        this.typeOfAd = typeOfAd;
        this.fuel = fuel;
        this.category = category;
        this.mileage = mileage;
    }


    public void setFuel(TypeOfFuel fuel) { this.fuel = fuel; }

    public void setPrice(double price) { this.price = price; }

    public void setCategory(Category category) { this.category = category; }

    public void setMileage (int mileage) { this.mileage = mileage; }

    public void setYearOfProduction (int year) { this.yearOfProduction = year; }

    public void setNumOfDoors (int numOfDoors) { this.numOfDoors = numOfDoors; }

    public void numOfWheels (int numOfWheels) { this.numOfWheels = numOfWheels; }



    public Category getCategory() {
        return category;
    }

    public TypeOfFuel getFuel() { return fuel; }

    public boolean getTypeOfAd(){ return this.typeOfAd; }

    public double getPrice() { return this.price; }
}
