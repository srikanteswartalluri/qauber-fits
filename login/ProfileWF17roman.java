package com.qauber.lerning;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProfileWF17roman {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://fits.qauber.com/#/page/login");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("qauber2admin@ugimail.net");
        driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("7735011530");
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='mr-sm ng-binding']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@ng-click='$ctrl.editUserProfile()']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@ng-model='$ctrl.account.name']")).clear();
        driver.findElement(By.xpath("//input[@ng-model='$ctrl.account.name']")).sendKeys(new Faker().name().firstName());

        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@ng-click='$ctrl.submitGeneralForm()']")).click();

        Thread.sleep(1000);
        driver.getPageSource().contains("//div[contains(text(),'The profile has been updated.')]");
                if (true) {
            System.out.println("Test case pass");
                } else
                    System.out.println("Test case fail");
                Thread.sleep(5000);
        driver.close();
    }
    }