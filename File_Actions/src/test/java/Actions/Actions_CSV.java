package Actions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class Actions_CSV {

	public static void main(String[] args) {
		
		Actions_CSV obj=new Actions_CSV();
		obj.create_csv();
//		obj.addTo_csv();
//		obj.update_csv(4,0,"Sani");
//		obj.delete_csvfile();

	}
	
	
	/* To create a CSV file >> working successfully*/
	private void create_csv(){
		try{
			
			 File file = new File("D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn/File_Actions_Help/file.csv"); 
			 // create FileWriter object with file as parameter 
		        FileWriter outputfile = new FileWriter(file); 
		  
		        // create CSVWriter object filewriter object as parameter 
		        CSVWriter writer = new CSVWriter(outputfile); 
		  
		        // adding header to csv 
		        String[] header = { "Name", "Class", "Marks" }; 
		        writer.writeNext(header); 
		  
		        // add data to csv 
		        String[] data1 = { "Aman", "10", "620" }; 
		        writer.writeNext(data1); 
		        String[] data2 = { "Suraj", "10", "630" }; 
		        writer.writeNext(data2); 
		  
		        // closing writer connection 
		        writer.close();
		        System.out.println("CSV file created successfully");
		}
		catch(Exception e){
			System.out.println("Issue is from create_csv() method "+e.toString());
		}
	}
	
	
	/* Add new data to existing csv file. >> working successfully  */
	private void addTo_csv(){
		try{
			
			
	      File file = new File("D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn/File_Actions_Help/file.csv"); 
	      FileWriter fstream1 = new FileWriter(file, true);
	      CSVWriter writer = new CSVWriter(fstream1); 
	      
		
	      // add data to csv 
	        String[] data1 = { "Aman1", "100", "720" }; 
	        writer.writeNext(data1); 
	        
	        String[] data2 = { "Aman1", "100", "720" }; 
	        writer.writeNext(data2); 
	        
	        
	        writer.close();
	        System.out.println("Data is updated to existing CSV file");
		}
		catch(Exception e){
			System.out.println("Issue is from addTo_csv() method "+e.toString());
		}
	}
	
	/* To update data in existing csv file. >> working successfully  */
	private void update_csv(int row,int column,String replace){
		try{
			
			 File file = new File("D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn/File_Actions_Help/file.csv"); 
		      FileWriter fstream1 = new FileWriter(file, true);
		  

		   // Read existing file 
		   CSVReader reader = new CSVReader(new FileReader(file), ',');
		   List<String[]> csvBody = reader.readAll();
		   // get CSV row column  and replace with by using row and column
		   csvBody.get(row)[column] = replace;
		   reader.close();

		   // Write to CSV file which is open
		   CSVWriter writer = new CSVWriter(new FileWriter(file), ',');
		   writer.writeAll(csvBody);
		   writer.flush();
		   writer.close();
		   System.out.println(" In "+row+"th row "+column+"th column value is updated to "+replace);
		      
			
		}
		catch(Exception e){
			System.out.println("Issue is from update_csv() method "+e.toString());
		}
	}
	
	
	/* To delete the file itself. >> working correctly*/
	private void delete_csvfile(){
		try{
			
			File file = new File("D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn/File_Actions_Help/file.csv"); 
	          
	        if(file.delete()) 
	        { 
	            System.out.println("File deleted successfully"); 
	        } 
	        else
	        { 
	            System.out.println("Failed to delete the file"); 
	        } 
		}
		catch(Exception e){
			
			System.out.println("Issue is from delete_csvfile() method "+e.toString());
		}
	}

}
