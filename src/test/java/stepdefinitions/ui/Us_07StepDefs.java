package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ViceDeanManagementPage;
import utilities.Driver;

public class Us_07StepDefs {
    LoginPage loginPage = new LoginPage();


    @Given("admin goes to {string} homepage")
    public void adminGoesToHomepage(String url) {
        Driver.getDriver().get("");
    }

    @When("User clicks on Login button right corner of the page")
    public void userClicksOnLoginButtonRightCornerOfThePage() {
    }

    @And("User enters a valid User name")
    public void userEntersAValidUserName() {
    }

    @And("User enters a valid password")
    public void userEntersAValidPassword() {
    }

    @And("User clicks on Login button")
    public void userClicksOnLoginButton() {
    }

    @And("User clicks on Menu button right corner of the page")
    public void userClicksOnMenuButtonRightCornerOfThePage() {
    }

    @And("User clicks on Contact Get All left side of the page")
    public void userClicksOnContactGetAllLeftSideOfThePage() {
    }

    @Then("Deans should be able to view messages")
    public void deansShouldBeAbleToViewMessages() {
    }

    @And("Deans should be able to see the delete button")
    public void deansShouldBeAbleToSeeTheDeleteButton() {
    }

    @And("Deans should be able to delete messages")
    public void deansShouldBeAbleToDeleteMessages() {
    }


}
