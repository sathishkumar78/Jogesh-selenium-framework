package utilities;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import java.io.FileInputStream;
import java.io.IOException;
import static utilities.RandomData.randomEmailId;
import static utilities.RandomData.randomEmpId;
import static utilities.TestData.propertyReader;

public class ExcelData2 {
    @DataProvider(name = "addEmployeeData")
    public Object[][] getLoginData() throws IOException {
        FileInputStream fis = new FileInputStream(propertyReader("excelDataPath2"));
        Workbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = (XSSFSheet) wb.getSheet("AddEmployeeData");
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();
        Object data[][] = new Object[rowCount - 1][colCount];
        DataFormatter df=new DataFormatter();
        for (int i = 1; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                Cell cell = row.getCell(j);
                if(df.formatCellValue(cell).equals("RandomEmpId"))
                {
                    data[i-1][j]=randomEmpId();
                } else if (df.formatCellValue(cell).equals("RandomEmail"))
                {
                    data[i-1][j]=randomEmailId();
                } else
                {
                    data[i - 1][j] = df.formatCellValue(cell);
                }
            }
        }
        return data;
    }
}