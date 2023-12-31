package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
	
	WebDriver driver;
   // WebDriverWait wait;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
 
 @BeforeTest
 public void TestSetup()
{
    // Set the path of the Firefox driver.
   // System.setProperty("webdriver.gecko.driver", "C:\\Users\\geckodriver.exe");
    driver = new ChromeDriver();
     
    // Enter url.
    driver.get("http://www.linkedin.com/");
    driver.manage().window().maximize();
     
   // wait = new WebDriverWait(driver,30);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
  
 @Test
 public void ReadData() throws IOException 
 {
     // Import excel sheet.
     File src=new File("C:\\Users\\iMark Admin\\Desktop\\Code editor\\EvolvingLove\\test-data\\Opencart_LoginData.xlsx");
      
     // Load the file.
     FileInputStream finput = new FileInputStream(src);
      
     // Load he workbook.
    workbook = new XSSFWorkbook(finput);
      
     // Load the sheet in which data is stored.
     sheet= workbook.getSheetAt(0);
      
   /*  for(int i=1; i&amp;lt;=sheet.getLastRowNum(); i++)
     {
         // Import data for Email.
         cell = sheet.getRow(i).getCell(1);
         cell.setCellType(Cell.CELL_TYPE_STRING);
         driver.findElement(By.id("login-email")).sendKeys(cell.getStringCellValue());
          
         // Import data for password.
         cell = sheet.getRow(i).getCell(2);
         cell.setCellType(Cell.CELL_TYPE_STRING);
         driver.findElement(By.id("login-password")).sendKeys(cell.getStringCellValue()); 
         */
                 
        }
  } 
 



