package codersguru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email) {
        this.emailTextBox.clear();
        this.emailTextBox.sendKeys(email);
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

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            temp.click();
            assertTrue(driver.getTitle().contains("Coders"));
            driver.navigate().back();
        }
    }

}
