package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentManagementPage {
    public StudentManagementPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "advisorTeacherId")
    public WebElement studentManagementChooseTeacher;
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement studentManagementAddStudentName;
    @FindBy(xpath = "//input[@placeholder='Surname']")
    public WebElement studentManagementAddStudentSurname;
    @FindBy(xpath = "//input[@placeholder='Birth Place']")
    public WebElement studentManagementAddStudentBirthPlace;
    @FindBy(xpath = "//input[@placeholder='Email Address']")
    public WebElement studentManagementAddStudentEmailAddress;
    @FindBy(xpath = "//input[@placeholder='Phone Number']")
    public WebElement studentManagementAddStudentPhoneNumber;
    @FindBy(xpath = "//input[@placeholder='ssn']")
    public WebElement studentManagementAddStudentSsn;
    @FindBy(xpath = "//input[@placeholder='Father Name']")
    public WebElement studentManagementAddStudentFatherName;
    @FindBy(xpath = "//input[@placeholder='Mother Name']")
    public WebElement studentManagementAddStudentMotherName;
    @FindBy(xpath = "//input[@placeholder='username']")
    public WebElement studentManagementAddStudentUsername;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement studentManagementAddStudentPassword;
    @FindBy(xpath = "(//input[@name='gender'])[1]")
    public WebElement studentManagementAddTeacherGenderFemale;
    @FindBy(xpath = "(//input[@name='gender'])[2]")
    public WebElement studentManagementAddTeacherGenderMale;
    @FindBy(id = "birthDay")
    public WebElement studentManagementAddTeacherDateOfBirth;
    @FindBy(xpath = "(//button[@type='button'])[5]")
    public WebElement studentManagementAddStudentSubmitButton;
    @FindBy(xpath = "(//tr//th)[1]")
    public WebElement studentManagementStudentListStudentNumber;
    @FindBy(xpath = "(//tr//th)[2]")
    public WebElement studentManagementStudentListName;
    @FindBy(xpath = "(//tr//th)[3]")
    public WebElement studentManagementStudentListPhoneNumber;
    @FindBy(xpath = "(//tr//th)[4]")
    public WebElement studentManagementStudentListSsn;
    @FindBy(xpath = "(//tr//th)[5]")
    public WebElement studentManagementStudentListUsername;
    @FindBy(xpath = "(//a[@class='page-link'])[1]")
    public WebElement studentManagementAddStudentLeftForwardButton;
    @FindBy(xpath = "(//a[@class='page-link'])[2]")
    public WebElement studentManagementAddStudentLeftButton;
    @FindBy(xpath = "(//a[@class='page-link'])[3]")
    public WebElement studentManagementAddStudentRightButton;
    @FindBy(xpath = "(//a[@class='page-link'])[4]")
    public WebElement studentManagementAddStudentRightForwardButton;
    @FindBy(xpath = "(//span[@class='page-link'])")
    public WebElement studentManagementAddStudentNumOfPage;






}
