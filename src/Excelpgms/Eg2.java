package Excelpgms;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Eg2 {
    public static void main(String[] args) throws IOException {
            //I want to read data from excel-->where is file? location-->name
        FileInputStream Myfile = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\exp\\pgm.xlsx");
        Workbook Myworkbook = WorkbookFactory.create(Myfile);

        Sheet mySheet = Myworkbook.getSheet("sheet1");
        Row myRow = mySheet.getRow(0);
        Cell myCell = myRow.getCell(0);
        CellType dataType = myCell.getCellType();
        System.out.println("Cell type is " + dataType);


    }
}
