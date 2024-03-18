package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeanManagementPage;
import pages.LoginPage;
import pages.MainMenuPage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.WaitUtils;
public class US_04_StepDefs {

    LoginPage loginPage = new LoginPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    public static String deanUserName;
    public static int phoneNumber;
    public static int ssnNumber;
    public static String deanPassword;

    @And("clicks Dean Management option")
    public void clicksDeanManagementOption() {
        mainMenuPage.deanManagementInsideMenu.click();
    }

    @And("enters Dean’s Name")
    public void entersDeanSName() {
        WaitUtils.waitFor(2);
        deanManagementPage.name.sendKeys("Ali");
    }

    @And("enters Dean’s Surname")
    public void entersDeanSSurname() {
        deanManagementPage.surname.sendKeys("Can");
    }

    @And("enters Dean’s Birth Place")
    public void entersDeanSBirthPlace() {
        deanManagementPage.birthPlace.sendKeys("USA");
    }

    @And("selects Dean’s Gender")
    public void selectsDeanSGender() {
        deanManagementPage.maleGender.click();
    }

    @And("enters Dean’s Date of Birth")
    public void entersDeanSDateOfBirth() {
        deanManagementPage.dateOfBirth.sendKeys("01.01.1999");
    }

    @And("enters Dean’s Phone Number")
    public void entersDeanSPhoneNumber() {
        phoneNumber = Faker.instance().number().numberBetween(100,999);
        deanManagementPage.phoneNumber.sendKeys(phoneNumber+"-456-1233");
    }

    @When("enters SSN Number")
    public void entersSSNNumber() {
        ssnNumber = Faker.instance().number().numberBetween(100,999);
        deanManagementPage.ssn.sendKeys(ssnNumber+"-45-6780");
    }

    @And("enters user name")
    public void entersUserName() {
        deanUserName=Faker.instance().name().username();
        deanManagementPage.username.sendKeys(deanUserName);
    }

    @And("enters password")
    public void entersPassword() {
        deanPassword = "Dean12345";
        deanManagementPage.password.sendKeys(deanPassword);
    }

    @And("clicks Submit button")
    public void clicksSubmitButton() {
        deanManagementPage.submitButton.click();
    }

    @Then("see Dean Saved message")
    public void seeDeanSavedMessage() {
        WaitUtils.waitFor(1);
        BrowserUtils.verifyElementDisplayed(deanManagementPage.successMessageDeanSaved);
    }
    @And("clicks logout option and clicks yes")
    public void clicksLogoutOptionAndClicksYes() {
        mainMenuPage.logoutInsideMenu.click();
        mainMenuPage.yesForLogout.click();
    }

    @When("enters invalid SSN Number")
    public void entersInvalidSSNNumber() {
        deanManagementPage.ssn.sendKeys(ssnNumber+"11111111");
    }

    @Then("see Please enter valid SSN number message")
    public void seePleaseEnterValidSSNNumberMessage() {
        WaitUtils.waitForVisibility(deanManagementPage.invalidSsnMessageDeanSaved,3);
        BrowserUtils.verifyElementDisplayed(deanManagementPage.invalidSsnMessageDeanSaved);
    }

    @Then("close the webpage")
    public void closeTheWebpage() {
        Driver.closeDriver();
    }
}
