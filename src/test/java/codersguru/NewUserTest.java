package codersguru;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class NewUserTest extends FirefoxTest {
    String name;


    @Given("^I open coder guru website$")
    public void iOpenCoderGuruWebsite(){
        FirefoxTest.setUp();
        driver.get("https://men-men-s-01.codersguru.pl");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^I go to registration page$")
    public void iGoToRegistrationPage() {
        HomePage homePage = new HomePage(driver);
        homePage.goToRegistrationPage();
    }

    @And("^I select private user$")
    public void iSelectPrivateUser() {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.selectPersonAccount();
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String arg0) throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.typeEmail(arg0);
    }

    @And("^I enter name \"([^\"]*)\" surname \"([^\"]*)\"$")
    public void iEnterNameSurname(String arg0, String arg1) throws Throwable {
        name = arg0;

        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.typeNameAndSurname(arg0, arg1);
    }

    @And("^I provide password \"([^\"]*)\"$")
    public void iProvidePassword(String arg0) throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.typePassword(arg0);
    }

    @And("^I provide address \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iProvideAddress(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.typeAdressData(arg0, arg1, arg2, arg3);

    }

    @And("^I check that I have read terms$")
    public void iCheckThatIHaveReadTerms() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.checkTerms();
    }

    @And("^I click registration button$")
    public void iClickRegistrationButton() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.clickRegisterButton();
    }

    @Then("^User should be successfully created$")
    public void userShouldBeSuccessfullyCreated() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(driver);

        String userName = registrationPage.readUserName();

        assertEquals("https://men-men-s-01.codersguru.pl/register/confirmed", driver.getCurrentUrl());
        assertEquals(name, userName);
    }

    @And("^I select company user$")
    public void iSelectCompanyUser() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.selectCompanyAccount();
    }

    @And("^I enter company name \"([^\"]*)\"$")
    public void iEnterCompanyName(String arg0) throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.typeCompanyName(arg0);
    }

    @And("^I enter generated NIP$")
    public void iEnterGeneratedNIP() throws Throwable {

        WebDriver helpDriver = new FirefoxDriver();
        helpDriver.get("http://generatory.it/");
        String nip = helpDriver.findElement(By.id("nipBox")).getText();
        helpDriver.close();

        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.typeNIP(nip);
    }
}
