package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "((//a)[2])")
    public WebElement loginHomePage;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement userNameOfTheLogin;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordOfTheLogin;

    @FindBy(xpath = "(//*[text()='Login'])[2]")
    public WebElement loginOfTheButton;

}
