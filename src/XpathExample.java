import javafx.scene.web.WebErrorEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://billing.scriptinglogic.net");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='email']"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPass = driver.findElement(By.xpath("//input[@id='password']"));
        txtPass.sendKeys("admin123");

        WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
        login.click();
    }
}
