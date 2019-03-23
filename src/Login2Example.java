import com.sun.xml.internal.ws.org.objectweb.asm.ByteVector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login2Example {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/v4");

        WebElement TxtUsername=driver.findElement(By.name("uid"));
        TxtUsername.sendKeys("mngr177756");

        WebElement TxtPassword=driver.findElement(By.name("password"));
        TxtPassword.sendKeys("EdUqUhA");

        WebElement SubmitButton=driver.findElement(By.name("btnLogin"));
        SubmitButton.click();

        WebElement NewCustomerLink=driver.findElement(By.linkText("New Customer"));
        NewCustomerLink.click();

        WebElement CustomerName=driver.findElement(By.name("name"));
        CustomerName.sendKeys("Customer");

        WebElement DOB=driver.findElement(By.name("dob"));
        DOB.sendKeys("01-01-1992");

        WebElement Address=driver.findElement(By.name("addr"));
        Address.sendKeys("Katraj");

        WebElement City=driver.findElement(By.name("city"));
        City.sendKeys("Pune");

        WebElement State=driver.findElement(By.name("state"));
        State.sendKeys("Maharashtra");

        WebElement PinNumber=driver.findElement(By.name("pinno"));
        PinNumber.sendKeys("411046");

        WebElement Telephone=driver.findElement(By.name("telephoneno"));
        Telephone.sendKeys("1234567897");

        WebElement EmailId=driver.findElement(By.name("emailid"));
        EmailId.sendKeys("email@mail.com");

        WebElement Password2=driver.findElement(By.name("password"));
        Password2.sendKeys("12345");

        WebElement Submit2=driver.findElement(By.name("sub"));
        Submit2.click();


    }
}
