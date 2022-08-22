package org.example.l6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeaPage extends BasePage{
    public TeaPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@class='add_basket btn btn-default']")
    private WebElement addToBasket;

    @FindBy(xpath = "//h1[.='Ассам №17 чай черный Индия 50 гр.']")
    private WebElement nameTea;

    @Step("Добавление товара в корзину")
    public SuccessAdd clickAddToBasket() {
        addToBasket.click();
        return new SuccessAdd(driver);
    }
}
