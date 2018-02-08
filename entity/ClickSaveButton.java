package Wave_FITS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClickSaveButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Natalia\\Documents\\selenium-java-3.8.1\\chromedriver_win32\\chromedriver.exe");
        WebDriver wave = new ChromeDriver();
        wave.get("http://fits.qauber.com/#/page/login");
        wave.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        wave.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("nkalinina73@live.com"); 
       
        wave.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("qwe123"); 
        wave.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
        Thread.sleep(2000);
        wave.findElement(By.xpath("//button[@class='btn btn-block btn-primary mt-lg']")).click();
        
        wave.findElement(By.xpath("//a/em[@class='icon-user']")).click();
        wave.findElement(By.xpath("//button/em[@class='fa fa-sitemap']")).click();
        
        Thread.sleep(2000);
        Select select = new Select(wave.findElement(By.xpath("//*[@id=\"ngdialog1\"]/div[2]/div[1]/div/table/tbody/tr[2]/td[2]/select")));
        select.selectByVisibleText("Admin");
        
        Thread.sleep(2000);
        wave.findElement(By.xpath("//*[@id=\"ngdialog1\"]/div[2]/div[1]/div/table/tbody/tr[2]/td[3]/button[1]/i")).click();

	}

}
