package codersguru;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindMentorAsLoggedUserTest {
    @When("^I log in as \"([^\"]*)\" user with password \"([^\"]*)\"$")
    public void iLogInAsUserWithPassword(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I pick from the dropdown \"([^\"]*)\" and click find mentor$")
    public void iPickFromTheDropdownAndClickFindMentor(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I pick mentor (\\d+) on the list$")
    public void iPickMentorOnTheList(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter problem description as \"([^\"]*)\"$")
    public void iEnterProblemDescriptionAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I pick first possible date and time and go to payment$")
    public void iPickFirstPossibleDateAndTimeAndGoToPayment() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I pick credit card payment$")
    public void iPickCreditCardPayment() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^provide CC data as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and click pay$")
    public void provideCCDataAsAndClickPay(String arg0, String arg1, String arg2, String arg3, String arg4) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^payment should be rejected$")
    public void paymentShouldBeRejected() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
