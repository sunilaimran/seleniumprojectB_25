package com.cydeo.test.day4_FindElements_Checkboxes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {
    public static void main(String[] args) {

       // DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices
       // 1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

       // 3. Locate all the WebElements on the page using XPATH and/or CSS
       // locator only (total of 6)
       // a. “Home” link

        WebElement HomeLink_ex1 = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement HomeLink_ex2 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        WebElement HomeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));


        // b. “Forgot password” header

        WebElement password_ex1 = driver.findElement(By.cssSelector("div.example > h2"));

        WebElement password_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        // c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement inputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));

        //Locate inputBox using xpath contains method

        //tagName[contains(@attribute,'value')]

        WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));


        // e. “Retrieve password” button
        //button[@type='submit']
        //button[@class='radius']
        WebElement retrievePasswordBtn = driver.findElement(By.xpath("//button[@id='form_submit']"));

        // f. “Powered by Cydeo text
        WebElement CydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        // 4. Verify all web elements are displayed.
        System.out.println("HomeLink_ex1.isDisplayed() = " + HomeLink_ex1.isDisplayed());
        System.out.println("password_ex1.isDisplayed() = " + password_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox_ex1.isDisplayed() = " + inputBox_ex1.isDisplayed());
        System.out.println("retrievePasswordBtn.isDisplayed() = " + retrievePasswordBtn.isDisplayed());
        System.out.println("CydeoText.isDisplayed() = " + CydeoText.isDisplayed());

        // First solve the task with using cssSelector only. Try to create 2 different
        // cssSelector if possible

        // Then solve the task using XPATH only. Try to create 2 different
        // XPATH locator if possible //to move the line com+shift+uo=down









    }
}
