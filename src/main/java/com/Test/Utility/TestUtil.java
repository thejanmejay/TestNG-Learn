package com.Test.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {

    private static final String FILE_PATH = "C:\\Users\\JanmejaySingh\\Downloads\\Test Data.xlsx";

    public static Object[][] getDataFromExcel() {
        ArrayList<Object[]> myData = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(FILE_PATH);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet("Sheet1");
            int rowCount = sheet.getPhysicalNumberOfRows();

            // Loop rows (start from 1 to skip header)
            for (int i = 1; i < rowCount; i++) {
                Row row = sheet.getRow(i);
                if (row == null) continue;

                String firstName   = getCellValue(row.getCell(0));
                String lastName    = getCellValue(row.getCell(1));
                String dob         = getCellValue(row.getCell(2));
                String street      = getCellValue(row.getCell(3));
                String postalCode  = getCellValue(row.getCell(4));
                String city        = getCellValue(row.getCell(5));
                String state       = getCellValue(row.getCell(6));
                String country     = getCellValue(row.getCell(7));
                String phone       = getCellValue(row.getCell(8));
                String email       = getCellValue(row.getCell(9));
                String password    = getCellValue(row.getCell(10));

                Object[] ob = { firstName, lastName, dob, street, postalCode, city, state, country, phone, email, password };
                myData.add(ob);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convert ArrayList → Object[][]
        Object[][] data = new Object[myData.size()][];
        for (int i = 0; i < myData.size(); i++) {
            data[i] = myData.get(i);
        }
        return data;
    }

    // Helper method to handle different cell types
    private static String getCellValue(Cell cell) {
        if (cell == null) return "";
        switch (cell.getCellType()) {
            case STRING: return cell.getStringCellValue().trim();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString();
                } else {
                    return String.valueOf((long) cell.getNumericCellValue());
                }
            case BOOLEAN: return String.valueOf(cell.getBooleanCellValue());
            case BLANK: return "";
            default: return cell.toString();
        }
    }
}
