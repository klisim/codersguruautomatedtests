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
    @FindBy (xpath="/html/body/div[4]/div[2]/div/form/div[9]/div[2]/div/label")
    private WebElement roundTripCheckBox;

    @FindBy (id = "s2id_location_from")
    private WebElement fromCityClickOnBox;

    @FindBy (xpath = "/html/body/div[11]/div/input")
    private WebElement fromCityTextBox;

    @FindBy (id="s2id_location_to")
    private WebElement toCityClickOnBox;

    @FindBy (xpath = "/html/body/div[12]/div/input")
    private WebElement toCityTextBox;

    @FindBy (name="departure")
    private WebElement fromDateTextBox;

    @FindBy (name="arrival")
    private WebElement toDateTextBox;

    @FindBy (xpath = "//*[@id=\"body-section\"]/div[2]/div/form/div[6]/button")
    private WebElement submitButton;

    public PickFlightPage(WebDriver driver) {
        super(driver);
    }

    public void enterDepartureAndArrival (String from, String to, String fromDate, String toDate) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(roundTripCheckBox));

        roundTripCheckBox.click();

        fromCityClickOnBox.click();
        enterKeys(fromCityTextBox, from);

        toCityClickOnBox.click();
        enterKeys(toCityTextBox, to);
        enterKeys(fromDateTextBox, fromDate);
        enterKeys(toDateTextBox, toDate);

        submitButton.click();
    }

    public void enterKeys(WebElement element, String keys) {
        element.sendKeys(keys);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        element.sendKeys(Keys.ENTER);
    }

}
