package QAuber.Fits;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class Fits1stsprint {
	
private WebDriver driver;
	@Before
	
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("http://fits.qauber.com/#/page/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys(CretentialsFits.email());
		driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys(CretentialsFits.password());
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/form/button")).click();
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(25000);
		driver.close();
	}

	
	@Test
	public void entiticreating()  throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/aside[1]/div/nav/ul/li[2]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/section/div/h3/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[1]/div[1]/div/input")).sendKeys(new Faker().name().lastName());
	new	Select (driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[2]/div[1]/div[2]/select"))).selectByVisibleText("Germany");
	    driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[1]/div[2]/div/input")).sendKeys("9383736532");
	    driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[1]/div[3]/div/input")).sendKeys("kalyfuz@cmail.club");
	    driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[2]/div[1]/div[3]/input")).sendKeys("4327 s 56st apt Q");
	    driver.findElement(By.name("city")).sendKeys("Chicago");
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scroll(0,2000)");
	    Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[1]/form/div[2]/div[1]/div[6]/input")).sendKeys("Illinois");
	    driver.findElement(By.name("zip")).sendKeys("93098");
	    driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div[2]/form/div/div/input")).sendKeys("kalyfuz@cmail.club");
        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/button[2]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"ngdialog1\"]/div[2]/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/button[2]/span[2]/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/button[2]/span[2]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span/input[@value='Pay with my PayPal account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"login_email\"]")).sendKeys(CretentialsFits.email());
		driver.findElement(By.xpath("//*[@id=\"login_password\"]")).sendKeys(CretentialsFits.paypassword());
		driver.findElement(By.xpath("//*[@id=\"submitLogin\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
	}
	@Test
      public void deleteentiti() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/aside[1]/div/nav/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div/div/table/tbody/tr[5]/td[4]/button[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ngdialog1\"]/div[2]/div/button[1]")).click();
		
		
	}
	@Test
	public void SAUreg() throws InterruptedException, AWTException {
		driver.findElement(By.xpath("//div/a[@class='btn btn-block btn-default' and text()='Register Now']")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@name='account_name']")).sendKeys("Simion");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@name='account_email']")).sendKeys("dynohfhto@amail.club");
		  
		  driver.findElement(By.xpath("//*[@id=\"id-password\"]")).sendKeys("madalina26");
		  
		  driver.findElement(By.xpath("//input[@name='account_password_confirm']")).sendKeys("madalina26");
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[2]/form/button")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[2]/div[1]/div[1]/div/input")).sendKeys(new Faker().name().name());
		  
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[2]/div[1]/div[2]/div/input")).sendKeys("21897564");
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[2]/div[1]/div[3]/div/input")).sendKeys("dyxcnoto@amail.club");
		
		  new Select(driver.findElement(By.name("country"))).selectByVisibleText("United States");
		  
	  driver.findElement(By.name("address1")).sendKeys("2154 64th st apt a");
	  driver.findElement(By.name("city")).sendKeys("Tacoma");
	  new Select(  driver.findElement(By.name("state"))).selectByVisibleText("Washington");
	  driver.findElement(By.name("zip")).sendKeys("98409");
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scroll(0,2000)");
	  
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"registerConfirm\"]")).click();
		
	}
	

}
