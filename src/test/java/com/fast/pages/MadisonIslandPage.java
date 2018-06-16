package com.fast.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://fasttrackit.org/selenium-test/")
public class MadisonIslandPage extends PageObject {

//    @FindBy(name="search")
//    private WebElementFacade searchTerms;
//
//    @FindBy(name="go")
//    private WebElementFacade lookupButton;
//
//    public void enter_keywords(String keyword) {
//        searchTerms.type(keyword);
//    }
//
//    public void lookup_terms() {
//        lookupButton.click();
//    }
//
//    public List<String> getDefinitions() {
//        WebElementFacade definitionList = find(By.tagName("ol"));
//        return definitionList.findElements(By.tagName("li")).stream()
//                .map( element -> element.getText() )
//                .collect(Collectors.toList());
//    }

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