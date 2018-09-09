package codersguru;

import org.junit.Test;


public class AllLinkTest extends BaseTest {
    @Test
    public void testEnteringEmail() {
        driver.get("https://men-men-s-01.codersguru.pl/");

        HomePage homePage = new HomePage(driver);
        homePage.clickOnAllLinks();
    }
}
