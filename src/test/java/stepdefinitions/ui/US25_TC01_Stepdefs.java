//package stepdefinitions.ui;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pages.LoginPage;
//import pages.StudentManagementPage;
//import utilities.Driver;
//
//public class US25_TC01_Stepdefs {
//    LoginPage loginPage = new LoginPage();
//    StudentManagementPage studentManagementPage = new StudentManagementPage();
//    @Given("Admin goes to website {string}")
//    public void adminGoesToWebsite(String url) {
//        Driver.getDriver().get(url);
//    }
//
//    @And("Admin clicks on the Log in button at the home page")
//    public void adminClicksOnTheLogInButtonAtTheHomePage() {
//        loginPage.loginButtonMainPage.click();
//    }
//
//    @And("Admin enters the  admin User Name")
//    public void adminEntersTheAdminUserName() {
//        loginPage.userName.sendKeys("AdminBatch197");
//    }
//
//    @And("Admin enters the  admin password")
//    public void adminEntersTheAdminPassword() {
//        loginPage.password.sendKeys("Batch197+");
//
//    }
//
//    @And("Admin clicks on the Login button")
//    public void adminClicksOnTheLoginButton() {
//        loginPage.loginButton.click();
//    }
//
//    @When("Admin clicks the Menu button")
//    public void adminClicksTheMenuButton() {
//    }
//
//    @And("Admin clicks the Student Management option")
//    public void adminClicksTheStudentManagementOption() {
//    }
//
//    @And("Admin clicks Choose Advisor Teacher input field")
//    public void adminClicksChooseAdvisorTeacherInputField() {
//    }
//
//    @And("Admin selects first teacher from Choose Teacher options")
//    public void adminSelectsFirstTeacherFromChooseTeacherOptions() {
//    }
//
//    @And("Admin enters a student name")
//    public void adminEntersAStudentName() {
//    }
//
//    @And("Admin enters a student surname")
//    public void adminEntersAStudentSurname() {
//    }
//
//    @And("Admin enters a Birth Place")
//    public void adminEntersABirthPlace() {
//    }
//
//    @And("Admin enters an email")
//    public void adminEntersAnEmail() {
//    }
//
//    @And("Admin enters a phone number")
//    public void adminEntersAPhoneNumber() {
//    }
//
//    @And("Admin clicks the Gender box")
//    public void adminClicksTheGenderBox() {
//    }
//
//    @And("Admin enters Date of Birth in Date of Birth field")
//    public void adminEntersDateOfBirthInDateOfBirthField() {
//    }
//
//    @And("Admin enters a Ssn number")
//    public void adminEntersASsnNumber() {
//    }
//
//    @And("Admin enters a User Name")
//    public void adminEntersAUserName() {
//    }
//
//    @And("Admin enters the father name")
//    public void adminEntersTheFatherName() {
//    }
//
//    @And("Admin enters the mother name")
//    public void adminEntersTheMotherName() {
//    }
//
//    @And("Admin enters a password")
//    public void adminEntersAPassword() {
//    }
//
//    @Then("Admin sees a success message {string}")
//    public void adminSeesASuccessMessage(String arg0) {
//    }
//}
