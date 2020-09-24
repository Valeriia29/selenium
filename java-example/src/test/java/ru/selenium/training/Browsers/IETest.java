package ru.selenium.training.Browsers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class IETest {
    private WebDriver driverIE;
    private WebDriverWait waitIE;

    @Before
    public void startIE(){
        //System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver.exe");
        driverIE = new EdgeDriver();
        waitIE = new WebDriverWait(driverIE, Duration.ofSeconds(10));
        driverIE.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void ExecuteTestIE() {
        driverIE.get("http://localhost:8090/litecart/");
        String textlogIn = "My Store | Online Store";
        waitIE.until(titleIs(textlogIn));
    }
    @After
    public void stopIE(){
        driverIE.quit();
        driverIE = null;
    }

}
