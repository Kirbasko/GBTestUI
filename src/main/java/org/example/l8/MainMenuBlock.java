package org.example.l8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainMenuBlock{

    private SelenideElement searchInput = $(By.xpath("//input[@id='title-search-input']"));

    @Step("Введение запроса в поисковую строку")
    public SearchPage clickSearch() {
        searchInput.sendKeys("Черный чай", Keys.RETURN);
        return page(SearchPage.class);
    }
}
