package com.example.series;

import sun.reflect.generics.scope.Scope;

public class Main {

    public static void main(String[] args) {
        String var4 = "This is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();

        System.out.println("scopeInstance var1 is " + scopeInstance.getVar1());
        System.out.println(var4);

        System.out.println("****************************");
        scopeInstance.timesTwo();
        System.out.println("****************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
