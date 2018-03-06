package com.automationpractice.selenide;


import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.Condition;
public class SelenideConditionsTest {


    @Test
    public void conditionalsTest() {

        open("http://automationpractice.com/index.php");
        $("#block_top_menu > ul > li:nth-child(3) > a").click();

        // visible / appear // e.g. $(“input”).shouldBe(visible)
        $(".product-container").shouldBe(Condition.visible);


    }


}
