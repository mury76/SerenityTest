package com.fast.steps.serenity;

import com.fast.pages.MadisonIslandPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.yecht.Data;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

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
    public void checkErrorMessage() {
        madisonIslandPage.shouldBeVisible(By.className("error-msg"));
    }
    @Step
    public void enterUniqueEmail(){
        String email = "mail" + System.currentTimeMillis() + "@mail.com";
        madisonIslandPage.enterEmailText(email);
    }

//    @Step
//    public void enters(String keyword) {
//        madisonIslandPage.enter_keywords(keyword);
//    }
//
//    @Step
//    public void starts_search() {
//        madisonIslandPage.lookup_terms();
//    }
//
//    @Step
//    public void should_see_definition(String definition) {
//        assertThat(madisonIslandPage.getDefinitions(), hasItem(containsString(definition)));
//    }
//
//    @Step
//    public void is_the_home_page() {
//        madisonIslandPage.open();
//    }
//
//    @Step
//    public void looks_for(String term) {
//        enters(term);
//        starts_search();
//    }
}