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

    public void setFuel(TypeOfFuel fuel) { this.fuel = fuel; }

    public void setPrice(double price) { this.price = price; }

    public void setCategory(Category category) { this.category = category; }

    public void setMileage (int mileage) { this.mileage = mileage; }

    public void setYearOfProduction (int year) { this.yearOfProduction = year; }

    public void setNumOfDoors (int numOfDoors) { this.numOfDoors = numOfDoors; }

    public void numOfWheels (int numOfWheels) { this.numOfWheels = numOfWheels; }



    public Category getCategory() {
        return this.category;
    }

    public TypeOfFuel getFuel() {
        return this.fuel;
    }

    public boolean getTypeOfAd(){ return this.typeOfAd; }

    public double getPrice() { return this.price; }

    public int getMileage() {return this.mileage; }

    public int getYearOfProduction() { return this.yearOfProduction; }

    public int getNumOfDoors() { return this.numOfDoors; }

    public int getNumOfWheels() { return this.numOfWheels; }
}
