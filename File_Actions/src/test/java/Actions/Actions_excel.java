package Actions;




import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Actions_excel {

	String filePath="D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn\\File_Actions_Help\\JavaBooks.xlsx";
	public static void main(String[] args) {
		
		Actions_excel obj=new Actions_excel();
		obj.createSheets_excel();
//		obj.creatWithDat_XLSX();
//		obj.calculation();
//		obj.aa();

	}
	
	private void creatWithDat_XLSX(){
		try{
			FileInputStream is=new FileInputStream(new File(filePath));
	        Workbook wb = WorkbookFactory.create(is);
			Sheet sh = wb.createSheet("Java Books 2");
	         
		        Object[][] bookData = {
		        		{"Book", "Author", "Price"},
		                {"Head First Java", "Kathy Serria", 79},
		                {"Effective Java", "Joshua Bloch", 36},
		                {"Clean Code", "Robert martin", 42},
		                {"Thinking in Java", "Bruce Eckel", 35},
		        };
		 
		        int rowCount = 0;
		         
		        for (Object[] aBook : bookData) {
		            Row row = sh.createRow(rowCount++);
		             
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
		         
		        FileOutputStream outputStream = new FileOutputStream("D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn/File_Actions_Help/JavaBooks.xlsx");

		            wb.write(outputStream);
			
		}
		catch(Exception e){
			System.out.println("Error is from creatWithDat_XLSX() : "+e.toString());
		}
	}
	
	
	private void createSheets_excel(){
		try{
			
		       // Creating a Workbook from an Excel file (.xls or .xlsx)
			
			FileInputStream is=new FileInputStream(new File(filePath));
	        Workbook workbook = WorkbookFactory.create(is);
//	        is.close();
	        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets ");
	        workbook.createSheet("jhikhjk");
	        
	        
//			XSSFWorkbook xssfworkbook = new XSSFWorkbook();
//			 XSSFSheet sheet = xssfworkbook.createSheet("C Books");
//			 XSSFSheet sheet1 = xssfworkbook.createSheet("C++ Books");
//			 XSSFSheet sheet2 = xssfworkbook.createSheet("Maths Books");
			  FileOutputStream os = new FileOutputStream(filePath);

			  workbook.write(os);		
			  workbook.close();
			  os.close();
	       
		}
		catch(Exception e){
		
			System.out.println("Error is from createSheets_excel(): "+ e.toString());
		}
	}
	
	
	private void calculation(){
		try{
			XSSFWorkbook workbook = new XSSFWorkbook();
		    XSSFSheet sheet = workbook.createSheet("Calculate Simple Interest");
		  
		    Row header = sheet.createRow(0);
		    header.createCell(0).setCellValue("Pricipal");
		    header.createCell(1).setCellValue("RoI");
		    header.createCell(2).setCellValue("T");
		    header.createCell(3).setCellValue("Interest (P r t)");
		      
		    Row dataRow = sheet.createRow(1);
		    dataRow.createCell(0).setCellValue(14500d);
		    dataRow.createCell(1).setCellValue(9.25);
		    dataRow.createCell(2).setCellValue(3d);
		    dataRow.createCell(3).setCellFormula("A2*B2*C2");
		      
		    try {
		        FileOutputStream out =  new FileOutputStream(new File("D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn/File_Actions_Help/formulaDemo.xlsx"));
		        workbook.write(out);
		        out.close();
		        System.out.println("Excel with foumula cells written successfully");
		          
		    } catch (FileNotFoundException e) {
		        e.printStackTrace();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
			
			
		}
		catch(Exception e){
			System.out.println("Error is from aa() "+ e.toString());
		}
	}

}
