package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import pages.MainMenuPage;
import pages.StudentInfoManagementPage;
import utilities.Driver;
import utilities.WaitUtils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_17_Stepdefs {


    LoginPage loginPage = new LoginPage();

    MainMenuPage mainMenuPAge =new MainMenuPage();


    StudentInfoManagementPage studentInfoManagementPage=new StudentInfoManagementPage();


    @Given("The teacher navigates to {string}")
    public void theTeacherNavigatesTo(String HomeUrl) {
        Driver.getDriver().get(HomeUrl);

        WaitUtils.waitFor(1);

    }

    @And("The teacher clicks on Login button on homepage")
    public void theTeacherClicksOnLoginButtonOnHomepage() {
        loginPage.loginButtonMainPage.click();

        WaitUtils.waitFor(1);
    }

    @And("The teacher enters the username")
    public void theTeacherEntersTheUsername() {
        loginPage.userName.sendKeys("İbrahim3");

        WaitUtils.waitFor(1);
    }

    @And("The teacher enters the password")
    public void theTeacherEntersThePassword() {
        loginPage.password.sendKeys("ibrahim33A");

        WaitUtils.waitFor(1);
    }

    @And("The teacher clicks on Login button")
    public void theTeacherClicksOnLoginButton() {
        loginPage.loginButton.click();
        WaitUtils.waitFor(1);
    }
    
    // TC 01

    @When("The teacher sees Student Info Management page")
    public void theTeacherSeesStudentInfoManagementPage() {
        assertTrue(studentInfoManagementPage.chooseStudentStudentInfoManagement.isDisplayed());

        WaitUtils.waitFor(2);
    }

    @And("The teacher clicks Choose Lesson")
    public void theTeacherClicksChooseLesson() {
        studentInfoManagementPage.chooseLessonStudentInfoManagement.click();
 
        WaitUtils.waitFor(2);
    }
    

    @And("The teacher clicks Choose Student")
    public void theTeacherClicksChooseStudent() {
        studentInfoManagementPage.chooseStudentFromDropDownStudentInfoManagement.click();
        WaitUtils.waitFor(2);
    }

    @And("The teacher clicks Choose Education Term")
    public void theTeacherClicksChooseEducationTerm() {
        studentInfoManagementPage.chooseEducationTermInfoManagement.click();
    }

    @And("The teacher enters Absentee")
    public void theTeacherEntersAbsentee() {

        studentInfoManagementPage.chooseAbsenteeStudentTermInfoManagement.sendKeys("10", Keys.TAB);
        
         WaitUtils.waitFor(2);
    }
    @And("The teacher enters Midterm Exam")
    public void theTeacherEntersMidtermExam() {
        studentInfoManagementPage.choosemidttermExamStudentInfoManagement.sendKeys("40", Keys.TAB);
        WaitUtils.waitFor(2);
    }

    @And("The teacher enters Final Exam")
    public void theTeacherEntersFinalExam() {
        studentInfoManagementPage.choosefinalExamStudentInfoManagement.sendKeys("56", Keys.TAB);
        WaitUtils.waitFor(2);
    }

    @And("The teacher enters Info Note")
    public void theTeacherEntersInfoNote() {
        studentInfoManagementPage.chooseinfoNoteStudentInfoManagement.sendKeys("CC + dersten geçti", Keys.TAB);
        WaitUtils.waitFor(5);
    }
    
    @And("teacher clicks Submit Button")
    public void teacherClicksSubmitButton() {
        studentInfoManagementPage.chooseButtonSTudentTermInfoManagement.click();
    }
    
    @And("teachers must see {string} message")
    public void teachersMustSeeMessage(String expectedResult) {
        assertEquals(expectedResult,"Student Info Saved Succesfully");
        WaitUtils.waitFor(5);
    }
    
    @And("Close driver")
    public void closeDriver() {
        Driver.closeDriver();
    }
    
    
    
    //TC_02
    @When("teacher sees Student Info Management page")
    public void teacherSeesStudentInfoManagementPage() {
                   assertTrue(studentInfoManagementPage.chooseStudentStudentInfoManagement.isDisplayed());
            WaitUtils.waitFor(2);
            
        
        
    }
    
    @And("teacher clicks Choose Lesson")
    public void teacherClicksChooseLesson() {
        studentInfoManagementPage.chooseStudentFromDropDownStudentInfoManagement.click();
        WaitUtils.waitFor(2);
    }
    
    @And("teacher clicks Choose Student")
    public void teacherClicksChooseStudent() {
        studentInfoManagementPage.chooseStudentFromDropDownStudentInfoManagement.click();
        WaitUtils.waitFor(2);
    }
    
    @And("teacher clicks Choose Education Term")
    public void teacherClicksChooseEducationTerm() {
        studentInfoManagementPage.chooseEducationTermInfoManagement.click();
        WaitUtils.waitFor(2);
        
        
    }
    
    @And("teacher enters Absentee")
    public void teacherEntersAbsentee() {
        studentInfoManagementPage.chooseAbsenteeStudentTermInfoManagement.sendKeys("0", Keys.TAB);
        WaitUtils.waitFor(2);
    }
    
    @And("teacher enters Midterm Exam")
    public void teacherEntersMidtermExam() {
        studentInfoManagementPage.choosemidttermExamStudentInfoManagement.sendKeys("30", Keys.TAB);
        WaitUtils.waitFor(2);
    }
    
    @And("teacher enters Final Exam")
    public void teacherEntersFinalExam() {
        studentInfoManagementPage.choosefinalExamStudentInfoManagement.sendKeys("150", Keys.TAB);
        WaitUtils.waitFor(2);
    }
    
    @And("teacher enters Info Note")
    public void teacherEntersInfoNote() {
        studentInfoManagementPage.chooseinfoNoteStudentInfoManagement.sendKeys("dd + dersten geçti", Keys.TAB);
        WaitUtils.waitFor(5);
    }
    @And("tteacher clicks submit button")
    public void tteacherClicksSubmitButton() {
        studentInfoManagementPage.chooseButtonSTudentTermInfoManagement.click();
        WaitUtils.waitFor(5);
    }
    
    @And("tteachers must see javascript pop-up message {string} message")
    public void tteachersMustSeeJavascriptPopUpMessageMessage(String expectedResult) {
        assertEquals(expectedResult,"'100.0' değerinden küçük yada eşit olmalı");
        WaitUtils.waitFor(5);
        
    }
    
    
    @And("cclose driver")
    public void ccloseDriver() {
        Driver.closeDriver();
    }
}
    
    
    
    
