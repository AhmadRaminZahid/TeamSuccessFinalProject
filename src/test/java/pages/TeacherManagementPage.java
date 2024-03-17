package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherManagementPage {

    public TeacherManagementPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "controlled-tab-example-tab-teachersList")
    public WebElement teacherManagementTeacher;
    @FindBy(xpath = "//div[@class=' css-13cymwt-control']")
    public WebElement teacherManagementAddTeacherChooseLessons;
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement teacherManagementAddTeacherName;
    @FindBy(xpath = "//input[@placeholder='Surname']")
    public WebElement teacherManagementAddTeacherSurname;
    @FindBy(xpath = "//input[@placeholder='Birth Place']")
    public WebElement teacherManagementAddTeacherBirthPlace;
    @FindBy(xpath = "//input[@placeholder='Email Address']")
    public WebElement teacherManagementAddTeacherEmailAddress;
    @FindBy(xpath = "//input[@placeholder='Phone Number']")
    public WebElement teacherManagementAddTeacherPhoneNumber;
    @FindBy(id = "isAdvisorTeacher")
    public WebElement teacherManagementIsAdvisorTeacherBox;
    @FindBy(xpath = "(//input[@name='gender'])[1]")
    public WebElement teacherManagementGenderFemaleBox;
    @FindBy(xpath = "(//input[@name='gender'])[2]")
    public WebElement teacherManagementGenderMaleBox;
    @FindBy(id = "birthDay")
    public WebElement teacherManagementAddTeacherDateOfBirth;
    @FindBy(xpath = "//input[@placeholder='ssn']")
    public WebElement teacherManagementAddTeacherSsn;
    @FindBy(xpath = "//input[@placeholder='username']")
    public WebElement teacherManagementAddTeacherUsername;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement teacherManagementAddTeacherPassword;
    @FindBy(xpath = "(//button[@type='button'])[7]")
    public WebElement teacherManagementAddTeacherSubmitButton;
    @FindBy(xpath = "(//button[@type='button'])[8]")
    public WebElement teacherManagementAddTeacherEditButton; //the number change for different edit button
    @FindBy(xpath = "(//a[@class='page-link'])[1]")
    public WebElement teacherManagementAddTeacherLeftForward;
    @FindBy(xpath = "(//a[@class='page-link'])[2]")
    public WebElement teacherManagementAddTeacherLeftButton;
    @FindBy(xpath = "(//a[@class='page-link'])[3]")
    public WebElement teacherManagementAddTeacherRightButton;
    @FindBy(xpath = "(//a[@class='page-link'])[4]")
    public WebElement teacherManagementAddTeacherRightForwardButton;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement teacherManagementAddTeacherNameRequired;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement teacherManagementAddTeacherSurnameRequired;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement teacherManagementAddTeacherBirthPlaceRequired;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement teacherManagementAddTeacherEmailRequired;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement teacherManagementAddTeacherPhoneRequired;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement teacherManagementAddTeacherDateOfBirthRequired;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement teacherManagementAddTeacherSsnRequired;
    @FindBy(id = "controlled-tab-example-tab-advisorTeachersList")
    public WebElement teacherManagementAdvisorTeacher;
    @FindBy(xpath = "(//tr//th)[5]")
    public WebElement advisorTeachersAdvisorTeachersListName;
    @FindBy(xpath = "(//tr//th)[6]")
    public WebElement advisorTeachersAdvisorTeachersListSsn;
    @FindBy(xpath = "(//a[@class='page-link'])[5]")
    public WebElement advisorTeacherAdvisorTeachersListLeftForwardButton;
    @FindBy(xpath = "(//a[@class='page-link'])[6]")
    public WebElement advisorTeacherAdvisorTeachersListLeftButton;
    @FindBy(xpath = "(//a[@class='page-link'])[7]")
    public WebElement advisorTeacherAdvisorTeachersListRightButton;
    @FindBy(xpath = "(//a[@class='page-link'])[8]")
    public WebElement advisorTeacherAdvisorTeachersListRightForwardButton;
    @FindBy(xpath = "(//span[@class='page-link'])[2]")
    public WebElement advisorTeacherAdvisorTeachersListNumOfPage;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement teacherManagementAddTeacherSuccessMessage;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement teacherManagementTeacherListErrorMessageEdit;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement teacherManagementTeacherListSuccessMessageEdit;





}
