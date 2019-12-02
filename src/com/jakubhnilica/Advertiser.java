package com.jakubhnilica;

import vehicles.Vehicle;
import java.util.ArrayList;
import java.util.List;

public class Advertiser extends Customer {

    private  List<Vehicle> myVehicles = new ArrayList<>();

    public Advertiser(String firstName, String secondName,  boolean legalStatus) {
        super(firstName, secondName, legalStatus);
    }


    public void addAd(Vehicle vehicle) {
        this.myVehicles.add(new Vehicle(vehicle.getTypeOfAd(), vehicle.getFuel(),
                vehicle.getMileage(), vehicle.getCategory(), vehicle.getBrand()));
    }

    public void getMyAds() {
        for (int i = 0; i < this.myVehicles.size(); i++)
            System.out.println(i + ": " + this.myVehicles.get(i));
    }

    public void getMyAds(int i) {
        System.out.println(this.myVehicles.get(i));
    }

    @Override
    public int getId() {
        if (super.getId() != Customer.getLoggedIn())
            return 0;
        return 1;
    }
}
