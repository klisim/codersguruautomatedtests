package codersguru.pages;

import common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MentorPage extends BasePage {
    @FindBy(xpath="/html/body/main/div[2]/div/div[1]/div/div[2]/div[2]/button")
    private WebElement firstMentor;
    @FindBy(xpath="/html/body/div[1]/div/div/div[2]/div[2]/div[1]/form/textarea")
    private WebElement problemTextBox;
    @FindBy(xpath="/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[2]/ul/li[1]")
    private WebElement termDate;
    @FindBy(xpath="/html/body/div[1]/div/div/div[2]/div[1]/div[3]/div[2]/ul/li[1]")
    private WebElement termHour;
    @FindBy(xpath="/html/body/div[1]/div/div/div[2]/div[2]/div[3]/a/button")
    private WebElement orderButton;

    public MentorPage(WebDriver driver) {
        super(driver);
    }

    public void selectFirstMentor(){
        firstMentor.click();
    }

    public void enterProblem(String problem){
        problemTextBox.sendKeys(problem);
    }

    public void pickDateAndGoToPayment(){
        termDate.click();
        termHour.click();
        orderButton.click();
    }

}
