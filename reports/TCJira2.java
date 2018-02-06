package com.samplelearning;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TCJira2 {

    public static class Selecting_checkbox {
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://fits.qauber.com/#/page/login");

            Thread.sleep(3000);

            driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys("nataataman1@gmail.com");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("mknjbh555");
            driver.findElement(By.xpath("//html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[2]/aside[1]/div/nav/ul/li[2]/a/span")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[2]/section/div/h3/button")).click();
            Thread.sleep(3000);
            //entity name
            //faker
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[1]/div[1]/div/input")).sendKeys(new Faker().name().firstName());
            //phone field
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[1]/div[2]/div/input")).sendKeys("4085646534");
            //email field
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[1]/div[3]/div/input")).sendKeys("partymaker@gmail.com");
            //country
            Select select = new Select(driver.findElement(By.xpath("//select[@name='country']")));
            select.selectByVisibleText("Italy");
            //address
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[2]/div[1]/div[3]/input")).sendKeys("123 Monroe st");
            //city
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[2]/div[1]/div[5]/input")).sendKeys("Roma");
            //state
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[2]/div[1]/div[6]/input")).sendKeys("Mamba");
            //zipcode
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[2]/div[1]/div[7]/input")).sendKeys("95123");
            //next step button
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/button[2]/span[1]")).click();
            Thread.sleep(300);
            //email
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[2]/form/div/div/input")).sendKeys("natalia_b80@yahoo.com");
            Thread.sleep(3000);
            //next step button
            driver.findElement(By.xpath("//div[@class='panel-footer text-right']//button/span[text()='Next step']")).click();
            Thread.sleep(3000);
            //invite user cinfirm button
            driver.findElement(By.xpath("//button[@ng-click='confirm()']")).click();
            //admin email
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[3]/form/div/div/input")).sendKeys("fofuzu@wmail.club");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[@class='panel-footer text-right']//button/span[text()='Next step']")).click();
            Thread.sleep(3000);
            //invite user cinform button
            driver.findElement(By.xpath("//*[@id=\"ngdialog2\"]/div[2]/div/button")).click();
            Thread.sleep(3000);
            //next step
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/button[2]/span[1]")).click();
            //click on Log in with PayPal
            driver.findElement(By.xpath("//*[@id=\"loadLogin\"]")).click();
            //log into sandboxPayPal account
            driver.findElement(By.xpath("//*[@id=\"login_email\"]")).sendKeys("fofuzu@wmail.club");
            //password
            driver.findElement(By.xpath("//*[@id=\"login_password\"]")).sendKeys("mknjbh555");
            //submit button
            driver.findElement(By.xpath("//*[@id=\"submitLogin\"]")).click();
            Thread.sleep(3000);
            //agree and continue button
            driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();




        }
    }
}