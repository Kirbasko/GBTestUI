package org.example.l8;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Selenide.$;

public class SuccessAdd{

    private SelenideElement nameTeaBasket = $(By.xpath("//a[.='Ассам №17 чай черный Индия 50 гр.']"));

    private SelenideElement winBasket = $(By.xpath("//div[@class='cart-fluid-top']"));

    private SelenideElement nameTeaOnPage = $(By.xpath("//h1[.='Ассам №17 чай черный Индия 50 гр.']"));

    @Step("Проверка соответствия выбранного товара и товара в корзине")
    public SuccessAdd checkResult(){
        nameTeaBasket.shouldHave(Condition.text("Ассам №17 чай черный Индия 50 гр."));
        return this;
    }

}
