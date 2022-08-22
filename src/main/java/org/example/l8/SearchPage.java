package org.example.l8;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;

public class SearchPage{

    private ElementsCollection hitsList = $$(By.xpath("//div[@class='product-bl']"));

    @Step("Выбор первого элемента поискового запроса")
    public TeaPage selectProduct(){
        hitsList.get(0).click();
        return page(TeaPage.class);
    }
}
