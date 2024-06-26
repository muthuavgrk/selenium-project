import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    WebDriver driver;
    public RegisterPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath="//input[@id=\"firstName\"]")
    WebElement FirstName;
    @FindBy(xpath="//input[@id=\"lastName\"]")
    WebElement LastName;
    @FindBy(xpath= "//input[@id=\"userEmail\"]")
    WebElement Email;
    @FindBy(xpath="//input[@id=\"userMobile\"]")
    WebElement Mobile;
    @FindBy(xpath="//select[@formcontrolname=\"occupation\"]")
    WebElement dp;

    @FindBy(xpath="//input[@value=\"Male\"]")
            WebElement Gender;
    @FindBy(xpath="//input[@id=\"userPassword\"]")
            WebElement Password;
    @FindBy(xpath="//input[@id=\"confirmPassword\"]")
            WebElement ConfirmPassword;




    public LoginPage registerUser(){
        FirstName.sendKeys("Muthu");
        LastName.sendKeys("Kannan");
        Email.sendKeys("Test@gmail.com");
        Mobile.sendKeys("123456789");
        Select select = new Select(dp);
        select.selectByIndex(2);
        Gender.click();
        Password.sendKeys("Test");
        ConfirmPassword.sendKeys("Test");
        return new LoginPage(driver);
    }
}
