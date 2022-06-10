package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;
public class AddressBookSystem {
    public static Scanner scanner = new Scanner(System.in);
    static ArrayList<Contact> addressBook = new ArrayList<Contact>();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System !");
        AddressBookSystem addressbooksystem = new AddressBookSystem();
        addressbooksystem.addContactDetails();
    }

    public static Contact addContactDetails() {

        Contact contact = new Contact();
        System.out.println("Enter First name");
        String firstName = scanner.next();
        contact.setFirstName(scanner.next());

        System.out.println("Enter Last name");
        String lastName = scanner.next();
        contact.setLastName(scanner.next());

        System.out.println("Enter Address");
        contact.setAddress(scanner.next());
        String address = scanner.next();

        System.out.println("Enter City name");
        contact.setCity(scanner.next());
        String city = scanner.next();

        System.out.println("Enter State name");
        contact.setState(scanner.next());
        String state = scanner.next();

        System.out.println("Enter Zip code");
        int zip = scanner.nextInt();
        contact.setZip(Integer.parseInt(scanner.next()));

        System.out.println("Enter Phone number");
        long phoneNumber = scanner.nextLong();
        contact.setPhoneNumber(Long.parseLong(scanner.next()));

        System.out.println("Enter Email");
        contact.setEmail(scanner.next());
        String email = scanner.next();


        addressBook.add(contact);
        Contact details1 = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addressBook.add(details1);
        System.out.println(addressBook);
        System.out.println("Successfully created contacts");
        return contact;


    }

}






