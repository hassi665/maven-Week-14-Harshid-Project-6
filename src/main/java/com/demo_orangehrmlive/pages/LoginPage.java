package com.demo_orangehrmlive.pages;

import com.demo_orangehrmlive.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userNameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@class ='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
    By getSuccessfullyLoginMessage = By.xpath("//h6[@class = 'oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
    By forgottenPasswordButtonClick = By.xpath("//div[@class = 'orangehrm-login-forgot']");
    By getForgottenPasswordMessageAfterClick = By.xpath("//h6[@class = 'oxd-text oxd-text--h6 orangehrm-forgot-password-title']");

    public void enterUserName(String username) {
        sendTextToElement(userNameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getMessageAfterSucessfullyLogin(){
        return getTextFromElement(getSuccessfullyLoginMessage);
    }

    public void clickOnForgotPasswordLink(){
        clickOnElement(forgottenPasswordButtonClick);
    }

    public String getMessageAfterForgotPasswordLink(){
        return getTextFromElement(getForgottenPasswordMessageAfterClick);
    }

}
