package com.fast.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.fast.steps.serenity.EndUserSteps;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = false)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps mury;

    @Test
    public void enterValidDataInLoginFieldsAndClickLogin(){
        mury.openPage();
        mury.maximize();
        mury.clickOnACCOUNTLinkText();
        mury.clickOnLoginLinkText();
        mury.typeEmail("mail@mail.com");
        mury.typePassword("123456");
        mury.clickLoginButton();
        mury.checkSuccessMessage();
    }

    @Test
    public void tryToLoginWithoutAnExistingAccount(){
        mury.openPage();
        mury.maximize();
        mury.clickOnACCOUNTLinkText();
        mury.clickOnLoginLinkText();
        mury.enterUniqueEmail();
        mury.typePassword("123456");
        mury.clickLoginButton();
        mury.checkErrorMessage();
    }


//    @Issue("#WIKI-1")
//    @Test
//    public void searching_by_keyword_apple_should_display_the_corresponding_article() {
//        anna.is_the_home_page();
//        anna.looks_for("apple");
//        anna.should_see_definition("A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.");
//
//    }
//
//    @Test
//    public void searching_by_keyword_banana_should_display_the_corresponding_article() {
//        anna.is_the_home_page();
//        anna.looks_for("pear");
//        anna.should_see_definition("An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.");
//    }
//
//    @Pending @Test
//    public void searching_by_ambiguious_keyword_should_display_the_disambiguation_page() {
//    }
} 