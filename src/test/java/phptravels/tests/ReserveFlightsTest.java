package phptravels.tests;

import common.FirefoxTest;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import phptravels.pages.PickFlightPage;

import java.util.concurrent.TimeUnit;

public class ReserveFlightsTest extends FirefoxTest {
    @Given("^I am on phptravels website$")
    public void iAmOnPhptravelsWebsite(){
        FirefoxTest.setUp();
        driver.get("https://www.phptravels.net/flights");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @When("^I reserve two way flights from \"([^\"]*)\" to \"([^\"]*)\" on date \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iReserveTwoWayFlightsFromToOnDateAnd(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        PickFlightPage pickFlightPage = new PickFlightPage(driver);
        pickFlightPage.enterDepartureAndArrival(arg0, arg1);
    }

    @And("^I pick first available flight$")
    public void iPickFirstAvailableFlight() throws Throwable {
    }

    @And("^I book as a guest with \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iBookAsAGuestWith(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
    }

    @Then("^I should see prepared invoice$")
    public void iShouldSeePreparedInvoice() {
    }
}
