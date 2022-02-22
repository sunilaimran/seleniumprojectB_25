package com.cydeo.test.day6_testNGContinue;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1_AlertPractices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
       // 1. Open browser


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        // 2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

       @Test
    public void alert_test1(){
           //3. Click to “Click for JS Prompt” button

           WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));


           informationAlertButton.click();


           //4. Send “hello” text to alert

           Alert alert = driver.switchTo().alert();



         //5. Click to OK button from the alert

           WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

           Assert.assertTrue(resultText.isDisplayed(),"Result text is NOT displayed");

           String expectedText = "You successfully clicked an alert";


       }












}
//  TC #3: Information alert practice
//
//
//          6. Verify “You entered:  hello” text is displayed.