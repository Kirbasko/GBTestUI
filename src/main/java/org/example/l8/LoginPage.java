package org.example.l8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage{

    private SelenideElement userLogin = $(By.xpath("//input[@name='USER_LOGIN']"));

    private SelenideElement userPassword = $(By.xpath("//input[@name='USER_PASSWORD']"));

    private SelenideElement signInButton = $(By.xpath("//button[@class='btn btn-default fix-mob form-btn form-btn-enter']"));

    @Step("Логин")
    public MainPage login(String login, String password) {
        userLogin.sendKeys(login);
        userPassword.sendKeys(password);
        signInButton.click();
        return page(MainPage.class);
    }
}
