package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageLocators {

    @FindBy(xpath = "//*[@id=\"loginEmail\"]")
    public WebElement emailField;

    @FindBy(xpath = "//*[@id=\"loginPassword\"]")
    public WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"authButton\"]")
    public WebElement enterButton;

    @FindBy(xpath = "//*[@id=\"dataEmail\"]")
    public WebElement form_emailField;

    @FindBy(xpath = "//*[@id=\"dataName\"]")
    public WebElement nameField;

    @FindBy(xpath = "//*[@id=\"dataGender\"]")
    public WebElement sexSelect;

    @FindBy(xpath = "//*[@id=\"dataGender\"]/option[2]")
    public WebElement womanButton;

    @FindBy(xpath = "//*[@id=\"dataGender\"]/option[1]")
    public WebElement manButton;

    @FindBy(xpath = "//*[@id=\"dataCheck11\"]")
    public WebElement var11CheckBox;

    @FindBy(xpath = "//*[@id=\"dataCheck12\"]")
    public WebElement var12CheckBox;

    @FindBy(xpath = "//*[@id=\"dataSelect21\"]")
    public WebElement var21CheckBox;

    @FindBy(xpath = "//*[@id=\"dataSelect22\"]")
    public WebElement var22CheckBox;

    @FindBy(xpath = "//*[@id=\"dataSelect23\"]")
    public WebElement var23CheckBox;

    @FindBy(xpath = "//*[@id=\"dataSend\"]")
    public WebElement addButton;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/button")
    public WebElement okButton;
}
