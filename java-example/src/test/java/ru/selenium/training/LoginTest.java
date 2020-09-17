package ru.selenium.training;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class LoginTest {
    private WebDriver driver;
    private WebDriverWait wait;


    @Before
    public void start(){
        //System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void HWLoginTest()   {
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.cssSelector("button")).click();
        System.out.println(driver.getTitle());
        String textlogIn = "Dashboard | My Store";
        wait.until(titleIs(textlogIn));
        driver.findElement(By.xpath("//*[@id=\"top-bar\"]/li[10]/a")).click();
        System.out.println(driver.getTitle());
        String textLogOut = "My Store";
        wait.until(titleIs(textLogOut));
    }




    @After
  public void stop(){
       driver.quit();
       driver = null;
   }
}
