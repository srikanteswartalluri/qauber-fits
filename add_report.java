package test;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


//creating report as admin user
public class add_report {
    WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {

        Faker faker = new Faker();

        //add_report addReport = new add_report();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://fits.qauber.com/#/page/login");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys("fitway12@mailinator.com");
        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("140407");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        for (int i = 0; i < 10; i++) {
            driver.findElement(By.xpath("//span[@class='ng-binding' and text()='Add Report']")).click();

            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/div[2]/fieldset/div[2]/div/div/label")).click();
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/div[2]/ul/li/a")).click();
            String Lastname = new Faker().name().lastName();
            String Firstname = new Faker().name().firstName();
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/div[3]/fieldset/div[2]/div[1]/div/div/input")).sendKeys(Lastname);
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/div[3]/fieldset/div[2]/div[2]/div/div/input")).sendKeys(Firstname);
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/div[3]/ul/li[2]/a")).click();
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/div[4]/ul/li[2]/a")).click();
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/div[5]/ul/li[2]/a")).click();
            String StopInfo = new Faker().address().streetAddress();
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/div[6]/fieldset[2]/div[2]/div/div/div/input")).sendKeys(StopInfo);

            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/div[6]/ul/li[2]/a")).click();
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/div[7]/ul/li[2]/a")).click();
            driver.findElement(By.xpath("//a[@ng-click='wizard.go(8)']")).click();
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[2]/button[1]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[2]/section/div/div[3]/div[2]/table/tbody/tr[1]/td/div/div/div[2]/div[5]/a[1]")).click();
            Thread.sleep(5000);
            String report = driver.findElement(By.xpath("//div[@id='reportBody']")).getText();
            Boolean checkstatus = false;
            if (report.contains(Firstname)) {

                checkstatus = true;

                Assert.assertTrue(checkstatus);
                System.out.println("The firstname that is entered matches with firstname in report body");
            }
        }
    }
}



