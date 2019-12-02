package com.jakubhnilica;
import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    private String firstName;
    private String secondName;
    private Contact contact = new Contact();
    private static LoggedIn loggedIn = LoggedIn.getInstance();
    private int id;


    private static List<Vehicle> myVehicles = new ArrayList<Vehicle>();

    private static int customerCounter = 0;
    private boolean legalStatus; // distinguish between natural and legal person

    public Customer(String firstName, String secondName,  boolean legalStatus) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.legalStatus = legalStatus;
        this.id = Customer.getCustomerCounter();
        increaseCounter();
    }

    private void increaseCounter() { Customer.customerCounter++; }

    private static int getCustomerCounter() { return customerCounter; }

    /*TODO
    *  solve the problem of multiple choices within
    * setting contact attributes  (use Swing)*/

    public void setContact() {
        Scanner scanContact = new Scanner(System.in);
        System.out.println("Set e-mail address:");
        this.contact.setMailAddress(scanContact.nextLine());
        System.out.println("Set phone number:");
        this.contact.setPhoneNumber(scanContact.nextLine());
        System.out.println("Set address:");
        this.contact.setAddress(scanContact.nextLine());
    }

    public int getId() {
        return this.id;
    }

    public void logIn() {
        LoggedIn.setId(this.id);
    }

    private static void setLoggedIn(int id) {
        LoggedIn.setId(id);
    }

    public static int getLoggedIn() {
        return LoggedIn.getId();
    }

}
