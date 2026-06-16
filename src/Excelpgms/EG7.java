package Excelpgms;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EG7 {
    public static void main(String[] args) throws IOException {
        FileInputStream myFile = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\exp\\pgm.xlsx");
        Workbook myWorkBook = WorkbookFactory.create(myFile);
        Cell myCell;
        Sheet mySheet = myWorkBook.getSheet("Sheet4");
        //outer for loop-->row-->0-1
        for (int i = 0; i <= 1; i++)
        {
            //inner for loop-->cell-->0-3
            for (int j = 0; j <= 3; j++)
            {
                myCell=mySheet.getRow(i).getCell(j);
                if (myCell==null)
                {
                    System.out.print("* ");
                    continue;

                }
                CellType MycellType=myCell.getCellType();
                if(MycellType==CellType.NUMERIC)
                {
                    System.out.print(myCell.getNumericCellValue() + " ");

                }
                else if (MycellType == CellType.STRING)
                {
                    System.out.print(myCell.getStringCellValue() + " ");
                }
                else if (MycellType == CellType.BOOLEAN) {
                    System.out.print(myCell.getBooleanCellValue() + " ");
                }
                else {
                    System.out.print("Unknown cell type ");

                }

            }
            System.out.println();

        }

        myWorkBook.close();
        myFile.close();

    }
}
