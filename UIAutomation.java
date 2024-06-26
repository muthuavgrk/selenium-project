import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class UIAutomation {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        //driver.get("https://www.google.com");
        driver.get("https://rahulshettyacademy.com/client");
        driver.findElement(By.xpath("//a[@class=\"btn1\"]")).click();

        RegisterPage rp = new RegisterPage(driver);
        LoginPage lp = rp.registerUser();

        driver.get("https://rahulshettyacademy.com/client");
//        LoginPage lp = new LoginPage(driver);
        lp.LoginIntoPage();





//        driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Muthukumar");
//        driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Kannan");
//        driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("test@gamil.com");
//        driver.findElement(By.xpath("//input[@id=\"userMobile\"]")).sendKeys("7999932999");
//        WebElement dp = driver.findElement(By.xpath("//select[@formcontrolname=\"occupation\"]"));
//        Select select = new Select(dp);
//        select.selectByIndex(2);
//        driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
//        driver.findElement(By.xpath("//input[@id=\"userPassword\"]")).sendKeys("test");
//        driver.findElement(By.xpath("//input[@id=\"confirmPassword\"]")).sendKeys("test");

        Thread.sleep(2000);
       // driver.quit();

    }

}
