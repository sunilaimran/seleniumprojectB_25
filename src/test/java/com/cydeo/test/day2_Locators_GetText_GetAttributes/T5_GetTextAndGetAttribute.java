package com.cydeo.test.day2_Locators_GetText_GetAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetTextAndGetAttribute {
    public static void main(String[] args) throws InterruptedException {

        //TC #5: getText() and getAttribute() method practice
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        WebElement headerText = driver.findElement(By.tagName("h2"));

        //Expected: Registration form
        String expectedHeatherText = "Registration form";
        String actualHeatherText = headerText.getText();


        if (actualHeatherText.equals(expectedHeatherText)){
            System.out.println("Heather text verification PASSED!" );
        }else {
            System.out.println("Heather text verification FAILED!");
        }
        //4- Locate “First name” input box
        WebElement FirstNameInput = driver.findElement(By.name("firstname"));


       //5- Verify placeholder attribute’s value is as expected:
       // Expected: first name
         String expectedPlaceHolder = "first name";
         String actualPlaceHolder = FirstNameInput.getAttribute("placeholder");

         if (actualPlaceHolder.equals(expectedPlaceHolder)){
             System.out.println("placeHolder text verification PASSED!");
         }else {
             System.out.println("placeHolder text verification FAILED!!!");
         }

         Thread.sleep(4000);


       driver.close();



    }
}
