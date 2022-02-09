package com.cydeo.test.day3_;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

       // TC #1: NextBaseCRM, locators and getText() practice
        // 1- Open a Chrome browser
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: "https://login1.nextbasecrm.com/"
        driver.get("https://login1.nextbasecrm.com/");

       // 3- Enter incorrect username: “incorrect”
        WebElement inputUserName = driver.findElement(By.className("login-inp"));
       inputUserName.sendKeys("Incorrect");

       // 4- Enter incorrect password: “incorrect”
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("Incorrect");

        //5- Click to login button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        // 6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));
        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();

        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Error message verification PASSED!");
        }else {
            System.out.println("Error message verification FAILED!!!");
        }

         Thread.sleep(3000);
        // PS: Inspect and decide which locator you should be using to locate web elements

      driver.close();





    }
}
