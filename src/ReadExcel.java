import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Tanay Chawla\\Desktop\\Book1.xlsx");
		
	    Workbook wb = new XSSFWorkbook(file);
	    
	    Sheet sh = wb.getSheet("sheet1");
	    
	    
	    
	    int rowsize = sh.getLastRowNum()- sh.getFirstRowNum();
	    
	    System.out.println(rowsize);
	    
	    for(int i=1; i<rowsize; i++){
	    	
	    	Row row = sh.getRow(i);
	    	
	    	for(int j=1; j<row.getLastCellNum();j++){
	    		
	    		System.out.print(row.getCell(j).getStringCellValue());
	    		System.out.print("             ");
	    		
	    	}
	    	System.out.println();
	    	
	    	
0	    	
	    }
	    
		

	}

}
