package com.cydeo.test.PracticeCssSelector;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC5_StaleDropDown {


//    TC #5: Selecting state from State dropdown and verifying result



//6. Verify final selected option is California.
//    Use all Select options. (visible text, value, index)

public WebDriver driver;


    @BeforeMethod
    public void setupMethod(){
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/dropdown");

    }

     @Test
    public void stateDropdown() throws InterruptedException {
         //           3. Select Illinois

         Select stateDropDown = new Select (driver.findElement(By.xpath("//select[@id='state']")));
         stateDropDown.selectByValue("IL");


         //4. Select Virginia
         Thread.sleep(2000);
         stateDropDown.selectByVisibleText("Virginia");

         //5. Select California
         Thread.sleep(2000);
         stateDropDown.selectByIndex(5);

         //6. Verify final selected option is California.
         String expectedOptionText = "California";
        

     }

}
