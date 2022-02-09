package com.cydeo.test.PracticeCssSelector;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC2 {
    public static void main(String[] args) {


       // TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));

        String expectedButtonText = "Reset password";

        String actualButtonText = resetPasswordButton.getText();

        if (actualButtonText.equals(expectedButtonText)){
            System.out.println("PASSED!");
        }else {
            System.out.println("FAILED!!!");
        }




        driver.close();



    }
}
