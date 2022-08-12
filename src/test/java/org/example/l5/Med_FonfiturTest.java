package org.example.l5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Med_FonfiturTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    private final static String MED_KONFITUR_BASE_URL = "https://www.med-konfitur.ru/";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupBrowser() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        driver.get(MED_KONFITUR_BASE_URL);
        /*
        Cookie cookie = new Cookie("PHPSESSID", "e457u97l2omen8tuovk2tba0ul");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();
         */
    }

    @Test
    void searchBrendLiterB(){
        actions.moveToElement(driver.findElement(By.xpath("//div[@class='header-secmenu hom']/a[@href='/catalog/proizvoditeli/']")))
                .build()
                .perform();
        driver.findElement(By.xpath("//div[@class='sec-brands-selectors-flex']/ul/li[.='B']")).click();
        driver.findElement(By.xpath("//a[.='Bionova']")).click();

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                driver.findElement(By.xpath("//div[@class='product-bl']/a[@href='/catalog/eritrit-dinnii-sahar-bionova-200-gr-.html']")));
        Assertions.assertEquals
                (driver.findElement(By.xpath("//div[@class='product-bl']/a[@href='/catalog/steviya-bionova-naturalnii-zamenitel-sahara-150-tabletok.html']")).isDisplayed(), true);
    }
    @Test
    void basketProduct() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                driver.findElement(By.xpath("//div[@class='sec-title']/span[.='Хиты продаж']")));
        List<WebElement> hitsList = driver.findElements(
                By.xpath("//div[@class='product-bl']"));
        hitsList.get(0).click();
        Thread.sleep(5000);

    }
    @Test
    void CheckBasket() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='title-search-input']")).sendKeys("Черный чай", Keys.RETURN);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[@id='bx_3966226736_66668']")));
        List<WebElement> hitsList = driver.findElements(
                By.xpath("//div[@class='product-bl']"));
        hitsList.get(0).click();

        WebElement nameTea = driver.findElement(By.xpath("//h1[.='Ассам №17 чай черный Индия 50 гр.']"));
        driver.findElement(By.xpath("//a[@class='add_basket btn btn-default']")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart-fluid-top']")));

        WebElement nameTeaBasket = driver.findElement(By.xpath("//a[.='Ассам №17 чай черный Индия 50 гр.']"));

        //Assertions.assertEquals(nameTea, nameTeaBasket);

    }

    @AfterEach
    void quitBrowser() {
        driver.quit();
    }
}
