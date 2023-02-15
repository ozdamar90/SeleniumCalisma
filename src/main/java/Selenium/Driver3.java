package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Driver3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        Assert.assertEquals(driver.getTitle(),"Swag Labs","Hata: Sayfa Başlığı Yanlış");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();


    }
}
