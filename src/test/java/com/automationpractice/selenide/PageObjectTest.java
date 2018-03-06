package com.automationpractice.selenide;

import com.automationpractice.Landing;
import com.automationpractice.SignIn;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.title;

public class PageObjectTest {

    WebDriver webDriver;

    @Test
    public void testWithClassicPageObject() {

        new Landing(webDriver).navigateToLogin();
        new SignIn(webDriver)
                .withEmailPassword("demo@seleniumkc.com", "mydemopassword123");

        title().equals("My account - My Store");
    }
}
