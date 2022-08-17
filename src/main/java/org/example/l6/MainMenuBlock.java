package org.example.l6;

import io.qameta.allure.Step;
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

    @Step("Введение запроса в поисковую строку")
    public SearchPage clickSearch() {
        searchInput.sendKeys("Черный чай", Keys.RETURN);
        return new SearchPage(driver);
    }
}
