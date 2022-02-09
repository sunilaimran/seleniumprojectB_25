package com.cydeo.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {


    // TASK: NEW METHOD CREATION
// Method name : getDriver
  public static WebDriver getDriver(String browser){
     if (browser.equalsIgnoreCase("chrome")){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
     }else if (browser.equalsIgnoreCase("firefox")){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
     }else {
        return null;
     }
  }

// Accepts String arg: browserType
//   - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"












}
