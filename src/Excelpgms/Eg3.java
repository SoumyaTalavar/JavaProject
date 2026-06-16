package Excelpgms;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class Eg3 {
    public static void main(String[] args) throws IOException {
        //I want to read data from excel-->where is file? location-->name
        FileInputStream Myfile = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\exp\\pgm.xlsx");
        Workbook Myworkbook = WorkbookFactory.create(Myfile);
        Sheet mySheet = Myworkbook.getSheet("Sheet3");
        //how to read complete row...
        for (int i = 0; i <= 3; i++) {//0,1,2,3
            {
                String myValue = mySheet.getRow(0).getCell(i).getStringCellValue();
                System.out.print(myValue + "  ");

            }
        }
    }
}