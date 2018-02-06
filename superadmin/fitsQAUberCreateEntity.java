package samplelearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.concurrent.TimeUnit;

import com.github.javafaker.Faker;


public class fitsQAUberCreateEntity {


    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "/Users/suchismitasethi/Downloads/chromedriver");
        WebDriver dr = new ChromeDriver();

        Faker faker = new Faker();

        dr.get("http://fits.qauber.com/#/page/login");

        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        WebElement emailid = dr.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]"));
        emailid.sendKeys("juliea.suchi@gmail.com");
        WebElement password = dr.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]"));
        password.sendKeys("omsairam09");
        dr.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        Thread.sleep(5000);
// Log-In
        WebElement LogBn = dr.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/form/button"));
        LogBn.click();

//Navigate Entities
        WebElement Entities = dr.findElement(By.xpath("/html/body/div[2]/aside[1]/div/nav/ul/li[2]/a/span"));
        Entities.click();

        for (int i = 0; i < 10; i++)
        {
//Add Entity
            WebElement AddEntity = dr.findElement(By.xpath("/html/body/div[2]/section/div/h3/button"));
            AddEntity.click();
//Create Entity
            WebElement Entityname = dr.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[1]/div[1]/div/input"));
            String Ename = faker.name().firstName();
            Entityname.sendKeys(Ename);
            WebElement Phone = dr.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[1]/div[2]/div/input"));
            Phone.sendKeys("44444444");
            WebElement EMail = dr.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[1]/div[3]/div/input"));
            EMail.sendKeys("xxxsssx@gmail.com");
            //WebElement EntityLogo = dr.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/button[1]/span[1]"));
            WebElement Country = dr.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[2]/div[1]/div[2]/select"));
            Country.click();
            dr.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            Country.submit();
            Country.sendKeys("United States");
            WebElement Address1 = dr.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[2]/div[1]/div[3]/input"));
            Address1.sendKeys("XXXXXX");
            WebElement City = dr.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[2]/div[1]/div[5]/input"));
            City.sendKeys("XXXXXX");
            Country.sendKeys("United States");
            WebElement State = dr.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[2]/div[1]/div[6]/select"));
            State.sendKeys("California");
            WebElement PostalCode = dr.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[2]/div[1]/div[7]/input"));
            PostalCode.sendKeys("43524");
            WebElement NextStep = dr.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/button[2]/span[1]"));
            NextStep.click();

            WebElement NextStep2 = dr.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/button[2]"));
            NextStep2.click();

            WebElement NextStep3 = dr.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/button[2]"));
            NextStep3.click();
//Slider
            //    /html/body/div[2]/section/div/div/div[1]/div[4]/div/div/div[1]/div[2]
            //    /html/body/div[2]/section/div/div/div[1]/div[4]/div/div/div[1]/div[3]
            //    /html/body/div[2]/section/div/div/div[1]/div[4]/div/div/div[1]/div[4]

            WebElement Slider = dr.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[4]/div/div/div[1]/div[3]"));
            Actions actionsslide = new Actions(dr);
           // actionsslide.moveToElement(Slider);
           // actionsslide.dragAndDropBy(Slider,50,50);

            actionsslide.clickAndHold(Slider).moveByOffset(50, 50).release().build().perform();
            //Thread.sleep(500);


            WebElement NextStep4 = dr.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/button[2]"));
            NextStep4.click();

            dr.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            Thread.sleep(500);

// Paypal Login
            System.out.println(dr.getTitle()+i);
            if (i==0) {
                WebElement PayPalSel = dr.findElement(By.xpath(" //*[@id=\"loadLogin\"]"));
                PayPalSel.click();


                dr.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
                Thread.sleep(1000);


                WebElement PayPalUser = dr.findElement(By.xpath("//*[@id=\"login_email\"]"));
                PayPalUser.sendKeys("juliea_robort-buyer@yahoo.co.in");

            }


            WebElement PayPalPass = dr.findElement(By.xpath("//*[@id=\"login_password\"]"));//*[@id="login_password"]
            PayPalPass.sendKeys("omsairam09");

            WebElement PayPalLogBn = dr.findElement(By.xpath("//*[@id=\"submitLogin\"]"));
            PayPalLogBn.click();

            dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            Thread.sleep(5000);


            WebElement PayPalAgCn = dr.findElement(By.xpath("//*[@id=\"continue\"]"));
            PayPalAgCn.click();

            dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            Thread.sleep(5000);

        }

    }

}
