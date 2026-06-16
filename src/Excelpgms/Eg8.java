package Excelpgms;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class Eg8 {
    public static void main(String[] args) throws IOException {
        FileInputStream myFile = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\exp\\pgm.xlsx");
        Workbook myWorkBook = WorkbookFactory.create(myFile);
        Cell myCell;
        Sheet mySheet = myWorkBook.getSheet("Sheet4");
        //how many rows?


        //how many columns?


        int lastRowNum = mySheet.getLastRowNum();
        System.out.println("last row num is " + lastRowNum);


        int lastCellNum = mySheet.getRow(0).getLastCellNum() - 1;
        System.out.println("last cell num is " + lastCellNum);




    }
}
