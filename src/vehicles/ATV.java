package vehicles;

import vehicles.Vehicle;

public class ATV extends Vehicle {

    public ATV(boolean typeOfAd, TypeOfFuel fuel, int mileage){
        super(typeOfAd, fuel, mileage, Category.ATV);
        
    }
}
