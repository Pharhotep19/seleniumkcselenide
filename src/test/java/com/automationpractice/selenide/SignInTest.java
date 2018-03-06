package com.automationpractice.selenide;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/**
 * User should be able to login to their account.
 */
public class SignInTest {

    @Test
    public void userEntersValidCredentials() {
        open("http://automationpractice.com/index.php");
        $(".login").click();
        $("#email").setValue("demo@seleniumkc.com");
        $("#passwd").setValue("mydemopassword123");
        $("#SubmitLogin").click();
        $(".page-heading").shouldHave(text("MY ACCOUNT"));
    }

    @Test
    public void userEntersInvalidEmail() {

        open("http://automationpractice.com/index.php");
        $(".login").click();
        $("#email").setValue("demoseleniumkc.com");
        $("#passwd").setValue("mydemopassword123");
        $("#SubmitLogin").click();
        $(".alert-danger > ol > li").shouldHave(text("Invalid email address."));

    }

}
