import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class LoginExample {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://billing.scriptinglogic.net");

        WebElement TxtEmail= driver.findElement(By.name("email"));
        TxtEmail.sendKeys("mail@xyz.com");

        WebElement TxtPass= driver.findElement(By.name("password"));
        TxtPass.sendKeys("password");

        WebElement Clickbutton=driver.findElement(By.name("btn_login"));
        Clickbutton.click();

    }
}
