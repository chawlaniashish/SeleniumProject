import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG1 {

    @Test
    public void login2() {

        {
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
        }
    }
}