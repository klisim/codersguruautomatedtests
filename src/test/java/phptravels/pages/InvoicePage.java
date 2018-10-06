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
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InvoicePage extends BasePage {
    @FindBy(id="downloadInvoice")
    private WebElement downloadInvoice;

    public InvoicePage(WebDriver driver) {
        super(driver);
    }

    public void takeScreenshot(){
        String Data = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(downloadInvoice));

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("/home/marcin/Desktop/"+ Data +"-rachunek.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
