package org.BassClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BassClass  {
	
	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void WindowMaximize() {
		driver.manage().window().maximize();
	}
	
	public static void launchUrl(String Url) {
		driver.get(Url);
		
	}
	public static String PageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	public static void PageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void PassText(String txt,WebElement ele) {
		ele.sendKeys(txt);
	
		
	}
	public static void CloseEntrieElement() {
		driver.quit();
	}
	public static void clickbtn(WebElement ele) {
		ele.click();
		
	}
	public static void main(String imgName)throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("E:\\maven\\BassClass\\imge");
		FileUtils.copyFile(screenshotAs,f);
		
	}
	public static Actions a;
	public static void MoveTHeCursor(WebElement targeteElement) {
		 a = new Actions(driver);
		a.moveToElement(targeteElement).perform();
	}
	public static void DragDrop(WebElement DrageElement,WebElement DropElement) {
		a = new Actions(driver);
		a.dragAndDrop(DrageElement, DropElement).perform();
	}
	public static JavascriptExecutor js;
	public static void scrollThepage(WebElement tarWebEle) {
		js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].scrollIntoView(true)", tarWebEle);
	}
	public static void Scroll(WebElement Element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].scrollIntoView(fales)", Element);
	}
	public static void excelRead(String SheetName ,  int rowNum, int cellNum) throws IOException {
		File f = new File("");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Data");
		Row r = mysheet.getRow(rowNum);
		Cell c = r.getCell(cellNum);
		int cellType = c.getCellType();
		String value = "";
		if (cellType == 1) {
			String value2 = c.getStringCellValue();
			
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date dd= c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat(value);
			String value1 = s.format(dd);
			
		}
		else {
			double d = c.getNumericCellValue();
			long l = (long)d;
			String valueOf = String.valueOf(1);
		}
		
		
		
	}
	public static void CreatNameEcelFile(int rowNum , int CellNum , String WriteData) throws IOException {
		File f = new File("E:\\maven\\BassClass\\imge\\excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet newSheet = w.getSheet("Data");
		Row newRow = newSheet.getRow(rowNum);
		Cell newCell = newRow.getCell(CellNum);
		newCell.setCellValue(WriteData);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		
	}
	public static void CreatCell(int getRow , int getCell, String newData) throws IOException {
		File f = new File("E:\\maven\\BassClass\\excel\\file.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Data");
		Row r = s.getRow(getRow);
		Cell c = r.getCell(getCell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	public static void creatRow(int crerRow , int crecell , String newData) throws IOException {
		File f = new File("");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Data");
		Row r = s.getRow(crerRow);
		Cell c = r.getCell(crecell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
	}
	public static void updateDataToPaticulerCell(int getTheRow , int getTheCell , String exisitingData, String WriteNewData) throws IOException {
		File f = new File("");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("");
		Row r = s.getRow(getTheRow);
		Cell c = r.getCell(getTheCell);
		String str = c.getStringCellValue();
		if (str.equals(exisitingData)) {
			c.setCellValue(WriteNewData);
			
		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
	
	
	
	
	
}
