import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert2Example {


        @Test
        public void login1() {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://billing.scriptinglogic.net");

            WebElement TxtEmail = driver.findElement(By.name("email"));
            TxtEmail.sendKeys("abc@mail.com");

            WebElement TxtPass = driver.findElement(By.name("password"));
            TxtPass.sendKeys("password");

            WebElement Clickbutton = driver.findElement(By.name("btn_login"));
            Clickbutton.click();

            String expected = "Dashboard";
            String actual="";
            try {
                WebElement txtDashboard = driver.findElement(By.xpath("//a[@class='hidden-sm']"));
                actual = txtDashboard.getText();
            }
            catch(Exception e)
            {

            }
            Assert.assertEquals(actual,expected,"The test case is failed");

        }
    }

