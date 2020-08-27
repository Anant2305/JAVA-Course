package com.company;

public class speedConverter {

    public static long toMilePerHour(double kilometersPerHour){

        if(kilometersPerHour < 0){
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            long milePerHour = toMilePerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    "km/h= " + milePerHour + "mi/h");
        }
    }

}
