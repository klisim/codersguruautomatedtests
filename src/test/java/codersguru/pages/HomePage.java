package codersguru.pages;

import codersguru.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HomePage extends BasePage {

    @FindBy(name = "email")
    private WebElement emailTextBox;

    @FindBy(xpath = "/html/body/section[1]/div/div[1]/a/img")
    private WebElement homePageLink;

    @FindBy(xpath = "/html/body/section[1]/div/div[2]/nav/ul/li[1]/a")
    private WebElement jakToDzialaLink;

    @FindBy(xpath = "/html/body/section[1]/div/div[2]/nav/ul/li[2]/a")
    private WebElement cennikLink;

    @FindBy(xpath = "/html/body/section[1]/div/div[2]/nav/ul/li[3]/a")
    private WebElement zostanMentoremLink;

    @FindBy(xpath = "/html/body/section[1]/div/div[3]/a/button")
    private WebElement loginLink;

    @FindBy(xpath = "/html/body/section[3]/div/form/input[2]")
    private WebElement accountLink;

    @FindBy(xpath = "/html/body/footer/div/div[1]/a[1]")
    private WebElement rulesLink;

    @FindBy(xpath = "/html/body/footer/div/div[1]/a[2]")
    private WebElement howItWorksLink;

    @FindBy(xpath = "/html/body/footer/div/div[2]/a")
    private WebElement facebookLink;

    @FindBy(xpath="/html/body/footer/div/legal/a")
    private WebElement codersLabLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email) {
        emailTextBox.clear();
        emailTextBox.sendKeys(email);
    }

    public void clickOnAllLinks() {
        WebElement[] listaLinkow = {
                emailTextBox,
                homePageLink,
                jakToDzialaLink,
                cennikLink,
                zostanMentoremLink,
                loginLink,
                accountLink,
                rulesLink,
                howItWorksLink,
                facebookLink};

        for (WebElement temp : listaLinkow) {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            temp.click();
            assertTrue(driver.getTitle().contains("Coders"));

            // wypiszmy w konsoli co robimy
            System.out.println("Aktualnie jestem na linku :" + temp.toString());
            System.out.println("Adres odwiedzony to: " + driver.getCurrentUrl());

            driver.navigate().back();
        }
    }

    public boolean clickOnCodersLabLink() {
        // złap uchwyt do aktualnego okna
        String parentHandle = driver.getWindowHandle();
        // kliknij na codersLabLink i otwórz nowe okno
        codersLabLink.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // przeswitchuj się do otwartego okna
        for (String winHandle: driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        // sprawdź asercje
        if (driver.getTitle().contains("Coders")){
            driver.close();
            // wróc do poprzedniego okna
            driver.switchTo().window(parentHandle);
            return true;
        }

        // zamknij okno
        driver.close();
        // wróc do poprzedniego okna
        driver.switchTo().window(parentHandle);
        return false;
    }

    public void goToRegistrationPage() {
        accountLink.click();
    }


}
