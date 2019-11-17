package com.jakubhnilica;

import vehicles.ATV;
import vehicles.Motocycles;
import vehicles.UpTo3Point5;
import vehicles.Vehicle;
import java.util.Scanner;
import vehicles.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        UpTo3Point5 vehicle1 = new UpTo3Point5(false, Vehicle.TypeOfFuel.PETROL,
                 192000, Vehicle.Brand.VOLKSWAGEN);

        ATV vehicle2 = new ATV(false, Vehicle.TypeOfFuel.PETROL, 23000, Vehicle.Brand.PEUGEOT);

        Motocycles vehicle3 = new Motocycles(true, Vehicle.TypeOfFuel.HYBRID_FUEL,
                500000, Vehicle.Brand.PEUGEOT);


        System.out.println(Vehicle.printVehicles());

        Advertiser advertiser = new Advertiser("Michal", "Hucko", true);
        Advertiser advertiser1 = new Advertiser("Jakub", "Hnilica", false);
        Advertiser advertiser2 = new Advertiser("Jan", "Mrkva", true);
        advertiser.setContact();
        advertiser.addAd(new Vehicle(false, Vehicle.TypeOfFuel.DIESEL, 12587,
                Vehicle.Category.UP_TO_3POINT5, Vehicle.Brand.SEAT));

    }
}
