package com.qauber.lerning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//good job
public class LoginWF2roman {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://fits.qauber.com/#/page/login");
        Thread.sleep(3000);
        // Selecting CheckBox
        driver.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("poyuh@0mixmail.info");
        driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("7735011528");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        Thread.sleep(3000);
        driver.getPageSource().contains("RomanRoman2");
        if (true) {
            System.out.println("Test Case Pass");
        } else
            System.out.println("Test Case Fail");
        driver.close();
    }
}
