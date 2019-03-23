import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static utility.TakeScreenshot.takeScreenshot;

public class ExtentReportsExample {
    ExtentReports extent;

    @BeforeClass
    public void reports(){
        extent = new ExtentReports("Reports/report.html", true, NetworkMode.OFFLINE);
    }

    @Test
    public void loginTest() {

        ExtentTest test = extent.startTest("Login test", "To test the functionality of login");

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        test.log(LogStatus.INFO, "browser opened");

        driver.manage().window().maximize();
        test.log(LogStatus.INFO, "browser maximized");

        driver.get("http://billing.scriptinglogic.net");
        test.log(LogStatus.INFO, "URL opened");

        WebElement TxtEmail = driver.findElement(By.name("email"));
        TxtEmail.sendKeys("mail@xyz.com");
        test.log(LogStatus.INFO, "username entered");

        WebElement TxtPass = driver.findElement(By.name("password"));
        TxtPass.sendKeys("password");
        test.log(LogStatus.INFO, "password entered");

        WebElement Clickbutton = driver.findElement(By.name("btn_login"));
        Clickbutton.click();
        test.log(LogStatus.INFO, "Login button clicked");

        extent.endTest(test);
    }
        @Test
        public void openBrowser()
        {
            ExtentTest test = extent.startTest("Login test", "To test the functionality of logout");
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            test.log(LogStatus.INFO, "browser opened");

            driver.manage().window().maximize();
            test.log(LogStatus.INFO, "browser maximized");

            driver.get("http://billing.scriptinglogic.net");
            test.log(LogStatus.INFO, "URL opened");

            WebElement TxtEmail = driver.findElement(By.name("email"));
            TxtEmail.sendKeys("amolujagare@gmail.com");
            test.log(LogStatus.INFO, "username entered");

            WebElement TxtPass = driver.findElement(By.name("password"));
            TxtPass.sendKeys("admin123");
            test.log(LogStatus.INFO, "password entered");

            WebElement Clickbutton = driver.findElement(By.name("btn_login"));
            Clickbutton.click();
            test.log(LogStatus.INFO, "Login button clicked");

            WebElement clickLogout=driver.findElement(By.xpath("//i[@class='fa fa-power-off']"));
            clickLogout.click();
            test.log(LogStatus.INFO, "Logout button is clicked");

            extent.endTest(test);
        }

        @Test
        public void clickDashboard() throws IOException {

            ExtentTest test = extent.startTest("Login test", "To test the functionality of logout");
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            test.log(LogStatus.INFO, "browser opened");

            driver.manage().window().maximize();
            test.log(LogStatus.INFO, "browser maximized");

            driver.get("http://billing.scriptinglogic.net");
            test.log(LogStatus.INFO, "URL opened");

            WebElement TxtEmail = driver.findElement(By.name("email"));
            TxtEmail.sendKeys("amolujagare@gmail.com");
            test.log(LogStatus.INFO, "username entered");

            WebElement TxtPass = driver.findElement(By.name("password"));
            TxtPass.sendKeys("admin123");
            test.log(LogStatus.INFO, "password entered");

            WebElement Clickbutton = driver.findElement(By.name("btn_login"));
            Clickbutton.click();
            test.log(LogStatus.INFO, "Login button clicked");

            String expected = "Dashboard";
            String actual="";
            try {
                WebElement txtDashboard = driver.findElement(By.xpath("//a[@class='hidden-sm']"));
                actual = txtDashboard.getText();
//                test.log(LogStatus.INFO,"Screenshot below:"+ test.addScreenCapture("./screenshots/"+ takeScreenshot(driver)));
            }
            catch(Exception e)
            {

            }
            try {
                Assert.assertEquals(actual, expected, "The test case is failed");
                test.log(LogStatus.PASS, "test is passed");
                test.log(LogStatus.INFO,"Screenshot below:"+ test.addScreenCapture("./screenshots/"+ takeScreenshot(driver)));

            }
            catch (AssertionError e)
            {
                test.log(LogStatus.FAIL, e);
                test.log(LogStatus.INFO,"Screenshot below:"+ test.addScreenCapture("./screenshots/"+ takeScreenshot(driver)));

            }

            extent.endTest(test);
        }

        @AfterClass
        public void stoptest()
        {
            extent.flush();
        }
    }

