package ru.selenium.training;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
     * Created by k.grigorchuk on 27.02.2017.
     */
    public class MyFirstTest {

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
        public void MyFirstTest()   {
            driver.get("http://www.google.com/");
            driver.findElement(By.name("q")).sendKeys("hello");
            driver.findElement(By.name("btnK")).click();
            System.out.println(driver.getTitle());
            String text2 = "hello - Поиск в Google";
            wait.until(titleIs(text2));
            wait.withTimeout(Duration.ofSeconds(6));

            driver.get("https://www.youtube.com/");
            driver.findElement(By.name("search_query")).sendKeys("hello");
            driver.findElement(By.id("search-icon-legacy")).click();
            System.out.println(driver.getTitle());
            String text3 = "hello - YouTube";
            wait.until(titleIs(text3));
            wait.withTimeout(Duration.ofSeconds(6));
            //  System.out.println(driver.getTitle());
            //  String text = "hello - Поиск в Google";
            // wait.until(titleIs(text));

            driver.get("https://yandex.ru/");
            driver.findElement(By.name("text")).sendKeys("hello");
            driver.findElement(By.className("button__text")).click();


        }

/*    @Test
        public void MyFirstTest(){
        driver.get("https://yandex.ru/");
        driver.get("https://www.youtube.com/");
    }*/


        @After
        public void stop(){
            driver.quit();
            driver = null;
        }

    }


