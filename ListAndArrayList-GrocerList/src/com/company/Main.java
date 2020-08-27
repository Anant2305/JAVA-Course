package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To Print Choice Options.");
        System.out.println("\t 1 - To Print List of Grocery Items.");
        System.out.println("\t 2 - To Add Item to List.");
        System.out.println("\t 3 - To Modify Item In List.");
        System.out.println("\t 4 - To Remove Item From List.");
        System.out.println("\t 5 - To Search Item in List.");
        System.out.println("\t 6 - To Quit Application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Current Item Name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter New Item Name: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemName,newItem);
    }

    public static void removeItem(){
        System.out.print("Enter Item Number: ");
        String itemName = scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void searchForItem(){
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        }else{
            System.out.println(searchItem + " is not in the grocery list");
        }

    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList()); //One way to copy array list to another array list

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList()); //another way to copy array list to another array list

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

}
