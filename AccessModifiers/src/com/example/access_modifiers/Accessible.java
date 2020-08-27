package com.example.access_modifiers;

//interface is private ans accessible to any class in package above
interface Accessible {
    int SOME_CONSTANT = 100; //private
    public void method(); // public
    void methodB(); //all methodsB are public
    boolean methodC(); //all methodsB are public
}
