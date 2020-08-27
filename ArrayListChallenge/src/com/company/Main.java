package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("07950 853 316");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printAction();
        while(!quit) {
            System.out.println("\nEnter Action: (6 to show available actions");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("\n Shutting Down");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printAction();
                    break;
            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name");
        String name = scanner.nextLine();
        System.out.println("Enter Phone number");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New Contact added: Name - " + name + ", Phone - " + phone);
        }else{
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing Contact");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact Not Found");
            return;
        }

        System.out.println("Enter New Contact Name:");
        String newName = scanner.nextLine();
        System.out.println("Enter New Contact Number:");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfully Updated");
        }else{
            System.out.println("Error Updating Record");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing Contact");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact Not Found");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully Deleted");
        }else{
            System.out.println("Error deleting record");
        }
    }

    private static void queryContact(){
        System.out.println("Enter existing Contact");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact Not Found");
            return;
        }
        System.out.println("Name: " +existingContactRecord.getName() + " phone Number is " + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("Starting Phone....");
    }

    private static void printAction(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shitdown\n" +
                "1 - to Print Contacts\n" +
                "2 - to Add New Contacts\n" +
                "3 - to Update Contacts\n" +
                "4 - to Remove Contacts\n" +
                "5 - to Query Contact Exists\n" +
                "6 - to Print List of Actions\n");
        System.out.println("Choose your Actions: ");

    }
}
