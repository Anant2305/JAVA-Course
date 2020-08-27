package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        while(counter <= 10){
            System.out.println("Enter Number #" + counter + ":");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                sum += scanner.nextInt();
                counter++;
            }else{
                System.out.println("Unable to parse number");
            }

            scanner.nextLine();

        }
        System.out.println("Total value is " + sum );
        scanner.close();

    }
}
