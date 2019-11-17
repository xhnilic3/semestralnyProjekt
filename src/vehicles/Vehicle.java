package vehicles;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    private Category category;
    private TypeOfFuel fuel;
    private Brand brand;

    public enum Category {
        UP_TO_3POINT5,
        ABOVE_3POINT5,
        MOTOCYCLES,
        BUS,
        ATV
    }

    public enum TypeOfFuel  {
        PETROL,
        DIESEL,
        PETROL_AND_LPG,
        PETROL_AND_CNG,
        HYBRID_FUEL,
        HYBRID_DIESEL,
        ELECTRO
    }

    public enum Brand {
        SKODA,
        VOLKSWAGEN,
        FORD,
        PEUGEOT,
        FIAT,
        SEAT
    }

    private boolean typeOfAd; // true - offer, false - demand
    /*porozmyslat, ci nespravit naku triedu inzerat*/
    private int numOfWheels;
    private int numOfDoors;
    private int yearOfProduction;
    private double price;
    private int mileage;
    /*Porozmyslat, ci chcem visibility aj von z balicka (pri subclass)*/
    //Vehicle[] allVehicles = new Vehicle[100];
    private static List<Vehicle> allVehicles = new ArrayList<>();

    public Vehicle(boolean typeOfAd, TypeOfFuel fuel, int mileage, Category category,
                    Brand brand){
        this.typeOfAd = typeOfAd;
        this.fuel = fuel;
        this.mileage = mileage;
        this.category = category;
        this.brand = brand;
        allVehicles.add(this);
    }

   // public Vehicle() {};

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

    public Brand getBrand() { return this.brand; }

    public static List<Vehicle> printVehicles(){
        return allVehicles;
    }
}
