package com.demo_orangehrmlive.testsuite;



import com.demo_orangehrmlive.pages.LoginPage;
import com.demo_orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        String expectedText = "Dashboard";
        String actualText = loginPage.getMessageAfterSucessfullyLogin();
        Assert.assertEquals(actualText, expectedText, "Login page not displayed");
    }


    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        loginPage.clickOnForgotPasswordLink();
        String expectedMessage = "Reset Password";
        Assert.assertEquals(loginPage.getMessageAfterForgotPasswordLink(),expectedMessage, "Error message not displayed");
    }


}
