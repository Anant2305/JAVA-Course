package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int totalSum = sumOdd(1,11);
        System.out.println(totalSum);
    }

    public static boolean isOdd(int number){
        if(number <= 0){
            return false;
        }

        if(number % 2 != 0){
           return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;

        if((start > 0) && (end > 0) && (start<=end) ) {
            for (int i=start; i<=end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }else{
            return -1;
        }
    }

}
