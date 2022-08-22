package org.example.l6;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuccessAdd extends BasePage{
    public SuccessAdd(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[.='Ассам №17 чай черный Индия 50 гр.']")
    private WebElement nameTeaBasket;

    private final String windowBasket = "//div[@class='cart-fluid-top']";
    @FindBy(xpath = windowBasket)
    private WebElement winBasket;

    @FindBy(xpath = "//h1[.='Ассам №17 чай черный Индия 50 гр.']")
    private WebElement nameTeaOnPage;

    @Step("Проверка соответствия выбранного товара и товара в корзине")
    public SuccessAdd checkResult(){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(windowBasket)));
        Assertions.assertEquals(nameTeaOnPage.getText(), nameTeaBasket.getText());
        return this;
    }

}
