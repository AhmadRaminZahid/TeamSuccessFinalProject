package pages;

<<<<<<< HEAD
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminManagementPage {
    public AdminManagementPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h3[@bg='primary']")
    public WebElement headOfAdminManagement;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "surname")
    public WebElement surname;

    @FindBy(id = "birthPlace")
    public WebElement birthPlace;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femaleGender;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleGender;
    @FindBy(id = "birthDay")
    public WebElement dateOfBirth;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;


=======
public class AdminManagementPage {
>>>>>>> origin/Semam
}
