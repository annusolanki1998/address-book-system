package com.bridgelabz;

import java.util.Scanner;

public class AddressBookSystem {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System !");
        Contact contact = addContact();
        System.out.println(contact);
    }

    public static Contact addContact() {
        Contact contact = new Contact();
        System.out.println("Enter First name");
        contact.setFirstName(scanner.next());
        System.out.println("Enter Last name");
        contact.setLastName(scanner.next());
        System.out.println("Enter Address");
        contact.setAddress(scanner.next());
        System.out.println("Enter City name");
        contact.setCity(scanner.next());
        System.out.println("Enter State name");
        contact.setState(scanner.next());
        System.out.println("Enter Zip code");
        contact.setZip(Integer.parseInt(scanner.next()));
        System.out.println("Enter Phone number");
        contact.setPhoneNumber(Integer.parseInt(scanner.next()));
        System.out.println("Enter Email");
        contact.setEmail(scanner.next());
        return contact;
    }
}




