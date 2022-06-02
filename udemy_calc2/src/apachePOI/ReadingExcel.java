package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcel {
	public static void main(String[] args) throws IOException {
		String path=System.getProperty("user.dir")+"/src/apachePOI/spread.xlsx";
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet0 = workbook.getSheetAt(0);
//		Row row0= sheet0.getRow(0);
//		Cell cell0 = row0.getCell(0);
//		
//		System.out.println(cell0);
//		fis.close();
		
		
		for(Row row: sheet0) {
			for(Cell cell: row) {
				if(cell.getCellType()== CellType.STRING) {
					System.out.print(cell.getStringCellValue()+"\t");					
				}
				else if(cell.getCellType()== CellType.NUMERIC) {					
					System.out.print(cell.getNumericCellValue()+"\t");
				}
			}
			System.out.println();
		}
		
		}
}

