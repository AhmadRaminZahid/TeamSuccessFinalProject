package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MeetManagementPage {

    public MeetManagementPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[text()='Menu']")
    public WebElement teacherMenuButton;

    @FindBy(xpath = "//*[text()='Meet Management']")
    public WebElement teacherMeetManagementButton;

    @FindBy(xpath = "//*[text()='Meet List']")
    public WebElement teacherMeetListText;

    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    public WebElement teacherMeetSelectStudentButton;

    @FindBy(xpath = "//input[@id='date']")
    public WebElement teacherMeetDateBox;

    @FindBy(xpath = "//input[@id='startTime']")
    public WebElement teacherMeetStartTimeBox;

    @FindBy(xpath = "//input[@id='stopTime']")
    public WebElement teacherMeetStopTimeBox;

    @FindBy(xpath = "//input[@id='description']")
    public WebElement teacherMeetDescriptionBox;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement teacherMeetSubmitButton;

    @FindBy(xpath = "//div[text()='Meet Saved Successfully']")
    public WebElement teacherMeetSavedSuccessfullyMessage;

    @FindBy(xpath = "(//button[@*='text-dark btn btn-outline-info'])[1]")
    public WebElement teacherMeetEditButton;

    @FindBy(xpath = "(//input[@id='date'])[2]")
    public WebElement teacherMeetEditDateBox;

    @FindBy(xpath = "((//*[text()='Submit'])[2]")
    public WebElement teacherMeetEditSubmitButton;

    @FindBy(xpath = "(//*[text()='Meet Updated Successfully'])[1]")
    public WebElement teacherMeetEditUpdatedSuccessfully;

    @FindBy(xpath = "(//*[text()='ileri bir tarih olmalı'])[1]")
    public WebElement teacherMeetEditMustBeFutureDateMessage;


}
