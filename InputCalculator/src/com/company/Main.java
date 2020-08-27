package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        long avg = 0;
        int sum = 0;
        int count = 0;
        while(true) {
            System.out.println("");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int value = scanner.nextInt();
                sum += value;
                count++;
                avg = Math.round((double)sum/count);
            }else{
                break;
            }

            scanner.nextLine();
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }

}
