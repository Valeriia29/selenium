package ru.selenium.training.Browsers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class CHTest {
    private WebDriver driverCH;
    private WebDriverWait waitCH;
    @Before
    public void startCH(){
        //System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver.exe");
        driverCH = new ChromeDriver();
        waitCH = new WebDriverWait(driverCH, Duration.ofSeconds(10));
        driverCH.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void ExecuteTestCH() {
        driverCH.get("http://localhost:8090/litecart/");
        String textlogIn = "My Store | Online Store";
        waitCH.until(titleIs(textlogIn));

    }
    @After
    public void stopCH(){
        driverCH.quit();
        driverCH = null;
    }
}
