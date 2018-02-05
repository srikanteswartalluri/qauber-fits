package Fits;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class WF89 {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private String pageUrl = "http://fits.qauber.com/#/page/login";
    private String expectedTitle = "FITS - FITS Web Application";
    private String actualTitle = "";
    private String login = "asads@amail.club";
    private String password = "qwery123";

    private By loginField = By.id("exampleInputEmail1");
    private By passwordField = By.id("exampleInputPassword1");
    private By loginBtn = By.cssSelector("button[type = 'submit']");

    private By mainHeader = By.xpath("//h3[contains(text(),  'Reports')]");
    private By reportHeader = By.xpath("//h3[contains(text(),  'Field Interview Card')]");


    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 5);
        
        System.out.println("Verify that AU can view the report");

        driver.get(pageUrl);

        System.out.println("Navigate to Web Page");


        driver.findElement(loginField).sendKeys(login);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(passwordField).sendKeys(Keys.ENTER);

        System.out.println("Log in with valid credential");


    }

    @Test
    public void test() throws Exception {

        driver.findElement(mainHeader).click();

        System.out.println("Click on the \"Report\" located in the left sidebar on the AU page");


        System.out.println("AU should be redirected to the Report page.");

        TakesScreenshot ts =(TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./Screenshots/fitsWF89.png"));

        System.out.println("Screenshot taken");

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
