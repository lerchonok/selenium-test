package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private final PageLocators locators;
    private WebDriver driver;

    public LoginPage(String url, WebDriver driver){
        this.driver = driver;
        driver.get(url);
        locators = new PageLocators();
        PageFactory.initElements(driver, locators);
    }

    public void goLogIn(String email, String password){
        locators.emailField.sendKeys(email);
        locators.passwordField.sendKeys(password);
        locators.enterButton.click();
    }
}
