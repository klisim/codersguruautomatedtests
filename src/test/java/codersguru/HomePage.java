package codersguru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(name="email")
    private WebElement emailTextBox;

    @FindBy(xpath="/html/body/section[1]/div/div[1]/a/img")
    private WebElement homePageLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email) {
        this.emailTextBox.clear();
        this.emailTextBox.sendKeys(email);
    }

}
