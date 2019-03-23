import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitExample {
    WebDriver driver;

   @Before
    public void beforeMyTest()
    {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void close()
    {
        driver.close();
    }

    @Test
    public void login1()
        {
        driver.manage().window().maximize();
        driver.get("http://billing.scriptinglogic.net");

        WebElement TxtEmail = driver.findElement(By.name("email"));
        TxtEmail.sendKeys("abc@mail.com");

        WebElement TxtPass = driver.findElement(By.name("password"));
        TxtPass.sendKeys("password");

        WebElement Clickbutton = driver.findElement(By.name("btn_login"));
        Clickbutton.click();
    }

    @Test
    public void login2()
    {
        driver.manage().window().maximize();
        driver.get("http://billing.scriptinglogic.net");


        WebElement TxtEmail = driver.findElement(By.name("email"));
        TxtEmail.sendKeys("test@mail.com");

        WebElement TxtPass = driver.findElement(By.name("password"));
        TxtPass.sendKeys("password");

        WebElement Clickbutton = driver.findElement(By.name("btn_login"));
        Clickbutton.click();
    }
    @Test
    public void login3()
    {
        driver.manage().window().maximize();
        driver.get("http://billing.scriptinglogic.net");


        WebElement TxtEmail = driver.findElement(By.name("email"));
        TxtEmail.sendKeys("mail@xyz.com");

        WebElement TxtPass = driver.findElement(By.name("password"));
        TxtPass.sendKeys("password");

        WebElement Clickbutton = driver.findElement(By.name("btn_login"));
        Clickbutton.click();
    }

}