package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {
    public static void main(String[] args) {

        //1-setting up the web driver manager
        //we create our "Browser driver"
        WebDriverManager.chromedriver().setup();

        //2-create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //3-TEST IF DRIVER IS WORKING AS EXPECTED
        driver.get("https://www.google.com");

       driver.quit();


    }
}
