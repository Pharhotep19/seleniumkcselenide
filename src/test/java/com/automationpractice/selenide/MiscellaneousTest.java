package com.automationpractice.selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.impl.Html;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.source;
import static com.codeborne.selenide.WebDriverRunner.url;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class MiscellaneousTest {

    @Test
    public void checkTheUrlInSource() {

        open("http://automationpractice.com/index.php");
        url();
        assertTrue(Html.text.contains(url(), "http://automationpractice.com/index.php"));

    }

    @Test
    public void baseUrl() {

        baseUrl = "http://automationpractice.com";
        open("/index.php");
        System.out.println(getWebDriver().getTitle());
        assertEquals(getWebDriver().getTitle(), "My Store");
    }

    @Test
    public void findChildElement() {
        baseUrl = "http://automationpractice.com";
        open("/index.php");
        String name = $$(".product-container").get(0)
                                                        .find(".product-name")
                                                        .getText();
        System.out.println(name);
    }

    @Test
    public void takeScreenshots() {
        // You can use property -Dselenide.reports=test-result/reports to set any directory to store screenshots to.
        // or...
        Configuration.reportsFolder = "test-result/screenshots";
        baseUrl = "http://automationpractice.com";
        open("/index.php");
        screenshot("homepage");
    }


    @Test
    public void executeSomeJavaScript() {

        baseUrl = "http://automationpractice.com";
        open("/index.php");
        executeJavaScript("document.getElementsByName('product-image-container')");
        try {
            Thread.sleep(14000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }






}
