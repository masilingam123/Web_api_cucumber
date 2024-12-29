package com.qa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
    public static WebDriver driver;

    public void initbrowser(){

        driver = new ChromeDriver();
    }
    public void navigate(String url)
    {
        driver.get(url);
    }
    public void click(By locator){

        driver.findElement(locator).click();
    }
    public void sendkeys(By locator,String value){

        driver.findElement(locator).sendKeys(value);
    }
    public void gettext(By locator){

       String text= driver.findElement(locator).getText();
       System.out.println(text);

    }


}
