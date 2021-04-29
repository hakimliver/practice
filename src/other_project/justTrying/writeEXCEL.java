package other_project.justTrying;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class writeEXCEL {


    public static final String FILE_PATH="../javaHakim/src/justTrying/hakim1.xlsx";


    public static void main(String[] args) {

        Object [][] players={
                {"number","First Name","Last Name","phone number"},
                {"1","hakim","lehamel","2679042428"},
                {"2","sadio","many","111222333"},
                {"3","roberto","firminho","1112234356"},
        };



        writeExcel(FILE_PATH,"hakim",players);






    }

    public static void writeExcel(String filePath,String sheetName, Object [][] data){
        XSSFWorkbook workbook =new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet(sheetName);
        int rowNum=0;
        System.out.println("Excel File Created");
        for (Object [] dt: data) {
            Row row = sheet.createRow(rowNum++);
            int colNum=0;
            for (Object field: dt) {
                Cell cell=row.createCell(colNum++);
                if (field instanceof String){
                    cell.setCellValue((String) field);
                } else if(field instanceof Integer){
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try {
            FileOutputStream out= new FileOutputStream(filePath);
            workbook.write(out);
            workbook.close();
        } catch (FileNotFoundException fn){
            System.out.println("File not Found Exception");
        } catch (IOException io){
            System.out.println("Done");
        }


    }

}
