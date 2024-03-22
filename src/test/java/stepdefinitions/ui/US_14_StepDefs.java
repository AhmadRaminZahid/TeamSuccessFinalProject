package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.MainMenuPage;
import pages.TeacherManagementPage;
import utilities.BrowserUtils;
import utilities.WaitUtils;

import static stepdefinitions.ui.US_15_StepDefs.userName;

public class US_14_StepDefs {
    LoginPage loginPage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();

    @When("clicks on the Menu button on the right corner of the page")
    public void clicksOnTheMenuButtonOnTheRightCornerOfThePage() {
        BrowserUtils.clickWithTimeOut(teacherManagementPage.teacherManagement,2);
    }

    @And("finds the teacher created on the Teacher List on the page")
    public void findsTheTeacherCreatedOnTheTeacherListOnThePage() {
        WaitUtils.waitForClickablility(teacherManagementPage.teacherEditListButton,1);
        teacherManagementPage.teacherEditListButton.click();
        WaitUtils.waitFor(1);
    }

    @And("clicks on Edit button on the teacher name")
    public void clicksOnEditButtonOnTheTeacherName() {
        BrowserUtils.clickWithTimeOut(teacherManagementPage.teacherManagementAddTeacherEditButton,2);
    }

    @And("enters a valid User Name")
    public void entersAValidUserName() {
        BrowserUtils.sendKeysWithTimeout(teacherManagementPage.teacherUsername,userName,2);
    }

    @Then("sees required message on the Birth Place box")
    public void seesRequiredMessageOnTheBirthPlaceBox() {
        WaitUtils.waitFor(2);
        teacherManagementPage.teacherManagementAddTeacherBirthPlaceRequired.isDisplayed();
    }

    @And("enters a valid teacher NameBox")
    public void entersAValidTeacherNameBox() {
        teacherManagementPage.chooseLessonBox.click();
    }
}
