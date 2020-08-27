package com.example._final;

public class SIBTest {
    public static final String owner;

    static {
        owner = "Anant";
        System.out.println("SIB Test static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB Constructor Called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println(":SomeMethod Called");
    }
}
