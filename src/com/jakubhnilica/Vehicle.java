package com.jakubhnilica;

public class Vehicle {

    protected enum Category {
        UP_TO_3POINT5,
        OVER_3POINT5,
        MOTOCYCLES,
        BUS,
        ATV
    }

    protected enum TypeOfFuel  {
        PETROL,
        DIESEL,
        PETROL_AND_LPG,
        PETROL_AND_CNG,
        HYBRID_FUEL,
        HYBRID_DIESEL,
        ELECTRO
    };

    boolean typeOfAd; // true - offer, false - demand
    /*porozmyslat, ci nespravit naku triedu inzerat*/
    protected int numOfWheels;
    protected int numOfDoors;
    protected int yearOfProduction;
    protected double price;
}
