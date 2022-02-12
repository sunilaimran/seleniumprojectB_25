package com.cydeo.test.day4_XPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_CheckedBoxes {
    public static void main(String[] args) throws InterruptedException {

        //Practice: Checkboxes
        //1. Go to https://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(" https://practice.cydeo.com/checkboxes");

        //we have to locate checkboxes
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));


        //2. Confirm checkbox #1 is NOT selected by default
        System.out.println("checkBox1.isSelected(), expecting = false " + checkBox1.isSelected());

        // 3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkBox2.isSelected(), expecting = false " + checkBox2.isSelected() );

        //4. Click checkbox #1 to select it.
        Thread.sleep(2000);
        checkBox1.click();

        //5. Click checkbox #2 to deselect it.
        Thread.sleep(2000);
        checkBox2.click();

       // 6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkBox1.isSelected(), expecting = true " + checkBox1.isSelected());

        //7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkBox2.isSelected(), ecpected = false " + checkBox2.isSelected());


    }
}
