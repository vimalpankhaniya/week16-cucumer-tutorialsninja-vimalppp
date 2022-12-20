package com.tutorialsninja.cucumber.steps;


import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.LogoutPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginPageSteps {
    @When("^I click on my account link$")
    public void iClickOnMyAccountLink() {
        new HomePage().clickOnMyAccountLink();
    }

    @And("^I select \"([^\"]*)\" option from my account options$")
    public void iSelectOptionFromMyAccountOptions(String option){
        new HomePage().selectMyAccountOptions(option);
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals("Login page not displayed","Returning Customer", new LoginPage().getReturningCustomerTextFromLoginPage());
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmail(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
        Assert.assertEquals("Login not success","My Account",new LoginPage().getMyAccountText());
    }

    @Then("^I should logout successfully$")
    public void iShouldLogoutSuccessfully() {
        Assert.assertEquals("Not Log out","Account Logout",new LogoutPage().getAccountLogoutText());
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new LogoutPage().clickOnContinueButton();
    }
}
