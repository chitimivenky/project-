package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Xlsheet{
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {	
	FileInputStream f=new FileInputStream("C:/Users/MAHESH/Downloads/new.xlsx");
	 Workbook w = WorkbookFactory.create(f);
	 String data = w.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
			System.out.println(data);
			 
			
			
			
			
			
			
	}		
			
			
			
			
}
