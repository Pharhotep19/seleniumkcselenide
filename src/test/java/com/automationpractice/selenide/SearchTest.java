package com.automationpractice.selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.Rule;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchTest {


    @Test
    public void weDontHaveNoSkinnyJeans() {
        open("http://automationpractice.com/index.php");
        $("#search_query_top").setValue("skinny jeans").submit();
        $(".alert-warning").shouldHave //
            (text("No results were found for your search \"skinny jeans\""));

    }


    @Test
    public void userSearchesForTshirts() {
        open("http://automationpractice.com/index.php");
        $("#search_query_top").setValue("t-shirts").submit();
        $$(".product-image-container").shouldHaveSize(1);


    }

}
