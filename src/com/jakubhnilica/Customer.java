package com.jakubhnilica;

public class Customer {
    String firstName;
    String secondName;
    String contact;
    private static int customerCounter = 0;
    /*TODO
    *  implementovat naky asociativny zoznam alebo co na ten kontakt
    *  neh ide rozlisit, ci ide o telefonne cislo, mail... */
    int credibility;
    boolean legalStatus;
    /*porozmyslat nad vhodnejsim pomenovanim, spytat sa
    * myslene tak, 1 - fyzicka osoba
    *              2 - pravnicka osoba*/

    public Customer(String firstName, String secondName, String contact, boolean legalStatus) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.contact = contact;
        this.legalStatus = legalStatus;
        increaseCounter();
    }

    public void increaseCounter() { Customer.customerCounter++; }

    public static int getCustomerCounter() { return customerCounter; }
}
