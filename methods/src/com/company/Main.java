package com.company;

import javax.print.DocFlavor;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your Final Score was " + highScore);
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your Final Score was " + highScore);

        int highScorePOsition = calculatePlayerScorePosition(1500);
        playerPosition("Anant", highScorePOsition);

        highScorePOsition = calculatePlayerScorePosition(900);
        playerPosition("Dipti", highScorePOsition);

         highScorePOsition = calculatePlayerScorePosition(400);
        playerPosition("Ami", highScorePOsition);

         highScorePOsition = calculatePlayerScorePosition(50);
        playerPosition("Shiv", highScorePOsition);

        highScorePOsition = calculatePlayerScorePosition(1000);
        playerPosition("oreo", highScorePOsition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus ) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void playerPosition(String name, int position) {

        System.out.println("Player " + name + " is in position "
                + position + " on the High Score Table");
    }

    public static int calculatePlayerScorePosition(int score) {

//        if (score >=1000) {
//            return 1;
//        }else if (score >= 500) {
//            return 2;
//        }else if (score >= 100) {
//            return 3;
//        }
//        return 4;

        int position = 4;

        if (score >= 1000) {
            position = 1;
        }else if (score >= 500) {
            position = 2;
        }else if (score >= 100) {
            position = 3;
        }

        return position;

    }

}
