package com.jakubhnilica;

import vehicles.Vehicle;
import java.util.Scanner;
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
        int i = 1;
        System.out.println(i + ": " + this.myVehicles.get(i));
    }
}
