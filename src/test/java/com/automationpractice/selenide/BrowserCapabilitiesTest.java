package com.automationpractice.selenide;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import static com.codeborne.selenide.Selenide.*;

public class BrowserCapabilitiesTest {

    @Test
    public void setCustomBrowserCapsTest() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setJavascriptEnabled(true);
        capabilities.setCapability("takesScreenshot", true);
        capabilities.setCapability("phantomjs.cli.args", new String[] {"--ignore-ssl-errors=true"});
        WebDriver driver = new org.openqa.selenium.phantomjs.PhantomJSDriver(capabilities);
        WebDriverRunner.setWebDriver(driver);

        open("");
        $("#search_query_top").setValue("t-shirts").submit();
        $$(".product-image-container").shouldHaveSize(1);



    }

    @Ignore
    @Test
    public void selfSignedCertificateTest() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("acceptSslCerts",true);
    }
}
