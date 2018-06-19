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
    public void enterLastName(String lastName){
        lastNameField.type(lastName);
    }
    @FindBy(id = "email_address")
    private WebElementFacade emailAddressField;
    public void enterEmail(String email){
        emailAddressField.type(email);
    }
    @FindBy(id = "password")
    private WebElementFacade passwordField;
    public void enterPassword(String password){
        passwordField.type(password);
    }
    @FindBy(id = "confirmation")
    private WebElementFacade confirmationField;
    public void enterConfirmation(String confirmation){
        confirmationField.type(confirmation);
    }
    @FindBy(name = "is_subscribed")
    private WebElementFacade subscribeCheckButton;
    public void clickSubscribe(){
        subscribeCheckButton.click();
    }
    @FindBy(css = "button[title='Register']")
    private WebElementFacade registerButton;
    public void clickRegister(){
        registerButton.click();
    }
}
