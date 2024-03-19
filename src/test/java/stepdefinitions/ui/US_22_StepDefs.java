package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminManagementPage;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class US_22_StepDefs {
    LoginPage loginPage = new LoginPage();
    AdminManagementPage adminManagementPage= new AdminManagementPage();


    @When("Admin enters the first name for new Admin")
    public void adminEntersTheFirstNameForNewAdmin() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.name,"Hekmat",2);
    }

    @And("Admin enters the surname for new Admin")
    public void adminEntersTheSurnameForNewAdmin() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.surname,"Amini",2);
    }

    @And("Admin enters the birth place of new Admin")
    public void adminEntersTheBirthPlaceOfNewAdmin() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.birthPlace,"Kabul",2);
    }

    @And("Admin enters gender of new Admin")
    public void adminEntersGenderOfNewAdmin() {
        BrowserUtils.clickWithTimeOut(adminManagementPage.maleGender,2);
    }

    @And("Admin enters birth date of new Admin")
    public void adminEntersBirthDateOfNewAdmin() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.dateOfBirth,"01/01/2000",2);
    }

    @And("Admin enters phone number of new Admin in the format\\(xxx-xxx-xxxx)")
    public void adminEntersPhoneNumberOfNewAdminInTheFormatXxxXxxXxxx() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.phoneNumber,"073-012-1120",2);
    }

    @And("Admin enters SSN number of new Admin in the format\\(xxx-xx-xxxx)")
    public void adminEntersSSNNumberOfNewAdminInTheFormatXxxXxXxxx() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.ssn,"112-01-1201",2);
    }

    @And("Admin enters a username for new Admin")
    public void adminEntersAUsernameForNewAdmin() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.username,"HekmatAmini",2);
    }

    @And("Admin enters a password for new admin\\(at least eight chars and UpC,LowC,Num)")
    public void adminEntersAPasswordForNewAdminAtLeastEightCharsAndUpCLowCNum() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.password,"Hekmat123",2);
    }

    @And("Admin clicks the Submit button")
    public void adminClicksTheSubmitButton() {
        BrowserUtils.clickWithTimeOut(adminManagementPage.submitButton,5);

    }

    @And("Admin should see Admin saved message")
    public void adminShouldSeeAdminSavedMessage() {
        adminManagementPage.adminsavedMessage.isDisplayed();
    }

    @Then("Admin should see the new Admin in the Admin List")
    public void adminShouldSeeTheNewAdminInTheAdminList() {

    }

    @And("Admin enters a password for new admin\\(less than eight chars and UpC,LowC,Num)")
    public void adminEntersAPasswordForNewAdminLessThanEightCharsAndUpCLowCNum() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.password,"Hekmat12",2);
    }

    @And("Admin should see the At least 8 characters still visible")
    public void adminShouldSeeTheAtLeastCharactersStillVisible() {
        adminManagementPage.AtLeast8CharectersMessage.isDisplayed();
    }

    @Then("Admin should not be able to click Submit button")
    public void adminShouldNotBeAbleToClickSubmitButton() {
        adminManagementPage.submitButton.click();
    }

    @And("Admin enters SSN in different format \\(changes the places of -)")
    public void adminEntersSSNInDifferentFormatChangesThePlacesOf() {
        BrowserUtils.sendKeysWithTimeout(adminManagementPage.ssn,"112-011-201",2);
    }

    @And("Admin should see Please enter valid SSN number message")
    public void adminShouldSeePleaseEnterValidSSNNumberMessage() {
        adminManagementPage.EnterValidSSNNumberMessage.isDisplayed();
    }

    @Then("Admin should not see the New Admin in the Admin List")
    public void adminShouldNotSeeTheNewAdminInTheAdminList() {

    }

    @And("close the browser")
    public void closeTheBrowser() {
        Driver.closeDriver();
    }
}
