package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("Anant", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(600);
        calculateScore();
        calcFeetAndInchesToCentimeter(6,5);
        calcFeetAndInchesToCentimeter(100);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score);
        return score + 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score);
        return score + 1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed Player No player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeter(double feet, double inches){

        if(feet < 0 || (inches < 0 || inches > 12)){
            System.out.println("Invalid range");
            return -1;
        }

        double totalInches = (feet * 12) + inches;
        double centimetters = totalInches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimetters + "cm");
        return centimetters;
    }

    public static double calcFeetAndInchesToCentimeter(double inches){
        if(inches < 0) {
            System.out.println("Invalid range");
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + "feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeter(feet,remainingInches);
    }
}
