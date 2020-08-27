package com.company;

import java.util.Scanner;
import java.util.logging.LoggingPermission;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
 //       Gearbox mcLaren = new Gearbox(6);
        //***** Amended Inner Class Gear to be private so we can nolonger access it this way
        //Added extra public modules to access private class Gears int he gearbox class
        // Gearbox.Gear first = mcLaren.new Gear(1,12.3);
        //you cannot use it like this -- Gearbox second = new Gearbox.Gear(2,15.4);
        // or this way -- Gearbox second = new mcLaren.Gear(2,15.4);
        //System.out.println(first.driveSpeed(1000));
        //*******************************************
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));


        //This is a Local Class using the Buttons Class
            class ClickListener implements Button.OnClickListener {
                public ClickListener() {
                    System.out.println("I've been attached");
                }

                @Override
                public void onClick(String title) {
                    System.out.println(title + " was clicked");
                }
            }

            //btnPrint.setOnClickListener(new ClickListener());
            //we are going to update above to create an Anonymous Class
            btnPrint.setOnClickListener(new Button.OnClickListener(){
                @Override
               public void onClick(String title) {
                    System.out.println(title + " was clicked");
                }
            });
            listen();
    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
