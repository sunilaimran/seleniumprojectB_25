package com.cydeo.test.day2_Locators_GetText_GetAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_CydeoVerifications {
    public static void main(String[] args) throws InterruptedException {

        // TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");

        Thread.sleep(3000);

        //3. Verify URL contains
        // Expected: cydeo
        String expectedURL = "cydeo";
        String acturalURL = driver.getCurrentUrl();

        if (acturalURL.contains(expectedURL)){
            System.out.println("URL VERIFICATION PASSED!");
        }else {
            System.out.println("URL VERIFICATION FAILED!");
        }
        //4. Verify title:
        //Expected: Practice

        String expectedTitle = "Practice";
        String actuelTitle = driver.getTitle();

        if (actuelTitle.equals(expectedTitle)){
            System.out.println("TITLE VERIFICATION PASSED!");
        }else {
            System.out.println("TITLE VERIFICATION FAILED!");
        }

       driver.close();








    }
}
