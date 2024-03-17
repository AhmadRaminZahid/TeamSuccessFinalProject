package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherManagementPage {
    public TeacherManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // Choose Teacher selector here...
//    @FindBy(xpath = "//span[@aria-relevant='additions text']")
//    public WebElement chooseLessons;

//    @FindBy(xpath = "//*[contains(text(),'Select lesson')]")
//    public WebElement getChooseLessons;

    @FindBy(id = "react-select-2-placeholder")
    public WebElement chooseLessons;

    @FindBy(id = "name")
    public WebElement teacherName;

    @FindBy(id = "surname")
    public WebElement teacherSurname;

    @FindBy(id = "birthPlace")
    public WebElement teacherBirthPlace;

    @FindBy(id = "email")
    public WebElement teacherEmail;

    @FindBy(id = "phoneNumber")
    public WebElement teacherPhoneNumber;

    @FindBy(id = "isAdvisorTeacher")
    public WebElement isAdvisorTeacherButton;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femaleRadioOption;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleRadioOption;

    @FindBy(id = "birthDay")
    public WebElement DateOfBirth;

    @FindBy(id = "ssn")
    public WebElement teacherSsn;

    @FindBy(id = "username")
    public WebElement teacherUsername;

    @FindBy(id = "password")
    public WebElement teacherPassword;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;










}
