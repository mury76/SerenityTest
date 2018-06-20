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
        mury.clickSubscribe();
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
        mury.clickSubscribe();
        mury.clickRegister();
        mury.checkErrorMessage();
    }
    @Test
    public void tryToRegisterWithoutTypingFirstname(){
        mury.openPage();
        mury.maximize();
        mury.clickOnAccountLinkText();
        mury.clickOnRegisterLinkText();
        mury.typeFirstName("");
        mury.typeMiddleName("Augustin");
        mury.typeLastName("Muresan");
        mury.typeEmailAddress("mail@mail.com");
        mury.typePassword("123456");
        mury.typeConfirmation("123456");
        mury.clickSubscribe();
        mury.clickRegister();
        mury.checkErrorMessageForRequiredFirstName();
    }
    @Test
    public void tryToRegisterWithoutTypingLastName(){
        mury.openPage();
        mury.maximize();
        mury.clickOnAccountLinkText();
        mury.clickOnRegisterLinkText();
        mury.typeFirstName("Ciprian");
        mury.typeMiddleName("Augustin");
        mury.typeLastName("");
        mury.typeEmailAddress("mail@mail.com");
        mury.typePassword("123456");
        mury.typeConfirmation("123456");
        mury.clickSubscribe();
        mury.clickRegister();
        mury.checkErrorMessageForRequiredLastName();
    }
    @Test
    public void tryToRegisterWithoutTypingEmail(){
        mury.openPage();
        mury.maximize();
        mury.clickOnAccountLinkText();
        mury.clickOnRegisterLinkText();
        mury.typeFirstName("Ciprian");
        mury.typeMiddleName("Augustin");
        mury.typeLastName("Muresan");
        mury.typeEmailAddress("");
        mury.typePassword("123456");
        mury.typeConfirmation("123456");
        mury.clickSubscribe();
        mury.clickRegister();
        mury.checkErrorMessageForRequiredEmail();
    }
    @Test
    public void tryToRegisterWithoutPassword(){
        mury.openPage();
        mury.maximize();
        mury.clickOnAccountLinkText();
        mury.clickOnRegisterLinkText();
        mury.typeFirstName("Ciprian");
        mury.typeMiddleName("Augustin");
        mury.typeLastName("Muresan");
        mury.typeEmailAddress("mail@mail.com");
        mury.typePassword("");
        mury.typeConfirmation("123456");
        mury.clickSubscribe();
        mury.clickRegister();
        mury.checkErrorMessageForRequiredPassword();
    }
    @Test
    public void tryToRegisterWithoutPasswordConfirmation() {
        mury.openPage();
        mury.maximize();
        mury.clickOnAccountLinkText();
        mury.clickOnRegisterLinkText();
        mury.typeFirstName("Ciprian");
        mury.typeMiddleName("Augustin");
        mury.typeLastName("Muresan");
        mury.typeEmailAddress("mail@mail.com");
        mury.typePassword("123456");
        mury.typeConfirmation("");
        mury.clickSubscribe();
        mury.clickRegister();
        mury.checkErrorMessageForRequiredPasswordConfirmation();
    }
    @Test
    public void tryToRegisterWithoutMatchingPasswordConfirmation() {
        mury.openPage();
        mury.maximize();
        mury.clickOnAccountLinkText();
        mury.clickOnRegisterLinkText();
        mury.typeFirstName("Ciprian");
        mury.typeMiddleName("Augustin");
        mury.typeLastName("Muresan");
        mury.typeEmailAddress("mail@mail.com");
        mury.typePassword("123456");
        mury.typeConfirmation("abcdefg");
        mury.clickSubscribe();
        mury.clickRegister();
        mury.checkErrorMessageForMatchingPasswordConfirmation();
    }
    @Test
    public void tryToRegisterWithNotLongEnoughPassword() {
        mury.openPage();
        mury.maximize();
        mury.clickOnAccountLinkText();
        mury.clickOnRegisterLinkText();
        mury.typeFirstName("Ciprian");
        mury.typeMiddleName("Augustin");
        mury.typeLastName("Muresan");
        mury.typeEmailAddress("mail@mail.com");
        mury.typePassword("123");
        mury.typeConfirmation("123");
        mury.clickSubscribe();
        mury.clickRegister();
        mury.checkErrorMessageIfPasswordIsToShort();
    }
    @Test
    public void tryToRegisterWithInvalidEmailFormat() {
        mury.openPage();
        mury.maximize();
        mury.clickOnAccountLinkText();
        mury.clickOnRegisterLinkText();
        mury.typeFirstName("Ciprian");
        mury.typeMiddleName("Augustin");
        mury.typeLastName("Muresan");
        mury.typeEmailAddress("mail@mail");
        mury.typePassword("123456");
        mury.typeConfirmation("123456");
        mury.clickSubscribe();
        mury.clickRegister();
        mury.checkErrorMessageIfPasswordIsInvalid();
    }
    @Test
    public void tryToRegisterWithAtSignMissingFromEmail() {
        mury.openPage();
        mury.maximize();
        mury.clickOnAccountLinkText();
        mury.clickOnRegisterLinkText();
        mury.typeFirstName("Ciprian");
        mury.typeMiddleName("Augustin");
        mury.typeLastName("Muresan");
        mury.typeEmailAddress("mail.mail.com");
        mury.typePassword("123456");
        mury.typeConfirmation("123456");
        mury.clickSubscribe();
        mury.clickRegister();
        mury.checkIfEmailHasTheAtSign();
    }
}
