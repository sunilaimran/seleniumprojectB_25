package com.cydeo.test.day9_javafaker_testbase_driverutil;

public class Singleton {

    //#1- create private constructor
    private Singleton(){}

    //#2- create private static String
    // prevent access and provide a getter method
    private static String word;

    public static String getWord(){

        //This utility method will return the "word" in the way we want to return
        if (word == null){
            System.out.println("First time call. Word object is null. " +
                    "Assigning value to it now!");
            word = "something";
        }else {

        }
        return word;
    }



}
