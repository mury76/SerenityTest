package com.fast.steps.serenity;

import com.fast.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    DictionaryPage dictionaryPage;

    @Step
    public void openPage(){
        dictionaryPage.open();
    }
    @Step
    public void clickOnACCOUNTLinkText() {
        dictionaryPage.clickOnAccountLinkText();
    }
    @Step
    public void clickOnLoginLinkText() {
        dictionaryPage.clickOnLoginLinkText();
    }
    @Step
    public void typeEmail(String email){
        dictionaryPage.enterEmailText(email);
    }
    @Step
    public void typePassword(String password){
        dictionaryPage.enterPasswordText(password);
    }
    @Step
    public void clickLoginButton(){
        dictionaryPage.clickOnLoginButton();
    }
    @Step
    public void checkSuccessMessage(){
        dictionaryPage.shouldBeVisible(By.className("welcome-msg"));
    }

//    @Step
//    public void enters(String keyword) {
//        dictionaryPage.enter_keywords(keyword);
//    }
//
//    @Step
//    public void starts_search() {
//        dictionaryPage.lookup_terms();
//    }
//
//    @Step
//    public void should_see_definition(String definition) {
//        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
//    }
//
//    @Step
//    public void is_the_home_page() {
//        dictionaryPage.open();
//    }
//
//    @Step
//    public void looks_for(String term) {
//        enters(term);
//        starts_search();
//    }
}