package com.fast.features.tests;

import com.fast.steps.serenity.RegisterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTest {

    @Managed(uniqueSession = false)
    public WebDriver webdriver;

    @Steps
    public RegisterSteps mury;

    @Test
    public void tryToRegisterWithValidData(){
        mury.openPage();
        mury.maximize();
        mury.clickOnAccountLinkText();
        mury.clickOnRegisterLinkText();
        mury.typeFirstName("Ciprian");
        mury.typeMiddleName("Augustin");
        mury.typeLastName("Muresan");
        mury.typeUniqueEmail();
        mury.typePassword("123456");
        mury.typeConfirmation("123456");
        mury.clickSignUp();
        mury.clickRegister();
        mury.checkWelcomeMessage();
    }
    @Test
    public void tryToRegisterWithDuplicateEmail(){
        mury.openPage();
        mury.maximize();
        mury.clickOnAccountLinkText();
        mury.clickOnRegisterLinkText();
        mury.typeFirstName("Ciprian");
        mury.typeMiddleName("Augustin");
        mury.typeLastName("Muresan");
        mury.typeEmailAddress("mail@mail.com");
        mury.typePassword("123456");
        mury.typeConfirmation("123456");
        mury.clickSignUp();
        mury.clickRegister();
        mury.checkErrorMessage();
    }
}
