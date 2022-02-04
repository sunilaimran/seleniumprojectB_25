package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoPracticeToolVerifications {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(" https://practice.cydeo.com");

        Thread.sleep(3000);

        String currentURL = driver.getCurrentUrl();
        if (currentURL.contains("cydeo")) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }
        String getTITLE = driver.getTitle();
        if (getTITLE.equals("practice")){
            System.out.println("TEST PASSED!");
        }else {
            System.out.println("TEST FAILED!");
        }

        driver.quit();


    }
}
