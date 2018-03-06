package com.automationpractice;

import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class Landing {

    private WebDriver webDriver;

    public Landing(WebDriver webDriver) {
        open("http://automationpractice.com/index.php");
        this.webDriver = webDriver;

    }

    public Landing navigateToLogin() {

        $(".login").click();
        return page(Landing.class);
    }
}
