package vehicles;

import vehicles.Vehicle;

public class Bus extends Vehicle {

    public Bus(boolean typeOfAd, TypeOfFuel fuel, int mileage){
        super(typeOfAd, fuel, mileage, Category.BUS);
    }
}
