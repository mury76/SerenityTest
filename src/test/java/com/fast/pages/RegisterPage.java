package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://fasttrackit.org/selenium-test/")
public class RegisterPage extends PageObject {

    @FindBy(linkText = "ACCOUNT")
    private WebElementFacade accountLinkText;
    public void clickOnAccountLinkText(){
        accountLinkText.click();
    }
    @FindBy(linkText = "Register")
    private WebElementFacade registerLinkText;
    public void clickOnRegisterLinkText(){
        registerLinkText.click();
    }
    @FindBy(id = "firstname")
    private WebElementFacade firstNameField;
    public void enterFirstName(String firstName){
        firstNameField.type(firstName);
    }
    @FindBy(id = "middlename")
    private WebElementFacade middleNameField;
    public void enterMiddleName(String middleName){
        middleNameField.type(middleName);
    }
    @FindBy(id = "lastname")
    private WebElementFacade lastNameField;

    @FindBy(id = "email_address")
    private WebElementFacade emailAddressField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "confirmation")
    private WebElementFacade confirmationField;

    @FindBy(name = "is_subscribed")
    private WebElementFacade subscribeCheckButton;

    @FindBy(css = "button[title='Register']")
    private WebElementFacade registerButton;

}
