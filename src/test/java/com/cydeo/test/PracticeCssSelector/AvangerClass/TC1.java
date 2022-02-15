package com.cydeo.test.PracticeCssSelector.AvangerClass;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1 {
    public static void main(String[] args) {



        // TC:1 As a user I should be able to see Home is displayed

        //1-open a chrome browser

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");

        //3-verify Home is displayed
        WebElement homeWebElement = driver.findElement(By.xpath("//ul[@id='top-menu']/li[1]/a"));
        if (homeWebElement.isDisplayed()){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        driver.close();

    }
}
