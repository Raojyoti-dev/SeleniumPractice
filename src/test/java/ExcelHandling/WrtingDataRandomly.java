package ExcelHandling;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrtingDataRandomly {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\RandomFile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Sheet1");
		
		sheet.createRow(2).createCell(4).setCellValue("jyoti");
		sheet.createRow(3).createCell(4).setCellValue("Shiva");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("file is created....");

	}

}
