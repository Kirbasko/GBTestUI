package org.example.l6;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainMenuBlock extends BasePage {
    public MainMenuBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='title-search-input']")
    private WebElement searchInput;

    public SearchPage clickSearch() {
        searchInput.sendKeys("Черный чай", Keys.RETURN);
        return new SearchPage(driver);
    }
}
