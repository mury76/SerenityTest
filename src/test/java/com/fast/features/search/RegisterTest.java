package com.fast.features.search;

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
    public void tryToLoginWithValidData(){
        mury.openPage();
        mury.maximize();
        mury.clickOnAccountLinkText();

    }
}
