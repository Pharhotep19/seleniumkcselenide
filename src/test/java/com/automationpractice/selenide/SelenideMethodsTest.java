package com.automationpractice.selenide;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideMethodsTest {


    @Test
    public void methodActionsOnElementTest() {

        open("http://automationpractice.com/index.php");

        // click()
        $("#block_top_menu > ul > li:nth-child(2)").click();

        // doubleClick()
        $("#selectProductSort").doubleClick();

        // contextClick()

        // hover()
        $("#block_top_menu > ul > li:nth-child(1) > a").hover();

        // setValue(String) / val(String)
        $("#search_query_top").setValue("Dresses");
        // pressEnter()
        $("#search_query_top").pressEnter();

        // pressEscape()
        // pressTab()
        // selectRadio(String value)

        // selectOption(String)

        // append(String)

        // dragAndDropTo(String)
    }


    public void methodsToGetElementAttributes() {

        open("http://automationpractice.com/index.php");

        // getValue() / val()
        String phoneNumber = $(".shop-phone > strong").getValue();

        // data()
        //String phoneSom =


        // attr(String)
        String value = $("#newsletter-input").attr("value");


        // text() // returns “visible text on a page”
        String sliderText = $("#homeslider > li:nth-child(2) > div > h2").text();

        // innerText() // returns “text of element in DOM”

//        getSelectedOption()
//        getSelectedText()
//        getSelectedValue()
//        isDisplayed() //returns false, if element is hidden (invisible) or if element does not exist in DOM; otherwise - true
//        exists() //returns true, if element exists in DOM, otherwise - false
    }




}
