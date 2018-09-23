package codersguru;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.remote.session.FirefoxFilter;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FindMentorAsLoggedUserTest extends FirefoxTest {
    @When("^I log in as \"([^\"]*)\" user with password \"([^\"]*)\"$")
    public void iLogInAsUserWithPassword(String arg0, String arg1) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAsUserWithPassword(arg0, arg1);
    }

    @And("^I pick from the dropdown \"([^\"]*)\" and click find mentor$")
    public void iPickFromTheDropdownAndClickFindMentor(String arg0) {
        //SelectMentorTypePage selectTopicPage = new SelectMentorTypePage(driver);
        //selectTopicPage.selectType(arg0);

        // DIRTY HACK: let's go to url directly
        driver.get("https://men-men-s-01.codersguru.pl/search?tag="+arg0);
    }

    @And("^I pick mentor (\\d+) on the list$")
    public void iPickMentorOnTheList(int arg0) {
        MentorPage mentorPage = new MentorPage(driver);
        mentorPage.selectFirstMentor();
    }

    @And("^I enter problem description as \"([^\"]*)\"$")
    public void iEnterProblemDescriptionAs(String arg0) {
        MentorPage mentorPage = new MentorPage(driver);
        mentorPage.enterProblem(arg0);
    }

    @And("^I pick first possible date and time and go to payment$")
    public void iPickFirstPossibleDateAndTimeAndGoToPayment() {
        MentorPage mentorPage = new MentorPage(driver);
        mentorPage.pickDateAndGoToPayment();
    }

    @And("^I pick credit card payment$")
    public void iPickCreditCardPayment() {
    }

    @And("^provide CC data as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and click pay$")
    public void provideCCDataAsAndClickPay(String arg0, String arg1, String arg2, String arg3, String arg4) throws Throwable {
    }

    @Then("^payment should be rejected$")
    public void paymentShouldBeRejected() {
    }

    @Given("^I open login coder guru website$")
    public void iOpenLoginCoderGuruWebsite() {
        FirefoxTest.setUp();
        driver.get("https://men-men-s-01.codersguru.pl/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
