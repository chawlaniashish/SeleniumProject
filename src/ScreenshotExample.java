
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
//extent 3 example
public class ScreenshotExample {
    @Test
    public void takescreenshot() throws IOException
    {

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("Reports/extent.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        ExtentTest test = extent.createTest("testnamehere","description here");

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        test.log(Status.INFO,"browser is opened");

        driver.manage().window().maximize();

        test.log(Status.INFO,"browser is maximized");

        driver.get("http://google.com");


        test.log(Status.INFO,"website is opened");


         extent.flush();

      //  File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(scrFile, new File("C://Users//Ashish//IdeaProjects//SeleniumProject//screenshots//screenshot.png"));
    }
}
