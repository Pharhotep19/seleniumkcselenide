package com.automationpractice;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

/**
 * Sign in page object the normal person way.
 */
public class SignIn {

    private final WebDriver webDriver;

    @FindBy(id = "email_create")
    private SelenideElement createAccountEmailInput;

    @FindBy(id = "SubmitCreate")
    private SelenideElement createAccountButton;

    @FindBy(id = "email")
    private SelenideElement signInEmailInput;

    @FindBy(id = "passwd")
    private SelenideElement signInPasswordInput;

    @FindBy(id = "SubmitLogin")
    private SelenideElement signInButton;

    public SignIn(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    /**
     * Login with an email and password.
     *
     * @param email the email address.
     * @param password the password.
     */
    public SignIn withEmailPassword(String email, String password) {

        signInButton.setValue(email);
        signInPasswordInput.setValue(password);
        signInButton.click();

        return page(SignIn.class);

    }

}
