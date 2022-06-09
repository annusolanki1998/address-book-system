package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem {
    public static Scanner scanner = new Scanner(System.in);
    static ArrayList<Contact> addressBook = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System !");

        System.out.println("Enter First name");
        String firstName = scanner.next();
        System.out.println("Enter Last name");
        String lastName = scanner.next();
        System.out.println("Enter Address");
        String address = scanner.next();
        System.out.println("Enter City name");
        String city = scanner.next();
        System.out.println("Enter State name");
        String state = scanner.next();
        System.out.println("Enter Zip code");
        int zip = scanner.nextInt();
        System.out.println("Enter Phone number");
        long phoneNumber = scanner.nextLong();
        System.out.println("Enter Email");
        String email = scanner.next();
        //return contact;

        Contact details1 = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addressBook.add(details1);
        System.out.println(addressBook);
        System.out.println("Successfully created contacts");


    }
}




