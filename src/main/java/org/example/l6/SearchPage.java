package org.example.l6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class='product-bl']")
    private List<WebElement> hitsList;

    @Step("Выбор первого элемента поискового запроса")
    public TeaPage selectProduct(){
        hitsList.get(0).click();
        return new TeaPage(driver);
    }
}
