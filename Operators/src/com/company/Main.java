package com.company;

import java.lang.reflect.GenericDeclaration;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; //1 + 2 = 3
        System.out.println(" 1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3- 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; //2 *10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3; //remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        //result + result + 1;
        result++; //1 + 1 = 2
        System.out.println(" 1 + 1 = " + result);

        result--; //2 + 1 = 1
        System.out.println(" 2 + 1 = " + result);

        //result = result + 2
        result += 2; //1 + 2 = 3
        System.out.println(" 1 + 2 = " + result);

        result *= 10 ;
        System.out.println(" 3+ 10 = " + result);

        result /= 3;
        System.out.println(" 30 + 3 = " + result);

        result -=2;
        System.out.println(" 10 - 2 = " + result);

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("ANd I am scared of Aliens");
        }

        int topScore =80 ;

        if(topScore < 100) {
            System.out.println("you got the High Score");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater then second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or Both conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar){
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar? true : false;
        if (wasCar) {
            System.out.println("isCar " + wasCar);
        }

        //http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

        //Operator Challenge

        double firstValue = 20.00;
        double secondValue = 80.00;
        double total = (firstValue + secondValue) * 100;
        System.out.println("Total is = " + total);
        double totalRemainder = total % 40.00;
        System.out.println("Remainder is = " + totalRemainder);

        boolean hasRemainder = (totalRemainder == 0)? true : false;
        System.out.println("Has No Remainder " + hasRemainder);

        if (!hasRemainder) {
            System.out.println("Got SOme Remainder");
        }


    }
}
