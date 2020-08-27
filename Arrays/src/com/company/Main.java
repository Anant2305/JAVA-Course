package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] myIntArray = new int[10]; //assign number of elements
        myIntArray[5] = 50;
        System.out.println(myIntArray[5]);

        int[] assignDataArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(assignDataArray[0]);
        System.out.println(assignDataArray[7]);
        System.out.println(assignDataArray[9]);

        int[] assignArrayfor = new int[25];
        for(int i=0; i<assignArrayfor.length; i++){
            assignArrayfor[i] = i * 10;
        }

        printArray(assignArrayfor);
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }
}
