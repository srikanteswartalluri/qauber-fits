package com.samplelearning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;


public class Reset_Password_SAU {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Applications/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://fits.qauber.com/#/page/login");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@ui-sref='page.recover']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kate1991k@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("//div[@ng-show='recoveryCtrl.sccMsg']")).getText());
        Thread.sleep((3000));

        ((JavascriptExecutor)driver).executeScript("window.open();");
        ArrayList<String> tabs = new ArrayList <String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get ("https://mail.google.com/mail/u/0/#inbox");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kate1991k@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("345247");//not correct password
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\":3c\"]/div/div/div/span[2]")).click();
        Thread.sleep(3000);
       // driver.findElement(By.xpath("//html//div[@id=':mu']//td[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("http://fits.qauber.com/#/page/change-password")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='id-password']")).sendKeys("212121");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='password' and @name='password_confirm']")).sendKeys("212121");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();



    }
}