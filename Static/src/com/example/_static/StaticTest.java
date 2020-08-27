package com.example._static;

public class StaticTest {
    //using static generates a sharing variable being used by any new generated in mains.
    private static int numInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    //By using Static here you can access it by just using Classname and module name i.e. StaticClass.getNumInstances in Main
    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
