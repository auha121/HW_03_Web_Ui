package ru.gb.lesson;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class CaseAddChooseProduct {
    public static void main( String[] args ) throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--blink-settings=imagesEnabled=false");

        WebDriver webDriver = WebDriverManager.chromedriver().capabilities(chromeOptions).create();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        webDriver.get("https://fix-price.ru/");
        //webDriver.manage().window().setSize(new Dimension(1280,800));
        webDriver.manage().window().maximize();

        webDriver.findElement(By.xpath("//div[@href='#catalog-dropdown']")).click();
        webDriver.findElement(By.xpath("//a[@href='/catalog/dlya-doma/']")).click();
        webDriver.findElement(By.xpath("//span[@data-id='264472']")).click();
        webDriver.findElement(By.xpath("//a[contains(text(),'Добавить в корзину')]")).click();
        webDriver.findElement(By.xpath("//a[contains(text(),'Перейти в корзину')]")).click();

        Thread.sleep(5000);
        webDriver.quit();
    }
}
