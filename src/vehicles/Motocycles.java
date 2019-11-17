package vehicles;

import vehicles.Vehicle;

public class Motocycles extends Vehicle {

    public Motocycles(boolean typeOfAd, TypeOfFuel fuel, int mileage, Brand brand){
        super(typeOfAd, fuel, mileage, Category.MOTOCYCLES, brand);
    }

}
