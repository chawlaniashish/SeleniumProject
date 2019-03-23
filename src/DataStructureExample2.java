import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;


public class DataStructureExample2 {


    WebDriver driver;

    @BeforeClass
                public void beforeMyTest()
        {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("http://demo.guru99.com/v4");

            WebElement TxtUsername = driver.findElement(By.name("uid"));
            TxtUsername.sendKeys("mngr177756");

            WebElement TxtPassword = driver.findElement(By.name("password"));
            TxtPassword.sendKeys("EdUqUhA");

            WebElement SubmitButton = driver.findElement(By.name("btnLogin"));
            SubmitButton.click();
        }
        @Test(dataProvider = "getData")
        public void LoginTest(String custName, String radioButton, String dob, String addr, String city, String state, String pin, String telephone, String email, String password) {
            WebElement newCust=driver.findElement(By.xpath("//a[text()='New Customer']"));
            newCust.click();

            driver.findElement(By.xpath("//input[@name='name']")).sendKeys(custName);

            driver.findElement(By.xpath("//input[@value='"+radioButton+"']")).click();

            driver.findElement(By.xpath("//input[@name='dob']")).sendKeys(dob);

            driver.findElement(By.xpath("//textarea")).sendKeys(addr);

            driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);

            driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);

            driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys(pin);

            driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(telephone);

            driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(email);

            driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);

            driver.findElement(By.xpath("//input[@value='Submit']")).click();

        }

        @DataProvider
        public Object[][] getData() throws IOException {
            FileInputStream fileInputStream = new FileInputStream("Data/CustomerDetails.xls");
            HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
            HSSFSheet worksheet = workbook.getSheet("Sheet1");
            int rowCount = worksheet.getPhysicalNumberOfRows();

            Object[][] data=new Object[rowCount][10];

            for (int i=0;i<rowCount;i++)
            {
                HSSFRow row= worksheet.getRow(i);

                HSSFCell custName= row.getCell(0);
                if(custName==null)
                    data[i][0]="";
                else {
                    custName.setCellType(CellType.STRING);
                    data[i][0] = custName.getStringCellValue();
                }

                HSSFCell radioButton= row.getCell(1);
                if(radioButton==null)
                    data[i][1]="";
                else
                {radioButton.setCellType(CellType.STRING);
                    data[i][1]=radioButton.getStringCellValue();}

                HSSFCell dob= row.getCell(1);
                if(dob==null)
                    data[i][1]="";
                else
                {dob.setCellType(CellType.STRING);
                    data[i][1]=dob.getStringCellValue();}

                HSSFCell addr= row.getCell(1);
                if(addr==null)
                    data[i][1]="";
                else
                {addr.setCellType(CellType.STRING);
                    data[i][1]=addr.getStringCellValue();}

                HSSFCell city= row.getCell(1);
                if(city==null)
                    data[i][1]="";
                else
                {city.setCellType(CellType.STRING);
                    data[i][1]=city.getStringCellValue();}

                HSSFCell state= row.getCell(1);
                if(state==null)
                    data[i][1]="";
                else
                {state.setCellType(CellType.STRING);
                    data[i][1]=state.getStringCellValue();}

                HSSFCell pin= row.getCell(1);
                if(pin==null)
                    data[i][1]="";
                else
                {pin.setCellType(CellType.STRING);
                    data[i][1]=pin.getStringCellValue();}

                HSSFCell telephone= row.getCell(1);
                if(telephone==null)
                    data[i][1]="";
                else
                {telephone.setCellType(CellType.STRING);
                    data[i][1]=telephone.getStringCellValue();}

                HSSFCell email= row.getCell(1);
                if(email==null)
                    data[i][1]="";
                else
                {email.setCellType(CellType.STRING);
                    data[i][1]=email.getStringCellValue();}

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
