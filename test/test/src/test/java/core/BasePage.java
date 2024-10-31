package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.PageLocators;

abstract public class BasePage {
    public static WebDriver driver;
    private static PageLocators locators;

    public static void setDriver(WebDriver webDriver){
        driver = webDriver;
        locators = new PageLocators();
        PageFactory.initElements(driver, locators);
    }
}

