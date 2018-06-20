package com.fast.steps.serenity;

import com.fast.pages.LoginPage;
import com.fast.pages.RegisterPage;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

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
    public void clickSubscribe(){
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
    @Step
    public void checkErrorMessageForRequiredFirstName() {
        madisonIslandPage.shouldBeVisible(By.id("advice-required-entry-firstname"));
    }
    @Step
    public void checkErrorMessageForRequiredLastName() {
        madisonIslandPage.shouldBeVisible(By.id("advice-required-entry-lastname"));
    }
    @Step
    public void checkErrorMessageForRequiredEmail() {
        madisonIslandPage.shouldBeVisible(By.id("advice-required-entry-email_address"));
    }
    @Step
    public void checkErrorMessageForRequiredPassword() {
        madisonIslandPage.shouldBeVisible(By.id("advice-required-entry-password"));
    }
    @Step
    public void checkErrorMessageForRequiredPasswordConfirmation() {
        madisonIslandPage.shouldBeVisible(By.id("advice-required-entry-confirmation"));
    }
    @Step
    public void checkErrorMessageForMatchingPasswordConfirmation() {
        madisonIslandPage.shouldBeVisible(By.id("advice-validate-cpassword-confirmation"));
    }
    @Step
    public void checkErrorMessageIfPasswordIsToShort() {
        madisonIslandPage.shouldBeVisible(By.id("advice-validate-password-password"));
    }
    @Step
    public void checkErrorMessageIfPasswordIsInvalid() {
        madisonIslandPage.shouldBeVisible(By.id("advice-validate-email-email_address"));
    }
    @Step
    public void checkIfEmailHasTheAtSign(){
        JavascriptExecutor js = (JavascriptExecutor)madisonIslandPage.getDriver();
        WebElement field = madisonIslandPage.getDriver().findElement(By.id("email_address"));
        Boolean is_valid = (Boolean)js.executeScript("return arguments[0].checkValidity();", field);
        assertThat("The email field validates email without @ !", is_valid, is(false));
    }
}
