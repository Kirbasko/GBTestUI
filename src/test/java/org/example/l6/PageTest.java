package org.example.l6;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class PageTest {
    WebDriver driver;

    @BeforeAll
    static void registerDrive(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
        driver.get("https://www.med-konfitur.ru/");
    }
    @Test
    @Feature("Добавление товара в корзину")
    void TeaCardAdd() throws InterruptedException {
        new MainPage(driver).clickInButton()
                .login("oev90468@cdfaq.com", "q4Ye4A")
                .mainMenuBlock.clickSearch()
                .selectProduct()
                .clickAddToBasket()
                .checkResult();
    }

    @AfterEach
    void killBrowser() {
        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
        for (LogEntry log: logEntries) {
            Allure.addAttachment("Лог браузера", log.getMessage());
        }

        driver.quit();
    }

}
