import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "//input[@id=\"userEmail\"]")
    WebElement Email;
    @FindBy(xpath = "//input[@id=\"userPassword\"]")
    WebElement Password;

    @FindBy(xpath = "//input[@id=\"login\"]")
    WebElement LoginButton;


    public LoginPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void LoginIntoPage(){
        Email.sendKeys("anshika@gmail.com");
        Password.sendKeys("Iamking@000");
        LoginButton.click();
    }
}
