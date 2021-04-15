package pavanpatil;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import genericlib.IConstants;

public class Fethdata_Excel {
	@Test
	public void getDataFromExcel() throws IOException {

		FileInputStream fis = new FileInputStream(IConstants.excelpath);
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		for (int i = 0; i <= sh.getLastRowNum(); i++) {
			Row r = sh.getRow(i);
			for (int j = 0; j < r.getLastCellNum(); j++) {

				String value = r.getCell(j).getStringCellValue();
				System.out.println(value + " ");
			}
			System.out.println();
		}
	}

}
