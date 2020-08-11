package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StrongerTogetherPage {
	public WebDriver driver;

	public StrongerTogetherPage(WebDriver driver) {
		this.driver = driver;
	}

	By singapore = By.linkText("Singapore");
	By about = By.linkText("About");
	By table = By.xpath("//table/tbody/tr");

	public WebElement Singapore() {
		return driver.findElement(singapore);
	}

	public WebElement About() {
		return driver.findElement(about);
	}

	public void Table() throws IOException {

		int tableContent = driver.findElements(table).size();

		ArrayList<String> tabletext = new ArrayList<String>();

		String filePath = System.getProperty("user.dir") + "\\src\\excelExportAndFileIO";
		String fileName = "ExportExcel.xlsx";
		String sheetName = "ExcelDemo";

		File file = new File(filePath + "\\" + fileName);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook inputWorkbook = null;
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		if (fileExtensionName.equals(".xlsx")) {
			inputWorkbook = new XSSFWorkbook(inputStream);
		}

		else if (fileExtensionName.equals(".xls")) {
			inputWorkbook = new HSSFWorkbook(inputStream);
		}

		Sheet sheet = inputWorkbook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		for (int i = 1; i <= tableContent; i++) {

			Row newRow = sheet.createRow(i);

			int xyz = driver.findElements(By.xpath("//table/tbody/tr[" + i + "]/td")).size();
			for (int k = 1; k <= xyz; k++) {

				Cell cell = newRow.createCell(k);
				cell.setCellValue(driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[" + k + "]")).getText());
			}

		}

		inputStream.close();
		FileOutputStream outputStream = new FileOutputStream(file);
		inputWorkbook.write(outputStream);
		outputStream.close();
	}
}
