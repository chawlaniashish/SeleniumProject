import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstExample {
    public static void main(String[] args)
    {
     System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://gmail.com");

        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getTitle());

        //System.out.println(driver.getPageSource());

        driver.navigate().to("http://google.com");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


    }
}
