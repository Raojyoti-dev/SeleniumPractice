package ExcelHandling;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingDtaIntoFile {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\MyFile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet Sheet=workbook.createSheet("Sheet1");
		XSSFRow row1=Sheet.createRow(0);
			row1.createCell(0).setCellValue("Java");
			row1.createCell(1).setCellValue(1);
			row1.createCell(2).setCellValue("Completed");
			
		XSSFRow row2=Sheet.createRow(1);
			row2.createCell(0).setCellValue("Selenium");
			row2.createCell(1).setCellValue(2);
			row2.createCell(2).setCellValue("Inprogress");
			
		XSSFRow row3=Sheet.createRow(2);
			row3.createCell(0).setCellValue("TestNG");
			row3.createCell(1).setCellValue(3);
			row3.createCell(2).setCellValue("Not yet Started");
			
		workbook.write(file);
		workbook.close();
		file.close();

	}

}
