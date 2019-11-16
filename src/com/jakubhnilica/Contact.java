package com.jakubhnilica;

 class Contact {
    private String mailAddress;
    private String phoneNumber;
    private String address;

    /*
    * phone number should be mandatory, others optional*/
     public Contact(String phoneNumber) {
         this.phoneNumber = phoneNumber;
     }

     public Contact(String mailAdress, String phoneNumber, String adress) {
         this.mailAddress = mailAdress;
         this.phoneNumber = phoneNumber;
         this.address = adress;
     }

     /*TODO
     *  consider what should happen in case,
     *  that user's input is empty
     * (e.g. if value will be null or whatever
     */

     public Contact(){}

     public void setMailAddress(String mailAdress) {
         this.mailAddress = mailAdress;
     }

     public void setAddress(String adress) {
         this.address = adress;
     }

     public void setPhoneNumber(String phoneNumber) {
         this.phoneNumber = phoneNumber;
     }
 }
