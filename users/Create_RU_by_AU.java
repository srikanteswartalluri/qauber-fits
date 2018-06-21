package com.samplelearning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Create_RU_by_AU {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Applications/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://fits.qauber.com/#/page/login");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("rerere12@mailinator.com");
        driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("121212");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/form/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Users']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@ng-click='openInviteForm()']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("tyyt@mailinator.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ngdialog1\"]/div[2]/div[1]/form/button[1]")).click();
        Thread.sleep(3000);

        driver.switchTo().defaultContent();

      //  for(String window1 : driver.getWindowHandles()) {
       //    driver.switchTo().window(window1);
       //    System.out.println(window1);
       // }

        ArrayList<String> tabs = new ArrayList <String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.switchTo().window(tabs.get(0));


    driver.get ("https://www.mailinator.com/");


    }
}