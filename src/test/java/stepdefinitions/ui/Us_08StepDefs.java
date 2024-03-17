package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ViceDeanManagementPage;
import utilities.ConfigReader;

public class Us_08StepDefs {
    ViceDeanManagementPage viceDeanManagementPage = new ViceDeanManagementPage();
    LoginPage loginPage= new LoginPage();
    @And("User enters a valid Vice Dean User name")
    public void userEntersAValidViceDeanUserName() {
    loginPage.userName.sendKeys(ConfigReader.getProperty("ViceDeanUsername"));
    }

    @And("User enters a valid Vice Dean password")
    public void userEntersAValidViceDeanPassword() {
        loginPage.userName.sendKeys(ConfigReader.getProperty("ViceDeanPassword"));
    }

    @When("User clicks on Lessons top center of the page")
    public void userClicksOnLessonsTopCenterOfThePage() {
        viceDeanManagementPage.lessonsHeadButton.click();
    }

    @And("User enters lesson name on Lesson Name field")
    public void userEntersLessonNameOnLessonNameField() {
        viceDeanManagementPage.lessonName.sendKeys(Faker.instance().app().name());
    }

    @And("User select compulsory button")
    public void userSelectCompulsoryButton() {
        viceDeanManagementPage.compulsoryClickButton.click();
    }

    @And("User enters credit score for lesson on Credit Score field")
    public void userEntersCreditScoreForLessonOnCreditScoreField() {

 viceDeanManagementPage.creditScore.sendKeys("4");
    }

    @And("User clicks Submit button")
    public void userClicksSubmitButton() {
    }

    @And("User sees a success message {string}")
    public void userSeesASuccessMessage(String arg0) {
    }

    @And("User enters same lesson name that already created on Lesson Name field")
    public void userEntersSameLessonNameThatAlreadyCreatedOnLessonNameField() {
    }

    @And("User sees a error message {string}")
    public void userSeesAErrorMessage(String arg0) {
    }
}
