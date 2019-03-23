import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class XpathExample2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");

        WebElement txtuser = driver.findElement(By.xpath("//input[@name='uid']"));
        txtuser.sendKeys("mngr177756");

        WebElement txtpass=driver.findElement(By.xpath("//input[@name='password']"));
        txtpass.sendKeys("EdUqUhA");

        WebElement login=driver.findElement(By.xpath("//input[@value='LOGIN']"));
        login.click();

        WebElement newCust=driver.findElement(By.xpath("//a[text()='New Customer']"));
        newCust.click();

        WebElement custName=driver.findElement(By.xpath("//input[@name='name']"));
        custName.sendKeys("New Customer");

        WebElement radioButton=driver.findElement(By.xpath("//input[@value='f']"));
        radioButton.click();

        WebElement dob=driver.findElement(By.xpath("//input[@name='dob']"));
        dob.sendKeys("01-01-1992");

        WebElement addr=driver.findElement(By.xpath("//textarea"));
        addr.sendKeys("Katraj");

        WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
        city.sendKeys("Pune");

        WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
        state.sendKeys("Maharashtra");

        WebElement pin=driver.findElement(By.xpath("//input[@name='pinno']"));
        pin.sendKeys("123456");

        WebElement telephone=driver.findElement(By.xpath("//input[@name='telephoneno']"));
        telephone.sendKeys("9987745456");

        WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
        email.sendKeys("mail@address.com");

        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("password");


        WebElement submit1=driver.findElement(By.xpath("//input[@value='Submit']"));
        submit1.click();

    }
}
