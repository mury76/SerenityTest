package com.fast.features.search;

import com.fast.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = false)
    public WebDriver webdriver;

    @Steps
    public LoginSteps mury;

    @Test
    public void tryToLoginWithValidData(){
        mury.openPage();
        mury.maximize();
        mury.clickOnAccountLinkText();
        mury.clickOnLoginLinkText();
        mury.typeEmail("mail@mail.com");
        mury.typePassword("123456");
        mury.clickLoginButton();
        mury.checkSuccessMessage();
    }
    @Test
    public void tryToLoginWithUnregisteredEmail(){
        mury.openPage();
        mury.maximize();
        mury.clickOnAccountLinkText();
        mury.clickOnLoginLinkText();
        mury.enterUniqueEmail();
        mury.typePassword("123456");
        mury.clickLoginButton();
        mury.checkErrorMessage();
    }
    @Test
    public void tryToLoginWithWrongPassword(){
        mury.openPage();
        mury.maximize();
        mury.clickOnAccountLinkText();
        mury.clickOnLoginLinkText();
        mury.typeEmail("mail@mail.com");
        mury.typePassword("this_is_not_a_valid_password_for_this_email");
        mury.clickLoginButton();
        mury.checkErrorMessage();
    }
    @Test
    public void tryToLoginWithEmailFieldEmpty(){
        mury.openPage();
        mury.maximize();
        mury.clickOnAccountLinkText();
        mury.clickOnLoginLinkText();
        mury.typeEmail("");
        mury.typePassword("123456");
        mury.clickLoginButton();
        mury.checkIfEmailFieldIsEmpty();
    }
    @Test
    public void tryToLoginWithPasswordFieldEmpty(){
        mury.openPage();
        mury.maximize();
        mury.clickOnAccountLinkText();
        mury.clickOnLoginLinkText();
        mury.typeEmail("mail@mail.com");
        mury.typePassword("");
        mury.clickLoginButton();
        mury.checkIfPasswordFieldIsEmpty();
    }
    @Test
    public void tryToLoginWithEmailMissingTLD(){
        mury.openPage();
        mury.maximize();
        mury.clickOnAccountLinkText();
        mury.clickOnLoginLinkText();
        mury.typeEmail("mail@mail");
        mury.typePassword("123456");
        mury.clickLoginButton();
        mury.checkIfEmailHasCorrectFormat();
    }
    @Test
    public void tryToLoginWithoutAtSignInEmail(){
        mury.openPage();
        mury.maximize();
        mury.clickOnAccountLinkText();
        mury.clickOnLoginLinkText();
        mury.typeEmail("mail.mail.com");
        mury.typePassword("123456");
        mury.clickLoginButton();
        mury.checkIfEmailHasTheAdSign();
    }
} 