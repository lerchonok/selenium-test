package tests;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.FormPage;
import pages.PageLocators;
import readConfig.ConfigProvider;
import core.BaseTest;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class MainTest extends BaseTest {

    private final String url = ConfigProvider.URL;
    private final String email = ConfigProvider.EMAIL;
    private final String password = ConfigProvider.PASSWORD;
    private final String name = ConfigProvider.NAME;

    private final PageLocators locators = new PageLocators();
    @FindBy(xpath = "//*[@id=\"dataTable\"]/tbody/tr/td[1]")
    public WebElement checkField;

    @Test
    @DisplayName("Вход и анкетирование")
    @Description("Операция происходит для создания заказа пользователя, с имеющимся аккаунтом.")
    public void checkForm() throws InterruptedException {
        LoginPage loginPage = new LoginPage(url, driver);
        loginPage.goLogIn(email, password);

        FormPage formPage = new FormPage(driver);
        formPage.createForm(email, name, "female", 1, 1);
    }
}
