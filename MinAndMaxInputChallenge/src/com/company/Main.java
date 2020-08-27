package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;;
        //boolean first = true;

        while(true) {
            System.out.println("Enter Number:");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int value = scanner.nextInt();

                //if(first){
                //    first = false;
                //    min = value;
                //    max = value;
                //}

                if(value > max) {
                    max = value;
                }
                if(value < min) {
                    min = value;
                }
            }else{
                break;
            }

            scanner.nextLine();

        }
        System.out.println("Min Number is " + min + ". Max Number is " + max);
        scanner.close();
    }
}
