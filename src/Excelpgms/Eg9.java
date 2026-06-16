package Excelpgms;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Eg9 {
    public static void main(String[] args) throws IOException {
        FileInputStream myFile = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\exp\\pgm.xlsx");
        Workbook myWorkBook = WorkbookFactory.create(myFile);
        Cell myCell;
        Sheet mySheet = myWorkBook.getSheet("Sheet4");
        int lastRowNum = mySheet.getLastRowNum();
        //outer for loop--> row-->
        for (int i = 0; i <= lastRowNum; i++) {
            Row myRow = mySheet.getRow(i);
            if (myRow == null) {
                System.out.println("Blank row");
                continue;
            }
            int lastCellNum = myRow.getLastCellNum() - 1;
            for (int j = 0; j <= lastCellNum; j++) {
                myCell = myRow.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                CellType myCellType = myCell.getCellType();
                if (myCellType == CellType.STRING) {
                    System.out.print(myCell.getStringCellValue() + " ");
                } else if (myCellType == CellType.NUMERIC) {
                    System.out.print(myCell.getNumericCellValue() + " ");
                } else if (myCellType == CellType.BOOLEAN) {
                    System.out.print(myCell.getBooleanCellValue() + " ");
                } else if (myCellType == CellType.BLANK) {
                    System.out.print("* ");
                } else {
                    System.out.println("Unknown type");
                }
            }

            System.out.println();
        }
    }
}
