package codersguru.pages;

import codersguru.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayUPage extends BasePage {
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/main/div[2]/article/div/div/div[1]/a[2]")
    private WebElement cardButton;
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/main/div[2]/article/div/form/div[1]/input")
    private WebElement cardNumberTextBox;
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/main/div[2]/article/div/form/div[2]/div/div[1]/input")
    private WebElement dateTextBox;
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/main/div[2]/article/div/form/div[2]/div/div[2]/input")
    private WebElement CVVTextBox;
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/main/div[2]/article/div/form/div[3]/input")
    private WebElement nameAndSurnameTextBox;
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/main/div[2]/article/div/form/div[4]/input")
    private WebElement emailTextBox;
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/main/div[2]/article/div/form/div[5]/input")
    private WebElement payButton;
    @FindBy(xpath="/html/body/div/div/div[2]/main/div[2]/article/div/form/div[1]/label/span")
    private WebElement errorMessage;


    public PayUPage(WebDriver driver){
        super(driver);
    }

    public void pickCardPayment(){
        cardButton.click();
    }

    public void provideData(String cardNumber, String date, String CVV, String nameAndSurname, String email){
        cardNumberTextBox.sendKeys(cardNumber);
        dateTextBox.sendKeys(date);
        CVVTextBox.sendKeys(CVV);
        nameAndSurnameTextBox.sendKeys(nameAndSurname);
        emailTextBox.sendKeys(email);
        payButton.click();
    }

    public String getCardErrorMessage(){
        return errorMessage.getText();
    }

}
