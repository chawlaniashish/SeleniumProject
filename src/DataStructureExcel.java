import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataStructureExcel {

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
        public Object[][] getData() throws IOException {
            FileInputStream fileInputStream = new FileInputStream("Data/data1.xls");
            HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
            HSSFSheet worksheet = workbook.getSheet("Sheet1");
            int rowCount = worksheet.getPhysicalNumberOfRows();

            Object[][] data=new Object[rowCount][2];

            for (int i=0;i<rowCount;i++)
            {
                HSSFRow row= worksheet.getRow(i);

                HSSFCell username= row.getCell(0);
                if(username==null)
                    data[i][0]="";
                else {
                    username.setCellType(CellType.STRING);
                    data[i][0] = username.getStringCellValue();
                }

                HSSFCell password= row.getCell(1);
                if(password==null)
                    data[i][1]="";
                else
                {password.setCellType(CellType.STRING);
                data[i][1]=password.getStringCellValue();}
            }

            return data;

        }



}
