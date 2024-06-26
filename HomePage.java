import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    WebDriver driver;
    ////div[@class="card-body"]//button[@class="btn w-10 rounded"]
    @FindBy(xpath="//div[@class=\"card-body\"]/h5/b")
    List<WebElement> itemsList;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void addItemIntoCart() {
        int index = 1;
        System.out.println(itemsList.size());
        for (WebElement item : itemsList) {
            if (item.getText().equalsIgnoreCase("IPHONE 13 PRO")) {
                driver.findElement(By.xpath("//div[@class=\"card-body\"]//button[@class=\"btn w-10 rounded\"]")).click();
            }
            index++;
        }
    }

}
