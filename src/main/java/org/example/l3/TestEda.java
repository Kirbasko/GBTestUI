package org.example.l3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestEda {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.med-konfitur.ru/");

        Cookie cookie = new Cookie("PHPSESSID", "mst9q4j7ji3th15v4vbdpfrpbu");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();

        driver.findElement(By.xpath("//input[@id='title-search-input']")).sendKeys("зефир", Keys.RETURN);

        driver.findElement(By.xpath("//*[@id='bx_3966226736_5433226']/div/div[3]/div/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"header_vue\"]/div[6]/button/svg")).click();


        Thread.sleep(5000);
        driver.quit();

    }
}
