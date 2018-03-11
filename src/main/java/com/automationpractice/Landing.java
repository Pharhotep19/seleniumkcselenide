package com.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class Landing {

    private WebDriver webDriver;

    public Landing(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public Landing navigateToLogin() {

        $(".login").click();
        return PageFactory.initElements(webDriver, Landing.class);
    }
}
