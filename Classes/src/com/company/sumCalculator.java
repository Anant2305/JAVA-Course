package com.company;

public class SimpleCalculator {
    // write your code here
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double SecondNumber){
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult() {
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationnResult() {
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult() {
        if(this.secondNumber > 0){
            return this.firstNumber + this.secondNumber;
        }else{
            return 0;
        }
    }
}
