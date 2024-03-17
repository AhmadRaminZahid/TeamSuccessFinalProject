package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanManagementPage {

    public ViceDeanManagementPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//button[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement viceDeanLessonProgram;

    @FindBy (xpath = "(//input[@id='lessonProgramId'])[1]")
    public WebElement viceDeanChooseLesson;

    @FindBy (id = "teacherId")
    public WebElement viceDeanChooseTeacher;

    @FindBy (xpath = "(//*[text()='Submit'])[4]")
    public WebElement viceDeanLessonProgramSubmit;

    @FindBy (xpath = "//div[text()='The given id must not be null!;']")
    public WebElement viceDeanLessonProgramIdMustNotBeNullMessage;
    ////div[text()='The given id must not be null!; nested exception is java.lang.IllegalArgumentException: The given id must not be null!']


    @FindBy (xpath = "//div[text()='Lesson added to Teacher']")
    public WebElement viceDeanLessonAddedToTeacherMessage;


}
