package com.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SignInClassicModel {

    private WebDriver webDriver;

    public SignInClassicModel(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public SignIn withEmailPassword(String email, String password) {

        $("#email").setValue(email);
        $("#passwd").setValue(password);
        $("#SubmitLogin").click();

        return PageFactory.initElements(webDriver, SignIn.class);

    }
}
