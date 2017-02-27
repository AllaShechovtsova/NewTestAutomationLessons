package lesson_4;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class Task1 {
	 
    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream("/tmp/databaseTables");
        HSSFWorkbook wb = new HSSFWorkbook(in);
 
        Sheet sheet = wb.getSheetAt(0);
        Iterator<Row> it = sheet.iterator();
        while (it.hasNext()) {
            Row row = it.next();
            Iterator<Cell> cells = row.iterator();
            while (cells.hasNext()) {
                Cell cell = cells.next();
                int cellType = cell.getCellType();
                switch (cellType) {
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() + "=");
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print("[" + cell.getNumericCellValue() + "]");
                        break;
 
                    case Cell.CELL_TYPE_FORMULA:
                        System.out.print("[" + cell.getNumericCellValue() + "]");
                        break;
                    default:
                        System.out.print("|");
                        break;
                }
            }
            System.out.println();
        }
    }
}