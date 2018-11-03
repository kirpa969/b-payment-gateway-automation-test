package com.seleniumargostest.SearchTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchTestSuit {

    public static WebDriver driver;

    @Before
    public void openBrowser(){

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.argos.co.uk");
    }

    @Test
    public void search(){

        driver.findElement(By.cssSelector("#searchTerm")).sendKeys("nike");
        driver.findElement(By.cssSelector("#searchTerm")).sendKeys(Keys.ENTER);
    }

    @After
    public void closeBrowser(){

        driver.quit();
    }
}
