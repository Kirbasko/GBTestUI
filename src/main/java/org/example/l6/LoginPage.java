package org.example.l6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    private WebElement userLogin;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    private WebElement userPassword;

    @FindBy(xpath = "//button[@class='btn btn-default fix-mob form-btn form-btn-enter']")
    private WebElement signInButton;

    public MainPage login(String login, String password) {
        userLogin.sendKeys(login);
        userPassword.sendKeys(password);
        signInButton.click();
        return new MainPage(driver);
    }
}
