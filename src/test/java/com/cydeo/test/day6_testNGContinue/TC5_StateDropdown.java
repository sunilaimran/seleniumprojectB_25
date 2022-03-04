package com.cydeo.test.day6_testNGContinue;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC5_StateDropdown {

    @Test
    public void dropdown_task5() throws InterruptedException {
        //TC #5: Selecting state from State dropdown and verifying result 1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");

       Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

       // Use all Select options. (visible text, value, index)
//        3. Select Illinois
        Thread.sleep(1000);
        stateDropDown.selectByVisibleText("Illinois");

      // 4. Select Virginia
       Thread.sleep(1000);
        stateDropDown.selectByValue("VA");

        //5. Select California
       Thread.sleep(1000);
        stateDropDown.selectByIndex(5);// in selenium index start from 1

        //6. Verify final selected option is California.
        String expectedOptionText = "California";
        String actualOptionText = stateDropDown.getFirstSelectedOption().getText();


    }
}