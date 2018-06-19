package com.fast.steps.serenity;

import com.fast.pages.LoginPage;
import com.fast.pages.RegisterPage;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;

@DefaultUrl("https://fasttrackit.org/selenium-test/")
public class RegisterSteps {

    RegisterPage madisonIslandPage;

    @Step
    public void openPage(){
        madisonIslandPage.open();
    }
    @Step
    public void maximize(){
        madisonIslandPage.getDriver().manage().window().maximize();
    }
    @Step
    public void clickOnAccountLinkText(){
        madisonIslandPage.clickOnAccountLinkText();
    }
    @Step
    public void clickOnRegisterLinkText(){
        madisonIslandPage.clickOnRegisterLinkText();
    }
    @Step
    public void typeFirstName(String firstName){
        madisonIslandPage.enterFirstName(firstName);
    }@Step
    public void typeMiddleName(String middleName){
        madisonIslandPage.enterMiddleName(middleName);
    }
    @Step
    public void typeLastName(String lastName){
        madisonIslandPage.enterLastName(lastName);
    }
    @Step
    public void typeEmailAddress(String email){
        madisonIslandPage.enterEmail(email);
    }
    @Step
    public void typePassword(String password){
        madisonIslandPage.enterPassword(password);
    }
    @Step
    public void typeConfirmation(String confirmation){
        madisonIslandPage.enterConfirmation(confirmation);
    }
    @Step
    public void clickSignUp(){
        madisonIslandPage.clickSubscribe();
    }
    @Step
    public void clickRegister(){
        madisonIslandPage.clickRegister();
    }
    @Step
    public void typeUniqueEmail(){
        String email = "mail" + System.currentTimeMillis() + "@mail.com";
        madisonIslandPage.enterEmail(email);
    }
    @Step
    public void checkWelcomeMessage() {
        madisonIslandPage.shouldBeVisible(By.className("success-msg"));
    }
    @Step
    public void checkErrorMessage() {
        madisonIslandPage.shouldBeVisible(By.className("error-msg"));
    }
}
