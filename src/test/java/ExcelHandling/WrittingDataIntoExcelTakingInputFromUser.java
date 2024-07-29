package ExcelHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingDataIntoExcelTakingInputFromUser {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\MyFile3.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("DynamicData");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("No of rows:");
		int rows=sc.nextInt();
		System.out.println("No of cells:");
		int cells=sc.nextInt();
		
		for(int r=0;r<=rows;r++) {
			
			XSSFRow row=sheet.createRow(r);
			
			for(int c=0;c<cells;c++) {
				
				XSSFCell cell=row.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("file is created...");
	}

}
