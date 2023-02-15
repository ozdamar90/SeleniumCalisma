package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver1 {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();



        WebDriver driver = new ChromeDriver();


    driver.get("https://www.google.com");

    driver.getTitle();
    driver.getCurrentUrl();


    //driver.close();//Aktif olanı kapatır.
    driver.quit();//tüm chrome'u kapatır.


    }
}
