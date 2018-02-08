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


public class WF176 {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private String pageUrl = "http://fits.qauber.com/#/page/login";
    private String expectedTitle = "FITS - FITS Web Application";
    private String actualTitle = "";
    private String login = "asads@amail.club";
    private String password = "qwery123";
    private String currentpwd = "qwery123";
    private String newPwd = "simon123";
    private String newRepeat = "simon123";
    private String expectedText = "This field is required";
    private String actualText = "";


    private By loginField = By.id("exampleInputEmail1");
    private By passwordField = By.id("exampleInputPassword1");
    private By loginBtn = By.cssSelector("button[type = 'submit']");

    private By mainHeader = By.xpath("//h3[contains(text(),  'Reports')]");
    private By userIcon = By.xpath("//span[@class='mr-sm ng-binding']");
    private By editProfile = By.xpath("//button[contains(text(),  'Edit Profile')]");
    private By currentfield = By.name("current_password");
    private By newField = By.name("new_password");
    private By newrepeatfield = By.name("password_confirm");
    private By clickchange = By.xpath("/html/body/div[2]/section/div/div/div[2]/form[2]/div/div[3]/button");


    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 5);
        
        System.out.println("Verify that user can't change password when 'Repeat new password' field is blank");

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
        System.out.println("AU should be redirected to Homepage");

        driver.findElement(userIcon).click();
        System.out.println("Click on the Username in the right upper corner");
        Thread.sleep(2000);
        driver.findElement(editProfile).click();
        System.out.println("Click on the \"Edit Profile\" button");

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "A user should be redirected to Profile page" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("A user should be redirected to Profile page");
        } else {
            System.out.println("Test Failed");
        }

        System.out.println("In the Password Change section ");

        System.out.println("Type current password in the \"Current password\" field");
        driver.findElement(currentfield).sendKeys(currentpwd);

        System.out.println("Type new password in the \"New password\" field");
        driver.findElement(newField).sendKeys(newPwd);

        System.out.println("Leave \"Repeat new password\" field blank");

        System.out.println("Press button \"Change\"");
        driver.findElement(clickchange).click();
        Thread.sleep(2000);
        actualText = driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/form[2]/div/div[2]/fieldset[3]/div/div/span[1]")).getText();

        if (actualText.contentEquals(expectedText)){
            System.out.println("Error message should display \"This field is required\"");
        } else {
            System.out.println("Test Failed");
        }
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Error message should display \"This field is required\" or "Failed"
         */

        TakesScreenshot ts =(TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./Screenshots/fitsWF176.png"));

        System.out.println("Screenshot taken");


    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
