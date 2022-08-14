package org.example.l6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
        driver.quit();
    }

}
