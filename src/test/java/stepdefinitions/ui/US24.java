package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;
import pages.MainMenuPage;
import pages.TeacherManagementPage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import java.util.concurrent.TimeUnit;

public class US24 {
    MainMenuPage mainMenuPage = new MainMenuPage();
    LoginPage loginPage = new LoginPage();
    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();
    @When("Admin clicks the Menu button")
public void adminClicksTheMenuButton() {
    BrowserUtils.clickWithTimeOut(mainMenuPage.menuButton,1);
}
    @And("Admin clicks on the Teacher Management option")
    public void adminClicksOnTheTeacherManagementOption() {

      BrowserUtils.clickWithTimeOut(mainMenuPage.teacherManagementInsideMenu,1);
    }
    @And("Admin clicks on Choose Lessons input part")
    public void adminClicksOnChooseLessonsInputPart() {
         JSUtils.JSclickWithTimeout(teacherManagementPage.chooseLessons);
        //teacherManagementPage.chooseLessons.click();
    }
    @And("Admin selects first lesson from lessons option")
    public void adminSelectsFirstLessonFromLessonsOption() {

        //JSUtils.JSclickWithTimeout(teacherManagementPage.chooseLessons);
//
       Actions keyDown = new Actions(Driver.getDriver());
      keyDown.setActiveKeyboard("C++").build().perform();

WaitUtils.waitFor(5);

        //teacherManagementPage.chooseLessons.sendKeys("Flying", Keys.ENTER);
    }

    @And("Admin enters the  admin User Name")
    public void adminEntersTheAdminUserName() {
        loginPage.userName.sendKeys("AdminBatch197");
    }

    @And("Admin enters the  admin password")
    public void adminEntersTheAdminPassword() {
        loginPage.password.sendKeys("Batch197+");

    }

    @And("Admin clicks on the Login button")
    public void adminClicksOnTheLoginButton() {
        loginPage.loginButton.click();
    }
    @And("Admin enters a teacher name")
    public void adminEntersATeacherName() {
        WaitUtils.waitFor(10);

    }

    @And("Admin enters a teacher surname")
    public void adminEntersATeacherSurname() {
    }

    @And("Admin clicks on the Is Adviser Teacher box")
    public void adminClicksOnTheIsAdviserTeacherBox() {
    }

    @And("Admin clicks on one option from Gender boxes")
    public void adminClicksOnOneOptionFromGenderBoxes() {
    }

    @And("Admin clicks on Submit button")
    public void adminClicksOnSubmitButton() {
    }

    @Then("Admin verify to see a success message {string}")
    public void adminVerifyToSeeASuccessMessage(String arg0) {
    }
}
