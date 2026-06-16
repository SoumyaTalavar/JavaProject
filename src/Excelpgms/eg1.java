package Excelpgms;

import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class eg1 {
    public static void main(String[] args) throws IOException {
       //I want to read data from Excel-->where is file? location-->name
        FileInputStream Myfile= new FileInputStream("C:\\Users\\Lenovo\\Desktop\\exp\\pgm.xlsx");
        //excel reading
        String Mydata= WorkbookFactory.create(Myfile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
        System.out.println("Mydata is"+Mydata);

    }
}
