package com.fast.steps.serenity;

import com.fast.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginSteps {

    LoginPage madisonIslandPage;

    @Step
    public void openPage(){
        madisonIslandPage.open();
    }
    @Step
    public void maximize(){
        madisonIslandPage.getDriver().manage().window().maximize();
    }
    @Step
    public void clickOnAccountLinkText() {
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
    @Step
    public void checkIfEmailHasTheAtSign(){
        JavascriptExecutor js = (JavascriptExecutor)madisonIslandPage.getDriver();
        WebElement field = madisonIslandPage.getDriver().findElement(By.id("email"));
        Boolean is_valid = (Boolean)js.executeScript("return arguments[0].checkValidity();", field);
        assertThat("The email field validates email without @ !", is_valid, is(false));
    }
}