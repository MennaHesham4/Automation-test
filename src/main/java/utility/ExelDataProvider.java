package utility;


import java.io.IOException;

import Reader.DataReader;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;


public class ExelDataProvider {
@DataProvider(name = "getDataExcel")
    public Object[][] getDataExcel( ITestContext context) throws IOException {
        String sheetNameToParse = context.getAttribute("sheetName").toString();
        DataReader mydata = new DataReader();
        return mydata.getExcelData(sheetNameToParse);
    }
}

