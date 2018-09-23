package codersguru.pages;

import codersguru.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectMentorTypePage extends BasePage {
    @FindBy(xpath="/html/body/section[3]/div/div[1]/div/p[1]")
    private WebElement topicTextBox;
    @FindBy(xpath="/html/body/section[3]/div/div[1]/input")
    private WebElement searchButton;
    @FindBy(xpath="/html/body/section[3]/div/div[1]/div/ul/li[8]")
    private WebElement gitValue;



    public SelectMentorTypePage(WebDriver driver) {
        super(driver);
    }

    public void selectType(String topic){
        topicTextBox.click();
        gitValue.click();
        searchButton.click();
    }


}
