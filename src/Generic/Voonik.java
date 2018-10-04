package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Voonik {
	public static String abc(String file , String sheet , int row , int cell) {
		String s ="";
		try
		{
			FileInputStream f = new FileInputStream(file);
		  Workbook wb = WorkbookFactory.create(f);
		 s=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		}
			
	catch(Exception e)
		{
			
		}
		return s;
		
	}

}
