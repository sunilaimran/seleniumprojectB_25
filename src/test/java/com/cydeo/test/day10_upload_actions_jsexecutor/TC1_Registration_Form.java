package com.cydeo.test.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC1_Registration_Form {

    @Test
    public void registration_form_test(){
        //1. Open browser
        // 2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

       //create java faker object
        Faker faker = new Faker();

       //3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());

       //4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

       //5. Enter username
        WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        String user = faker.bothify("helpdesk###");
       //inputUserName.sendKeys(faker.bothify("helpdesk###"));other way
        //inputUserName.sendKeys(faker.name().username().replaceAll(".",""));other way

        inputUserName.sendKeys(user);

       //6. Enter email address
        WebElement inputEmailAddress = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmailAddress.sendKeys(user+ "@email.com");

       //7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        //inputPassword.sendKeys("12345678");other way
        //faker.internet().password()
          inputPassword.sendKeys(faker.numerify("########"));

       //8. Enter phone number
        WebElement inputPhoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhoneNumber.sendKeys(faker.numerify("123-456-7890"));//(###-###-####)

       //9. Select a gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

       //10. Enter date of birth
        WebElement inputDateOfBirth = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        //faker.number().numberBetween(2004,1920)
        inputDateOfBirth.sendKeys("03/08/2000");

       //11. Select Department/Office
       Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
       departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));


       //12. Select Job Title
        Select jobTitleDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitleDropdown.selectByVisibleText("QA");


       //13. Select programming language from checkboxes
        //Select ProgrammingLanguageCheckboxes = new Select(Driver.getDriver().findElement(By.xpath()))
       //14. Click to sign up button
       //15. Verify success message “You’ve successfully completed registration.” is



    }




}
/*
//TC#1: Registration form confirmation
//Note: Use JavaFaker OR read from configuration.properties file when possible.
//1. Open browser
//2. Go to website: https://practice.cydeo.com/registration_form
//3. Enter first name
//4. Enter last name
//5. Enter username
//6. Enter email address
//7. Enter password
//8. Enter phone number
//9. Select a gender from radio buttons
//10. Enter date of birth
//11. Select Department/Office
//12. Select Job Title
//13. Select programming language from checkboxes
//14. Click to sign up button
//15. Verify success message “You’ve successfully completed registration.” is
//displayed.
//
//
//Note:
//1. Use new Driver utility class and method
//2. User JavaFaker when possible
//3. User ConfigurationReader when it makes sense
 */