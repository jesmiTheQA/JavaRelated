package Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Action_excel1 {

	public static void main(String[] args) {

		try {

			Action_excel1 obj = new Action_excel1();
			// obj.creation_excel();
			// obj.addingSheets_xls();
			// obj.remove_xls();
			// obj.updateDatatoExistingSheet_xlsx();
			obj.addDataToExistingSheet_xls();
			// obj.removeSheet_xls();
		} catch (Exception e) {

		}
	}

	/* Excel created with one sheet and added values to it >> working fine */
	public void creation_excel() {
		try {

			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("Java Books");

			Object[][] bookData = { { "Name", "Author", "Price" }, { "Head First Java", "Kathy Serria", 79 },
					{ "Effective Java", "Joshua Bloch", 36 }, { "Clean Code", "Robert martin", 42 },
					{ "Thinking in Java", "Bruce Eckel", 35 }, };

			int rowCount = 0;

			for (Object[] aBook : bookData) {
				Row row = sheet.createRow(rowCount++);

				int columnCount = 0;

				for (Object field : aBook) {
					Cell cell = row.createCell(columnCount++);
					if (field instanceof String) {
						cell.setCellValue((String) field);
					} else if (field instanceof Integer) {
						cell.setCellValue((Integer) field);
					}
				}

			}

			FileOutputStream outputStream = new FileOutputStream(
					"D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn\\FileActionsHelp\\JavaBooks.xlsx");
			workbook.write(outputStream); // this line is importent

		} catch (Exception e) {
			System.out.println("Error is from creation_excel(): " + e.toString());
		}
	}

	/* Reading the excel sheet and add new sheets. >> working fine */
	private void addingSheets_xls() {

		try {

			FileInputStream inputStream = new FileInputStream(new File(
					"D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn\\File_Actions_Help\\JavaBooks.xlsx"));
			// Workbook workbook = WorkbookFactory.create(inputStream);
			XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(inputStream);
			// XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet5 = workbook.createSheet("Java Books1");
			XSSFSheet sheet1 = workbook.createSheet("Java Books2");
			XSSFSheet sheet2 = workbook.createSheet("Java Books3");
			XSSFSheet sheet3 = workbook.createSheet("Java Books4");
			XSSFSheet sheet4 = workbook.createSheet("Java Books5");

			FileOutputStream outputStream = new FileOutputStream(
					"D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn\\File_Actions_Help\\JavaBooks.xlsx");
			workbook.write(outputStream);
			workbook.close();

			System.out.println("Sheets Has been Created successfully");

		} catch (Exception e) {
			System.out.println("Error is from updation_xls(): " + e.toString());
		}
	}

	/* Add data to existing sheet. >> working successfully */
	private void addDataToExistingSheet_xls() {
		try {

			FileInputStream file = new FileInputStream(new File(
					"D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn\\File_Actions_Help\\JavaBooks.xlsx"));

			XSSFWorkbook wb = new XSSFWorkbook(file); // Access the workbook
			// XSSFSheet sheet = wb.createSheet("Java Books");
			XSSFSheet sheet = wb.getSheetAt(1);

			Object[][] bookData = { { "ID", "Author", }, { "Head First Java", "Kathy Serria" },
					{ "Effective Java", "Joshua Bloch" }, { "Clean Code", "Robert martin" },
					{ "Thinking in Java", "Bruce Eckel1" }, { "Thinking in Java1", "Bruce Eckel1" }};

			int rowCount = 0;

			for (Object[] aBook : bookData) {
				Row row = sheet.createRow(rowCount++);

				int columnCount = 0;

				for (Object field : aBook) {
					Cell cell = row.createCell(columnCount++);
					if (field instanceof String) {
						cell.setCellValue((String) field);
					} else if (field instanceof Integer) {
						cell.setCellValue((Integer) field);
					}
				}

			}

			FileOutputStream outputStream = new FileOutputStream(
					"D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn\\File_Actions_Help\\JavaBooks.xlsx");
			wb.write(outputStream); // this line is importent

			file.close(); // Close the InputStream

		} catch (Exception e) {
			System.out.println("Error is from addDataToExistingSheet_xls(): " + e.toString());
		}
	}

	/* To update data in the existing sheet. >> working fine */
	private void updateDatatoExistingSheet_xlsx() {
		try {

			FileInputStream file = new FileInputStream(new File(
					"D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn\\File_Actions_Help\\JavaBooks.xlsx"));

			XSSFWorkbook wb = new XSSFWorkbook(file); // Access the workbook

			XSSFSheet worksheet = wb.getSheetAt(0); // Access the worksheet, so
													// that we can update /
													// modify it.

			Cell cell = null; // declare a Cell object

			cell = worksheet.getRow(1).getCell(1); // Access the second cell in
													// second row to update the
													// value

			cell.setCellValue("OverRide Last Name"); // Get current cell value
														// value and overwrite
														// the value

			cell = worksheet.getRow(2).getCell(1); // Access the second cell in
													// second row to update the
													// value

			cell.setCellValue("OverRide Last Name"); // Get current cell value
														// value and overwrite
														// the value

			cell = worksheet.getRow(3).getCell(1); // Access the second cell in
													// second row to update the
													// value

			cell.setCellValue("OverRide Last Name"); // Get current cell value
														// value and overwrite
														// the value

			cell = worksheet.getRow(4).getCell(1); // Access the second cell in
													// second row to update the
													// value

			cell.setCellValue("OverRide Last Name"); // Get current cell value
														// value and overwrite
														// the value

			file.close(); // Close the InputStream

			FileOutputStream output_file = new FileOutputStream(new File(
					"D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn\\File_Actions_Help\\JavaBooks.xlsx")); // Open
																													// FileOutputStream
																													// to
																													// write
																													// updates

			wb.write(output_file); // write changes

			output_file.close(); // close the stream

		} catch (Exception e) {
			System.out.println("Error is from addDatatoExistingSheet_xlsx(): " + e.toString());
		}
	}

	/* Removing the existing sheet >> working fine */
	private void removeSheet_xls() {
		try {

			FileInputStream inputStream = new FileInputStream(new File(
					"D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn\\File_Actions_Help\\JavaBooks.xlsx"));
			Workbook workbook = WorkbookFactory.create(inputStream);

			workbook.removeSheetAt(1);

			FileOutputStream outputStream = new FileOutputStream(
					"D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn\\File_Actions_Help\\JavaBooks.xlsx");
			workbook.write(outputStream);
			workbook.close();
			outputStream.close();
			System.out.println("Removed");
		} catch (Exception e) {
			System.out.println("Error is from remove_xls(): " + e.toString());
		}
	}

}
