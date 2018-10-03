package phptravels.pages;

import common.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalDetailsPage extends BasePage {
    @FindBy(id="s2id_autogen1")
    private WebElement dropDownPicker;
    @FindBy(xpath="/html/body/div[10]/div/input")
    private WebElement countryTextBox;
    @FindBy(name="firstname")
    private WebElement firstname;
    @FindBy(name="lastname")
    private WebElement lastname;
    @FindBy(name="email")
    private WebElement email;
    @FindBy(name="confirmemail")
    private WebElement confirmemail;
    @FindBy(name="phone")
    private WebElement phone;
    @FindBy(name="address")
    private WebElement address;
    @FindBy(name="guest")
    private WebElement confirmButton;


    public PersonalDetailsPage(WebDriver driver){
        super(driver);
    }

    public void enterPersonalDetails(String firstname, String lastname, String email, String phone, String address, String country) {
        this.firstname.sendKeys(firstname);
        this.lastname.sendKeys(lastname);
        this.email.sendKeys(email);
        this.confirmemail.sendKeys(email);
        this.phone.sendKeys(phone);
        this.address.sendKeys(address);

        dropDownPicker.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        countryTextBox.sendKeys(country);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        countryTextBox.sendKeys(Keys.ENTER);
        confirmButton.click();

    }
}
