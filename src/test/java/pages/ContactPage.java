package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactPage {

    public ContactPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[text()='Contact']")
    public WebElement contact;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement nameOfTheContact;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement emailOfTheContact;

    @FindBy(xpath = "//*[@id='subject']")
    public WebElement subjectOfTheContact;

    @FindBy(xpath = "//*[text()='Send Message']")
    public WebElement messageOfTheContact;
}
