package com.cydeo.test.day6_testNGContinue;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC4_IframePractice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test //called(anutation)
    public void iframe_test(){

        driver.switchTo().frame("mce_0_ifr");

        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//P"));

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());


    }
}
