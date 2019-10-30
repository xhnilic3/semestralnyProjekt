package vehicles;


import vehicles.Vehicle;

public class UpTo3Point5 extends Vehicle {

    public UpTo3Point5(boolean typeOfAd, TypeOfFuel fuel, int mileage){
        super(typeOfAd, fuel, mileage, Category.UP_TO_3POINT5);
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
