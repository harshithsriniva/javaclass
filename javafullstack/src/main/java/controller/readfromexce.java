package controller;



import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readfromexce {
    public static void main(String[] argc){
        try{
            String filepath = "D:\\Book1.xls";
            FileInputStream file = new FileInputStream(filepath);
//            Workbook workbook = WorkbookFactory.create(file);
            Workbook workbook = WorkbookFactory.create(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
