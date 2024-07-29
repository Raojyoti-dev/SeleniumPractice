package ExcelHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDatafromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//TestData//TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int totalRows=sheet.getLastRowNum();
		int totalCells=sheet.getRow(0).getLastCellNum();
		
		for(int r=0;r<=totalRows;r++) {  //rows counting starts from 0 hence r<=totalrows
			
			XSSFRow row=sheet.getRow(r);
			
			for(int c=0;c<totalCells;c++) { //cells counting starts from1 hence c<totalcells
				
				System.out.print(row.getCell(c).toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
		
		
		

	}

}
