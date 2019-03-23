import org.joda.time.DateTime;
import org.joda.time.Months;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePicker {
    @Test
    public void datePicker() throws ParseException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/datepicker/");

        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        driver.findElement(By.id("datepicker")).click();
        String setDatestr="01/01/1992";

        String curDatestr= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

        Date setDate = new SimpleDateFormat("dd/MM/yyyy").parse(setDatestr);

        Date curDate = new SimpleDateFormat(("MMMM yyyy")).parse(curDatestr);

        int monthDiff= Months.monthsBetween(new DateTime(curDate).withDayOfMonth(1), new DateTime(setDate).withDayOfMonth(1)).getMonths();

        boolean isFuture=true;

        if(monthDiff<0){
            isFuture=false;
            monthDiff=-1 * monthDiff;
        }
        for(int i=0;i<monthDiff;i++)
        {
            if(isFuture)
                driver.findElement(By.xpath("//span[text()='Next']")).click();
            else
                driver.findElement(By.xpath("//span[text()='Prev']")).click();
        }
        String Day;
        Day= new SimpleDateFormat("dd").format(setDate);
        driver.findElement(By.xpath("//a[text()='"+Integer.parseInt(Day)+"']")).click();

    }
}
