package com.automationpractice.vanilla;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {

    public WebDriver driver;

    /**
     * First Test Case verifies that user that enters the correct username and password
     * receives the expected Successful Alert.
     * @throws InterruptedException
     */
    @Test
    public void firstTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/nickg/Documents/webdrivers/chromedriver.exe"); //C:\Users\nickg\Documents\webdrivers

        driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");

        WebDriverWait wait = new WebDriverWait(driver, 30);

        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys("demo@seleniumkc.com");
        driver.findElement(By.id("passwd")).sendKeys("mydemopassword123");
        driver.findElement(By.id("SubmitLogin")).click();

        WebElement pageHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("page-heading")));

        Assert.assertEquals("Page title doesn't match.", "MY ACCOUNT", pageHeader.getText());

    }
}
