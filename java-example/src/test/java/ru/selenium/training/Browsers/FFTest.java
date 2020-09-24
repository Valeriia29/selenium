package ru.selenium.training.Browsers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class FFTest {
    private WebDriver driverFF;
    private WebDriverWait waitFF;
    @Before
    public void startFF(){
        //System.setProperty("webdriver.firefox.marionette", "C:\\workspace\\geckodriver.exe");
        driverFF = new FirefoxDriver();
        waitFF = new WebDriverWait(driverFF, Duration.ofSeconds(10));
        driverFF.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void ExecuteTestFF() {
        driverFF.get("http://localhost:8090/litecart/");
        String textlogIn = "My Store | Online Store";
        driverFF.findElement(By.xpath("/html/body/div/main/div[1]/section/h2"));
        waitFF.until(titleIs(textlogIn));
    }
    @After
    public void stopFF(){
        driverFF.quit();
        driverFF = null;
    }
}
