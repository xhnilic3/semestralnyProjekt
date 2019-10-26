package com.jakubhnilica;

public class Main {

    public static void main(String[] args) {
	// write your code here
        UpTo3Point5 vehicle1 = new UpTo3Point5(false, Vehicle.TypeOfFuel.PETROL,
                Vehicle.Category.UP_TO_3POINT5, 192000);
        System.out.println(vehicle1.getCategory());
        vehicle1.setFuel(Vehicle.TypeOfFuel.PETROL);
        System.out.println(vehicle1.getFuel());
        vehicle1.getTypeOfAd();
        vehicle1.setPrice(1499.85);
        System.out.println(vehicle1.getPrice());
    }
}
