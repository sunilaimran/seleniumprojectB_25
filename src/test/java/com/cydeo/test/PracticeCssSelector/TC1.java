package com.cydeo.test.PracticeCssSelector;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1 {
    public static void main(String[] args) {

       // TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
       // 1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com/
        driver.get(" https://login1.nextbasecrm.com/");



       // 3- Verify “Log in” button text is as expected:
       // Expected: Log In

        WebElement singInButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedButtonText = "Log In";

        String actualButtonText = singInButton.getAttribute("value");

        System.out.println("actualButtonText = " + actualButtonText);

       if (actualButtonText.equals(expectedButtonText)){
           System.out.println("PASSED!!!!");
       }else {
           System.out.println("FAILED!");
       }


        driver.close();
    }
}
