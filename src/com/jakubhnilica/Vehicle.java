package com.jakubhnilica;

public class Vehicle {

    protected enum Category {
        UP_TO_3POINT5,
        ABOVE_3POINT5,
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
    int numOfWheels;
    int numOfDoors;
    int yearOfProduction;
    double price;
    int mileage;
    /*Porozmyslat, ci chcem visibility aj von z balicka (pri subclass)*/
}
