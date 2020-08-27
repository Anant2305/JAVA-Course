package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isPalindrome(1211));
    }

    public static boolean isPalindrome(int number) {
        int r = 0;
        int temp = number;
        int reverse = 0;
        while(number!=0){
            r=number%10;  //getting remainder
            reverse=(reverse*10)+r;
            number=number/10;
        }
        if(reverse==temp) {
            return true;
        }else{
            return false;
        }
    }
}

