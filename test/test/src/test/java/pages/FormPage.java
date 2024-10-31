package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FormPage {

    private final PageLocators locators;
    private WebDriver driver;

    public FormPage(WebDriver webDriver){
        driver = webDriver;
        locators = new PageLocators();
        PageFactory.initElements(driver, locators);
    }

    public void createForm(String email, String name, String gender, int firstChoice, int secondChoice){
        locators.form_emailField.sendKeys(email);
        locators.nameField.sendKeys(name);

        locators.sexSelect.click();
        if(gender.equalsIgnoreCase("female")) {
            locators.womanButton.click();
        } else { locators.manButton.click(); }

        switch (firstChoice) {
            case 1:
                locators.var11CheckBox.click();
                break;

            case 2:
                locators.var12CheckBox.click();
                break;

            case 3:
                locators.var11CheckBox.click();
                locators.var12CheckBox.click();
                break;

            default:
                throw new IllegalArgumentException("Invalid option choice");
        }

        switch (secondChoice) {
            case 1:
                locators.var21CheckBox.click();
                break;

            case 2:
                locators.var22CheckBox.click();
                break;

            case 3:
                locators.var23CheckBox.click();
                break;

            default:
                throw new IllegalArgumentException("Invalid option choice");
        }

        locators.addButton.click();
        locators.okButton.click();
    }
}
