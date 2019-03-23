import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://facebook.com");

        WebElement selDOB=driver.findElement(By.name("birthday_day"));

        Select obSelDOB = new Select(selDOB);
        //obSelDOB.selectByIndex(1);
        //obSelDOB.selectByValue("5");
        obSelDOB.selectByVisibleText("2");

        WebElement selDOB1=driver.findElement(By.name("birthday_month"));
        Select obSelDOB1=new Select(selDOB1);
        //obSelDOB1.selectByIndex(1);
        //obSelDOB1.selectByValue("2");
        obSelDOB1.selectByVisibleText("Dec");

        WebElement selDOB3=driver.findElement(By.name("birthday_year"));
        Select obSelDOB2=new Select(selDOB3);
        //obSelDOB2.selectByIndex(1);
        //obSelDOB2.selectByValue("2008");
        obSelDOB2.selectByVisibleText("1998");
    }

}
