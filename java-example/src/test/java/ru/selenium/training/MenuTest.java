package ru.selenium.training;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MenuTest extends PresenceTest{
    private String adm = "admin";

    @Test
    public void menuItemsClick(){
    driver.get("http://localhost:8090/litecart/admin/");
    driver.findElement(By.name("username")).sendKeys(adm);
    driver.findElement(By.name("password")).sendKeys(adm);
    driver.findElement(By.cssSelector("button")).click();
    //Appearance
    driver.findElement(By.xpath("//span[contains(text(),'Appearance')]")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//div[@class=\"panel-heading\" and contains(.,\" Template  \")]")));
    driver.findElement(By.xpath("//span[@class=\"name\" and contains(text(),\"Logotype\")]")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Logotype  \")]")));
    //Catalog
    driver.findElement(By.xpath("//span[contains(text(),'Catalog')]")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Catalog  \")]")));
    driver.findElement(By.xpath("//span[@class=\"name\" and contains(text(),'Attribute Groups')]")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Attribute Groups  \")]")));
    driver.findElement(By.xpath("//span[contains(text(),'Manufacturers')]")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Manufacturers  \")]")));
    driver.findElement(By.xpath("//span[contains(text(),'Suppliers')]")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Suppliers  \")]")));
    driver.findElement(By.xpath("//span[contains(text(),'Delivery Statuses')]")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Delivery Statuses  \")]")));
    driver.findElement(By.xpath("//span[contains(text(),'Sold Out Statuses')]")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Sold Out Statuses  \")]")));
    driver.findElement(By.xpath("//span[contains(text(),'Quantity Units')]")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Quantity Units  \")]")));
    driver.findElement(By.xpath("//span[contains(text(),'CSV Import/Export')]")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" CSV Import/Export  \")]")));
    //Countries
        driver.findElement(By.xpath("//span[contains(text(),'Countries')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Countries  \")]")));
    //Currencies
        driver.findElement(By.xpath("//span[contains(text(),'Currencies')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Currencies  \")]")));
    //Customers
        driver.findElement(By.xpath("//span[contains(text(),'Customers')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Customers  \")]")));
        driver.findElement(By.xpath("//span[contains(text(),'CSV Import/Export')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" CSV Import/Export  \")]")));
        driver.findElement(By.xpath("//span[contains(text(),'Newsletter')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Newsletter  \")]")));
    //Geo Zones
        driver.findElement(By.xpath("//span[contains(text(),'Geo Zones')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Geo Zones  \")]")));
    //Languages
        driver.findElement(By.xpath("//span[contains(text(),'Languages')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Languages  \")]")));
        driver.findElement(By.xpath("//span[contains(text(),'Storage Encoding')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Storage Encoding  \")]")));
    //Modules
        driver.findElement(By.xpath("//span[contains(text(),'Modules')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Customer Modules  \")]")));
        driver.findElement(By.xpath("//span[contains(text(),'Shipping Modules')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Shipping Modules  \")]")));
        driver.findElement(By.xpath("//span[contains(text(),'Payment Modules')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Payment Modules  \")]")));
        driver.findElement(By.xpath("//span[contains(text(),'Order Modules')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Order Modules  \")]")));
        driver.findElement(By.xpath("//span[contains(text(),'Order Total Modules')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Order Total Modules  \")]")));
        driver.findElement(By.xpath("//span[contains(text(),'Job Modules')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Job Modules  \")]")));
    //Orders
        driver.findElement(By.xpath("//span[contains(text(),'Orders')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Orders  \")]")));
        driver.findElement(By.xpath("//span[contains(text(),'Order Statuses')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Order Statuses  \")]")));
    //Pages
        driver.findElement(By.xpath("//span[contains(text(),'Pages')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Pages  \")]")));
        driver.findElement(By.xpath("//span[contains(text(),'CSV Import/Export')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" CSV Import/Export  \")]")));
    //Reports
        driver.findElement(By.xpath("//span[contains(text(),'Reports')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Monthly Sales  \")]")));
        driver.findElement(By.xpath("//span[contains(text(),'Most Sold Products')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Most Sold Products  \")]")));
        driver.findElement(By.xpath("//span[contains(text(),'Most Shopping Customers')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Most Shopping Customers  \")]")));
    //Settings
        driver.findElement(By.xpath("//span[contains(text(),'Settings')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//td[contains(text(),'Store Name')]")));
        driver.findElement(By.xpath("//span[contains(text(),'Defaults')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//td[contains(text(),'Default Language')]")));
        driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//td[contains(text(),'Send Emails')]")));
        driver.findElement(By.xpath("//span[contains(text(),'Listings')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//td[contains(text(),'Catalog Only Mode')]")));
        driver.findElement(By.xpath("//span[contains(text(),'Customer Details')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//td[contains(text(),'Regional Settings Screen')]")));
        driver.findElement(By.xpath("//span[contains(text(),'Legal')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//td[contains(text(),'Cookie Policy')]")));
        driver.findElement(By.xpath("//span[contains(text(),'Images')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//td[contains(text(),'Clear Thumbnails Cache')]")));
        driver.findElement(By.xpath("//span[contains(text(),'Checkout')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//td[contains(text(),'Register Guests')]")));
        driver.findElement(By.xpath("//span[contains(text(),'Advanced')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//td[contains(text(),'System Cache Enabled')]")));
        driver.findElement(By.xpath("//span[contains(text(),'Security')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//td[contains(text(),'CAPTCHA')]")));
    //Slides
        driver.findElement(By.xpath("//span[contains(text(),'Slides')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Slides  \")]")));
    //Tax
        driver.findElement(By.xpath("//span[contains(text(),'Tax')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Tax Rates  \")]")));
        driver.findElement(By.xpath("//span[contains(text(),'Tax Classes')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Tax Classes  \")]")));
    //Translations
        driver.findElement(By.xpath("//span[contains(text(),'Translations')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Search Translations  \")]")));
        driver.findElement(By.xpath("//span[contains(text(),'Scan Files')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Scan Files For Translations  \")]")));
        driver.findElement(By.xpath("//span[contains(text(),'CSV Import/Export')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" CSV Import/Export  \")]")));
    //Users
        driver.findElement(By.xpath("//span[contains(text(),'Users')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" Users  \")]")));
    //vQmods
        driver.findElement(By.xpath("//span[contains(text(),'vQmods')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='panel-heading' and contains(.,\" vQmods  \")]")));




    }


    @After
    public void stop(){
        driver.quit();
        driver = null;
    }
}
