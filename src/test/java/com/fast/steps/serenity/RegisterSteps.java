package com.fast.steps.serenity;

import com.fast.pages.LoginPage;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

@DefaultUrl("https://fasttrackit.org/selenium-test/")
public class RegisterSteps {

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
}
