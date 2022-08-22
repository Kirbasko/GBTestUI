package org.example.l8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class TeaPage{
    private SelenideElement addToBasket = $(By.xpath("//a[@class='add_basket btn btn-default']"));

    private SelenideElement nameTea = $(By.xpath("//h1[.='Ассам №17 чай черный Индия 50 гр.']"));

    @Step("Добавление товара в корзину")
    public SuccessAdd clickAddToBasket() {
        addToBasket.click();
        return page(SuccessAdd.class);
    }
}
