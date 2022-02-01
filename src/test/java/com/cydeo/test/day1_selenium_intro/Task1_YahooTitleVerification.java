package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {

       // TC #1: Yahoo Title Verification
        //1.Open Chrome browser
        //do set up for browser driver
        WebDriverManager.chromedriver().setup();

        // open new browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2.Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");


        //3.Verify title:
        //Expected: Yahoo
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is an expected. verification passed!");
        }else {
            System.err.println("Title is NOT as expected. Verification FAILED!");
        }







    }
}
