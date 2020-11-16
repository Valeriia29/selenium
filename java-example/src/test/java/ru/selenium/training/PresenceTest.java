package ru.selenium.training;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class PresenceTest {
    public WebDriver driver;
    public WebDriverWait wait;


    @Before
    public void start(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public  boolean isElementPresent(By locator){
        try {
            driver.findElement(locator);
            return true;
        }
        catch (NoSuchElementException e) {
            return false;
        }
    }
}
