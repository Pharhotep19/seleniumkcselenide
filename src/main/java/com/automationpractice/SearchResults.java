package com.automationpractice;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Page object Selenide style.
 */
public class SearchResults {

    // TODO: finish methods
    public SearchResults howMany() {
        $(By.id("")).setValue("");
        return page(SearchResults.class);
    }


}
