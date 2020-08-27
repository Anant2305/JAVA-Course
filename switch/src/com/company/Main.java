package com.company;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if(value == 1) {
//            System.out.println("Value 1");
//        }else if(value == 2){
//            System.out.println("Value 2");
//        }else{
//            System.out.println("Value is not 1 or 2");
//        }

        int switchValue = 3;
        switch(switchValue) {
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value is either 3, 4 or 5");
                System.out.println("Actual Value is " + switchValue);
                break;
            default:
                System.out.println("Value is not 1, 2, 3, 4 or 5");
                break;
        }

        String testValue = "d";
        switch(testValue) {
            case "a":
                System.out.println("value is a");
                break;
            case "b":
                System.out.println("Value is b");
                break;
            case "c": case "d": case "e":
                System.out.println("Value is either c, d or e");
                System.out.println("Actual Value is " + testValue);
                break;
            default:
                System.out.println("Value is not a, b, c, d or e");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Month is Jan");
                break;
            case "may":
                System.out.println("Value is May");
                break;
            default:
                System.out.println("Not Sure");
                break;
        }

    }
}
