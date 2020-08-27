package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5));

//        for(init; termination; increment) {
//
//        }
        for(int i=0; i<=5; i++) {
            System.out.println("Loop " + i + " Hello!");
        }

        for(int i=2; i<=8; i++) {
            System.out.println("10,000 at " + i +"% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("**********************");
        for(int i=8; i>=2; i--) {
            System.out.println("10,000 at " + i +"% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("**********************");
        int count = 0;

        for(int i=20; i<45; i++){
            if(isPrime(i)){
                System.out.println(i + " is a Prime Number");
                count++;
                if(count == 10) {
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n){

        if (n == 1) {
            return false;
        }

        for(int i=2; i<= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeSqrRoot(int n){

        if (n == 1) {
            return false;
        }

        for(int i=2; i<= (long) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }
}
