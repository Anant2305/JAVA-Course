package com.company;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player anant = new Player("Anant", 20, 15);
        System.out.println(anant.toString());
        savedObject(anant);

        anant.setHitPoints(8);
        System.out.println(anant);
        anant.setWeapon("Hammer");
        savedObject(anant);
        //loadObject(anant);
        System.out.println(anant);

        ISaveable werewolf = new Monster("werewolf", 20, 40);
        //Because this is cast as an Implement you cannot access the get module in the class getStrength
        //to get access to the class modules you need to Casting it as a class again
        //Another way is just to declare it as the class i.e Monster werewolf = new Monster(....)
        //Just remember you need to remember what you are doing and how you are using it to decide which is best for you.
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
        System.out.println(werewolf);
        savedObject(werewolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                            "1 to enter string\n" +
                            "0 to quit");

        while(!quit) {
            System.out.println("Shoose an Option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void savedObject(ISaveable objectToSave) {
        for(int i=0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
