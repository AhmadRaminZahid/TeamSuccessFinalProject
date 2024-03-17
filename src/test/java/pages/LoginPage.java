package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//a[@href='/login']")
    public WebElement loginButtonMainPage;
    @FindBy(id = "username")
    public  WebElement userName;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement loginButton;
}

