package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    class IntClass {
        private int myValue;

        public IntClass(int myValue) {
            this.myValue = myValue;
        }
        public int getMyValue() {
            return myValue;
        }

        public void setMyValue(int myValue) {
            this.myValue = myValue;
        }


    }

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Anant");

        // ArrayList<int> intArrayList = new ArrayList<int>();
        // this does not work as you need to assign a class ti the ArrayList and int is not a class.
        // one way to fix is to create a class (i.e IntClass above) and pass that to the array list as below
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        //intClassArrayList.add(new IntClass(54));
        //Integer integer = new Integer(54);
        //Double doubleValue = new Double(12.25);

        // Autoboxing is converting a basic primitive type to a Class type i.e int to Integer
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++){
            intArrayList.add(Integer.valueOf(i)); // i is primitive type int and it is converted to Integer Value and stored int he Array List AUTOBOXING
        }

        for(int i=0; i<=10; i++){
            System.out.println(i + " => " + intArrayList.get(i).intValue()); // Get Array List items and convert them to int Value UNBOXING
        }

        Integer myIntValue = 56; // this will convert this to Interger.valueOf(56) at compile time; AutoBoxing
        int myInt = myIntValue; //this will also work and will convert to myInt.intValue() at compile time Unboxing

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10.00; dbl+= 0.5){
            myDoubleValues.add(dbl);
        }

        for(int i=0; i<myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i);
            System.out.println(i + " => " + value);
        }

    }
}
