package com.automationpractice.selenide;

import com.automationpractice.Landing;
import com.automationpractice.SignIn;
import com.automationpractice.SignInClassicModel;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;

public class PageObjectTest {

    WebDriver webDriver;


    @Test
    public void testWithClassicPageObject() {
        Landing landing = PageFactory.initElements(webDriver,Landing.class);
        SignInClassicModel signIn = PageFactory.initElements(webDriver, SignInClassicModel.class);

        open("http://automationpractice.com/index.php");
        landing.navigateToLogin();
        signIn.withEmailPassword("demo@seleniumkc.com", "mydemopassword123");

        title().equals("My account - My Store");

    }

}
