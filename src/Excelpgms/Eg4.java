package Excelpgms;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class Eg4 {
    public static void main(String[] args) throws IOException {
        FileInputStream myFile = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\exp\\pgm.xlsx");
        Workbook myWorkBook = WorkbookFactory.create(myFile);
        Sheet mySheet = myWorkBook.getSheet("Sheet3");
        //how to read complete column...
        for(int i=0;i<=3;i++) {
            String myValue = mySheet.getRow(i).getCell(0).getStringCellValue();
            System.out.println(myValue);
        }
    }

}
