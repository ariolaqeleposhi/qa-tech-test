package com.ecsdigital.automation;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class selectElement {

    WebDriver driver = new FirefoxDriver();
    driver.get("http://localhost:3000/");

    try{

        Thread.sleep(5000);
        driver.findElement(By.id("render-challenge")).click();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }

    }
}

