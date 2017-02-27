package lesson_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;
import javax.swing.text.html.HTMLEditorKit.Parser;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcelParser {

	
		public  void numberOfLines(String inputFileName, String firstOutputFileName, String secondOutputFileName) throws IOException {
			ArrayList <String> stringArray = new ArrayList<String>();
			
			File inputFile = new File(inputFileName);
			FileInputStream fis = new FileInputStream(inputFile);
		 
			//Construct BufferedReader from InputStreamReader
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		 
			String line = null;
			
			
			while ((line = br.readLine()) != null) {
				
				if(line.length()!=0){	
					stringArray.add(line);
				}
			}
		}
		public static void readFromExcel(String file) throws IOException{
	        HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(file));
	        HSSFSheet myExcelSheet = myExcelBook.getSheet("flight");
	        HSSFRow row = myExcelSheet.getRow(0);
	        
	        if(row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING){
	            String name = row.getCell(0).getStringCellValue();
	            System.out.println("name : " + name);
	        }
	        
	        if(row.getCell(1).getCellType() == HSSFCell.CELL_TYPE_NUMERIC){
	            Date birthdate = row.getCell(1).getDateCellValue();
	            System.out.println("birthdate :" + birthdate);
	        }
	        
	        myExcelBook.close();
	        
	    }
}
				
			
		
		