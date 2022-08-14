package org.example.l6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
        mainMenuBlock = new MainMenuBlock(driver);
    }

    public MainMenuBlock mainMenuBlock;

    @FindBy(xpath = "//div[@class='hbr-el hbr-el-entrance']")
    private WebElement signInButton;

    public LoginPage clickInButton() {
      signInButton.click();
      return new LoginPage(driver);
    }
}
