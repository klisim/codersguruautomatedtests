package phptravels.pages;

import common.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BookFlightPage extends BasePage {
    @FindBy(id="bookbtn")
    private List<WebElement> bookButton;

    public BookFlightPage(WebDriver driver){
        super(driver);
    }

    public void pickFirstFlight() {
        new WebDriverWait(driver, 60).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));

        bookButton.get(0).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
