package codersguru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    @FindBy(id = "person")
    private WebElement personButtonLink;

    @FindBy(id = "fos_user_registration_form_email")
    private WebElement emailTextBox;

    @FindBy(xpath = "//*[@id=\"registration-main-form\"]/div[2]/span")
    private WebElement emailErrorMessage; //Wprowadzono niepoprawny adres e-mail

    @FindBy(id = "fos_user_registration_form_name")
    private WebElement nameTextBox;

    @FindBy(xpath = "//*[@id=\"registration-main-form\"]/div[3]/span")
    private WebElement nameErrorMessage; //Wprowadzona wartość jest mniejsza niż 2 znaków

    @FindBy(id="fos_user_registration_form_lastname")
    private WebElement surnameTextBox;

    @FindBy(xpath = "//*[@id=\"registration-main-form\"]/div[4]/span")
    private WebElement surnameErrorMessage;;  //Wprowadzona wartość jest mniejsza niż 2 znaków

    @FindBy(id="fos_user_registration_form_plainPassword_first")
    private WebElement passwordTextBox;

    @FindBy(xpath = "//*[@id=\"registration-main-form\"]/div[5]/span")
    private WebElement passwordErrorMessage;  //Wprowadzona wartość jest mniejsza niż 5 znaków

    @FindBy(id="fos_user_registration_form_plainPassword_second")
    private WebElement passwordRepeatTextBox;

    @FindBy(xpath = "*[@id=\"registration-main-form\"]/div[6]/span")  //Wprowadzone wartości nie zostały potwierdzone
    private WebElement passwordRepeatErrorMessage;                    //To pole jest wymagane

    @FindBy(id="form_city")
    private WebElement cityTextBox;

    @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[7]/span")
    private WebElement cityErrorMessage;

    @FindBy(id="form_postal_code")
    private WebElement zipCodeTextBox;

    @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[8]/span[2]") //Zachowaj format 00-000*    [@id="registration-main-form"]/div[8]/span[1] -
    private WebElement zipCodeErrorMessage; //Wprowadzona wartość jest niepoprawna

    @FindBy(id="form_street")
    private WebElement streetTextBox;

    @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[9]/span")
    private WebElement streetErrorMessage;  //Wprowadzona wartość jest mniejsza niż 2 znaków

    @FindBy(id="form_number")
    private WebElement streetNumberTextBox;

    @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[10]/span")
    private WebElement streetNumberErrorMessage;  //To pole jest wymagane

    @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[12]/input")
    private WebElement statuteCheckBox;

    @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[12]/span")
    private WebElement statuteCheckBoxErrorMessage;

    @FindBy(id="register-submit-btn")
    private WebElement registerSubmitBotton;

    @FindBy(id="company")
    private WebElement companyButton;

    @FindBy(id="fos_user_registration_form_nip")
    private WebElement nipTextBox;

    @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[11]/div[2]/span[2]")   /// Wprowadź nip jako ciąg cyfr -- //*[@id="registration-main-form"]/div[11]/div[2]/span[1]
    private WebElement nipErrorMessage; //Wprowadzona wartość jest niepoprawna

    @FindBy(id="user-name")
    private WebElement loggedUserName;

    @FindBy(id="fos_user_registration_form_company_name")
    private WebElement companyName;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void selectPersonAccount(){
        personButtonLink.click();
    }

    public void selectCompanyAccount(){
        companyButton.click();
    }

    public void typeEmail(String email) {
        emailTextBox.clear();
        emailTextBox.sendKeys(email);
    }

    public void typeNameAndSurname(String name, String surname) {
        nameTextBox.clear();
        surnameTextBox.clear();
        nameTextBox.sendKeys(name);
        surnameTextBox.sendKeys(surname);
    }

    public void typePassword(String password){
        passwordTextBox.clear();
        passwordTextBox.sendKeys(password);
        passwordRepeatTextBox.clear();
        passwordRepeatTextBox.sendKeys(password);
    }

    public void typeAdressData(String city, String postCode, String street, String number) {
        cityTextBox.clear();
        cityTextBox.sendKeys(city);
        zipCodeTextBox.clear();
        zipCodeTextBox.sendKeys(postCode);
        streetTextBox.sendKeys(street);
        streetNumberTextBox.sendKeys(number);

    }

    public void checkTerms() {
        statuteCheckBox.click();
    }

    public void clickRegisterButton() {
        registerSubmitBotton.click();
    }

    public String readUserName(){
        return loggedUserName.getText();
    }

    public void typeCompanyName(String company){
        companyName.click();
        companyName.clear();
        companyName.sendKeys(company);
    }

    public void typeNIP(String nip){
        nipTextBox.click();
        nipTextBox.clear();
        nipTextBox.sendKeys(nip);
    }


}
