package pages;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.jsoup.select.Evaluator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.yaml.snakeyaml.events.Event;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class StudentInfoManagementPage {
    public StudentInfoManagementPage(){

        PageFactory.initElements(Driver.getDriver(),this);




    }
    @FindBy(xpath = "//select[@id='lessonId' ]") public WebElement choooseLessonStudentInfoManagement;
    @FindBy(xpath = "//option[@value='3288']") public WebElement choooseStudentFromDropDownStudentInfoManagement;

    //option[@value='3288']=Adam Smith

    @FindBy(xpath = "//select[@id='studentId']") public WebElement chooseStudentStudentInfoManagement;
    @FindBy(xpath = "//select[@id='educationTermId']") public WebElement chooseEducationTermInfoManagement;

    @FindBy(id = "absentee") public WebElement chooseAbsenteeStudentTermInfoManagement;

    @FindBy(id = "midtermExam") public WebElement choosemidttermExamStudentInfoManagement;
    @FindBy(id = "finalExam") public WebElement choosefinalExamStudentInfoManagement;
    @FindBy(id = "infoNote") public WebElement chooseinfoNoteStudentInfoManagement;
    ;

    @FindBy(xpath = "//button[text()='Submit' ]") public WebElement chooseButtonSTudentTermInfoManagement;

    //option[@value='3288']
}

