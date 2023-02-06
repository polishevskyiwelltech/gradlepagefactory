package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookRegistrationPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@data-testid=\"open-registration-form-button\"]\n")
    public WebElement regButton;

    @FindBy(name = "firstname")
    public WebElement firstName;

    @FindBy(name = "lastname")
    public WebElement lastName;

    @FindBy(name = "reg_email__")
    public WebElement email;

    @FindBy(name = "reg_passwd__")
    public WebElement password;

    @FindBy(name = "birthday_month")
    public WebElement mount;

    @FindBy(name = "birthday_day")
    public WebElement day;

    @FindBy(name = "birthday_year")
    public WebElement year;

    @FindBy(xpath = "(//label[@class='_58mt'])[2]")
    public WebElement gendor;

    @FindBy(name = "websubmit")
    public WebElement submit;

    public FacebookRegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
