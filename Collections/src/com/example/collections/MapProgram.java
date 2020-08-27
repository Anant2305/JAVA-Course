package com.example.collections;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        //java.util.Map<String, String> languages = new HashMap<>();
        //first string is the id and is unique
        //second can be any value;
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "A complied high level, oo, platform independent language");
        languages.put("Python", "An Interpreted, OO, High-level program");
        languages.put("Alpha", "An Algorithmic language");
        languages.put("BASIC", "Beginners All Purpose Symbolic Instruction COde");
        languages.put("LISP", "There in lies madness");

        System.out.println(languages.get("Java"));
        //Because the first element is unique
        //when you use the same id it will not return an error but over write it.
        languages.put("Java", "Java has been over written");
        System.out.println(languages.get("Java"));

        //to check if id already exists you can do this
        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        }else{
            languages.put("Java", "Java did not exists in map");
        }

        System.out.println("=============================================");

        //two ways to remove elements from a hashMap
        //languages.remove("LISP");
        //Here you can check if the key and value and if both match are found
        // then it ie removed from the hashMap
        if(languages.remove("Alpha", "An family of Algorithmic language")){
            System.out.println("Alpha");
        }else{
            System.out.println("Alpha not removed, key/value pair not found");
        }

        if(languages.remove("Alpha", "An Algorithmic language")){
            System.out.println("Alpha removed");
        }else{
            System.out.println("Alpha not removed, key/value pair not found");
        }

        System.out.println(languages.replace("LISP", "A functional programming language"));
        System.out.println(languages.replace("Scala", "This will not be added"));

        if(languages.replace("LISP", "A functional programming language", "HELLO WORLD")){
            System.out.println("Lisp replaced");
        }else{
            System.out.println("Lisp was not replaced");
        }
        for(String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }



    }
}
