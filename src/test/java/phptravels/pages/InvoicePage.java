package phptravels.pages;

import common.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class InvoicePage extends BasePage {
    @FindBy(id="downloadInvoice")
    private WebElement downloadInvoice;

    public InvoicePage(WebDriver driver) {
        super(driver);
    }

    public void takeScreenshot(){

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(downloadInvoice));

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("/home/mdobrzycki/Desktop/invoice.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
