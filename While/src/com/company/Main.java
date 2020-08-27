package com.company;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
	    while(count != 5){
            System.out.println("Count valie is " + count);
            count++;
        }

        System.out.println("***************");
	    count = 1;
	    while(true) {
	        if(count == 5) {
	            break;
            }
            System.out.println("Count Value is " + count);
	        count++;
        }

        System.out.println("***************");

	    count = 1;
	    do{
            System.out.println("Count value was " + count);
            count++;
            if(count > 100) {
                break;
            }
        }while(count != 6);

        System.out.println("***************");

        int number = 4;
        int finishedNumber = 20;
        int evenNumbersFound = 0;

        while(number <= finishedNumber) {
            number++;
            if(!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even Number " + number);

            evenNumbersFound++;
            if(evenNumbersFound >= 5){
                break;
            }


        }

        System.out.println("Total Even Numbers Found " + evenNumbersFound);

    }

    public static boolean isEvenNumber(int value){
        if((value % 2) == 0){
            return true;
        }else{
            return false;
        }
    }
}
