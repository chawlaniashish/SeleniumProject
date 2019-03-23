import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataStructureExample {
    @Test(dataProvider = "getData")
    public void LoginTest(String username, String password) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://billing.scriptinglogic.net");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

        driver.findElement(By.xpath("//input[@value='Login']")).click();

    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[4][2];
        data[0][0] = "Admin";
        data[0][1] = "Admin";

        data[1][0] = "ashish";
        data[1][1] = "ashish123";

        data[2][0] = "";
        data[2][1] = "";

        data[3][0] = "amolujagare@gmail.com";
        data[3][1] = "admin123";

        return data;
    }
}

