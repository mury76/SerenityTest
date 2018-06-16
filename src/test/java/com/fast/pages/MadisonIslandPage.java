package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://fasttrackit.org/selenium-test/")
public class MadisonIslandPage extends PageObject {


    @FindBy(linkText = "ACCOUNT")
    private WebElementFacade accountLinkText;

    @FindBy(linkText = "Log In")
    private WebElementFacade loginLinkText;

    @FindBy(id ="email")
    private WebElementFacade emailField;

    @FindBy(id="pass")
    private WebElementFacade passwordField;

    @FindBy(id="send2")
    private WebElementFacade loginButton;


    public void clickOnAccountLinkText () {
        accountLinkText.click();
    }
    public void clickOnLoginLinkText () {
        loginLinkText.click();
    }
    public void enterEmailText (String email) {
        emailField.type(email);
    }
    public void enterPasswordText (String password) {
        passwordField.type(password);
    }
    public void clickOnLoginButton (){
        loginButton.click();
    }

}