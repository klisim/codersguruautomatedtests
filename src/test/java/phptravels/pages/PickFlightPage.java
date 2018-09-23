package phptravels.pages;

import common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PickFlightPage extends BasePage {
    @FindBy(xpath="/html/body/div[4]/div[2]/div/form/div[1]")
    WebElement fromFlight;
    @FindBy(xpath="/html/body/div[11]/div/input")
    WebElement fromFlightTextBox;
    @FindBy(xpath="/html/body/div[4]/div[2]/div/form/div[9]/div[2]/div/div/ins")
    WebElement roundTripButton;
    @FindBy(xpath="/html/body/div[4]/div[2]/div/form/div[6]/button")
    WebElement searchButton;
    @FindBy(xpath="/html/body/div[4]/div[2]/div/form/div[3]/div/input")
    WebElement dateTextBox;
    @FindBy(xpath="/html/body/div[4]/div[2]/div/form/div[2]")
    WebElement toFlight;
    @FindBy(xpath="/html/body/div[12]/div/input")
    WebElement toFlightTextBox;

    public PickFlightPage(WebDriver driver) {
        super(driver);
    }

    public void enterDepartureAndArrival (String from, String to) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("Flights"));

//        roundTripButton.click();
//        searchButton.click();
//        dateTextBox.sendKeys("2019-01-31");
//        dateTextBox.sendKeys(Keys.RETURN);

        fromFlight.click();
        fromFlightTextBox.sendKeys("WAW");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fromFlightTextBox.sendKeys(Keys.RETURN);

        toFlight.click();
        toFlightTextBox.sendKeys("ROC");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        toFlightTextBox.sendKeys(Keys.RETURN);

    }

}
