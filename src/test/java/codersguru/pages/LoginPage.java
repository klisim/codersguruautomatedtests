package codersguru.pages;

import common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id="username")
    private WebElement userNameTextBox;
    @FindBy(id="password")
    private WebElement passwordTextBox;
    @FindBy(id="_submit")
    private WebElement loginButton;

    public LoginPage (WebDriver driver) {
        super(driver);
    }

    public void loginAsUserWithPassword(String user, String password){
        userNameTextBox.sendKeys(user);
        passwordTextBox.sendKeys(password);
        loginButton.click();
    }

}
