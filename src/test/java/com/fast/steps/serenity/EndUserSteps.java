package com.fast.steps.serenity;

import com.fast.pages.MadisonIslandPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class EndUserSteps {

    MadisonIslandPage madisonIslandPage;

    @Step
    public void openPage(){
        madisonIslandPage.open();
    }
    @Step
    public void maximize(){
        madisonIslandPage.getDriver().manage().window().maximize();
    }
    @Step
    public void clickOnACCOUNTLinkText() {
        madisonIslandPage.clickOnAccountLinkText();
    }
    @Step
    public void clickOnLoginLinkText() {
        madisonIslandPage.clickOnLoginLinkText();
    }
    @Step
    public void typeEmail(String email){
        madisonIslandPage.enterEmailText(email);
    }
    @Step
    public void typePassword(String password){
        madisonIslandPage.enterPasswordText(password);
    }
    @Step
    public void clickLoginButton(){
        madisonIslandPage.clickOnLoginButton();
    }
    @Step
    public void checkSuccessMessage(){
        madisonIslandPage.shouldBeVisible(By.className("hello"));
    }
    @Step
    public void checkErrorMessage(){
        madisonIslandPage.shouldBeVisible(By.className("error-msg"));
    }
    @Step
    public void enterUniqueEmail(){
        String email = "mail" + System.currentTimeMillis() + "@mail.com";
        madisonIslandPage.enterEmailText(email);
    }
    @Step
    public void checkIfEmailFieldIsEmpty(){
        madisonIslandPage.shouldBeVisible(By.id("advice-required-entry-email"));
    }
    @Step
    public void checkIfEmailHasCorrectFormat(){
        madisonIslandPage.shouldBeVisible(By.id("advice-validate-email-email"));
    }
    @Step
    public void checkIfPasswordFieldIsEmpty(){
        madisonIslandPage.shouldBeVisible(By.id("advice-required-entry-pass"));
    }
}