package org.example.l8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    public MainMenuBlock mainMenuBlock;

    private SelenideElement signInButton = $(By.xpath("//div[@class='hbr-el hbr-el-entrance']"));

    @Step("Нажатие кнопки Войти")
    public LoginPage clickInButton() {
      signInButton.click();
      return page(LoginPage.class);
    }
}
