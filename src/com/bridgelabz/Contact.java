package com.bridgelabz;

public class Contact {
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String phoneNumber;
    public String email;

    public Contact(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = String.valueOf(zip);
        this.phoneNumber = String.valueOf(phoneNumber);
        this.email = email;

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = String.valueOf(zip);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = String.valueOf(phoneNumber);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact() {

    }

    public Contact(String firstName2, String lastName2, String address2, String city2, String state2, String zip2, String phoneNumber2, String email2) {
        this.firstName = firstName2;
        this.lastName = lastName2;
        this.address = address2;
        this.city = city2;
        this.state = state2;
        this.zip = String.valueOf(zip2);
        this.phoneNumber = String.valueOf(phoneNumber2);
        this.email = email2;

    }

    public String toString() {
        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ",  address=" + address + ", city=" + city + ", state=" + state + ", zip="
                + zip + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";

    }

}

