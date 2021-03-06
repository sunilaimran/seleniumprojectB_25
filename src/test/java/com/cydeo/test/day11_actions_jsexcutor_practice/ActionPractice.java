package com.cydeo.test.day11_actions_jsexcutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.security.Key;

public class ActionPractice {

    @Test
    public void task_4_and_5_test(){

//        TC #4: Scroll practice
//        1- Open a chrome browser
//        2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

//        3- Scroll down to “Powered by CYDEO”
        //create abject of actions and pass our "driver" instance
        Actions actions = new Actions(Driver.getDriver());

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));


//        4- Scroll using Actions class “moveTo(element)” method

            actions.moveToElement(cydeoLink).perform();

//        1- Continue from where the Task 4 is left in the same test.
//        2- Scroll back up to “Home” link using PageUP button

         actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP ).perform();

            Driver.closeDriver();


    }


}


