package com.cydeo.test.day5_testNG_Intro_Dropdowns;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {


    @Test (priority = 1)
    public void test1(){
        System.out.println("Test 1 is running...");

        //ASSERT EQUALS: compare 2 of the same things
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void test2(){
        System.out.println("Test 2 is running...");

        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected));
    }

    @BeforeClass
    public void setupMethod(){
        System.out.println("-----> BeforeClass is running!");

    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("-----> AfterClass is running!");

    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("---> BeforeMethod is running!");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("---> AfterMethod is running!");
    }


}
