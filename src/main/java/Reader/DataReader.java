package Reader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReader {

    public XSSFWorkbook wb;

    public Object[][] getExcelData(String sheetName) throws IOException {
        String filePath = "D:\\testing software\\ITI 9 Month\\Itiwebdriver\\src\\test\\java\\test\\Resources\\mydata.xlsx";

        FileInputStream fis = new FileInputStream(filePath);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet(sheetName);

        int TotalNumberOfRows = (sheet.getLastRowNum() + 1);
        int TotalNumberOfCols = sheet.getRow(0).getLastCellNum();

        String[][] arrayExcelData = new String[TotalNumberOfRows][TotalNumberOfCols];

        for (int i = 0; i < TotalNumberOfRows; i++) {
            for (int j = 0; j < TotalNumberOfCols; j++) {
                XSSFRow row = sheet.getRow(i);
                arrayExcelData[i][j] = row.getCell(j).toString();
            }
        }
        wb.close();
        return arrayExcelData;
    }
}
