package Actions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Action_flatFile {

	String fileName1 = "D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn\\File_Actions_Help/newFile1.csv";
	String fileName2 = "D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn\\File_Actions_Help/newFile2.txt";
	public static void main(String[] args) {
		try{
			Action_flatFile obj=new Action_flatFile();
//			obj.creation_flatfile();
//			obj.addData_flatfile();
//			obj.delete_flatfile();
			obj.update_flatfile();
			
		}
		catch(Exception e){
			System.out.println("Issue is from main() method "+e.toString());
		}
	}
	
	//To create a flat file >> Working as expected
	private void creation_flatfile(){
		try{
			
		        Path path1 = Paths.get(fileName1);
		        Path path2 = Paths.get(fileName2);


		        // default, create, truncate and write to it.
		        try (BufferedWriter writer1 =Files.newBufferedWriter(path1, StandardCharsets.UTF_8)) {

		            writer1.write("Java_1, C++_1,C_1 ");
		            writer1.write("\r\n");

		            writer1.write("Java_2, C++_2,C_2 ");
		            writer1.write("\r\n");
		            
		            writer1.write("Java_3, C++_3,C_3 ");
		            writer1.write("\r\n");
		            
		            System.out.println("CSV file created successfully.");

		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		        try (BufferedWriter writer2 =Files.newBufferedWriter(path2, StandardCharsets.UTF_8)) {
		            writer2.write("Maths1, Science1, Physics1");
		            writer2.write("\r\n");
		            
		            writer2.write("Maths2, Science2, Physics2");
		            writer2.write("\r\n");
		            
		            writer2.write("Maths3, Science3, Physics3");
		            writer2.write("\r\n");
		            System.out.println("Text file created successfully.");

		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		}
		catch(Exception e){
			System.out.println("Issue is from creation_flatfile() method "+e.toString());
		}
	}
	
	//To add data to existing flat file >> Working as expected
	private void addData_flatfile(){
		try{
			
			
			 Path path1 = Paths.get(fileName1);
		     Path path2 = Paths.get(fileName2);
		     try {
		    	
		    	    Files.write(Paths.get(fileName1), "PHP".getBytes(), StandardOpenOption.APPEND);
		    	    System.out.println("Added data to CSV file uccessfully.");
		    	}catch (IOException e) {
		    	    //exception handling left as an exercise for the reader
		    	}

		     try {
		    	    Files.write(Paths.get(fileName2), "Chemistory".getBytes(), StandardOpenOption.APPEND);
		    	    System.out.println("Added data to text file uccessfully.");
		    	}catch (IOException e) {
		    	    //exception handling left as an exercise for the reader
		    	}

		        
		}
		catch(Exception e){
			System.out.println("Issue is from addData_flatfile() method "+e.toString());
		}
		
	}
	
	private void update_flatfile(){
		try{
			
			File inputFile = new File(fileName1);
//			File tempFile = new File("myTempFile.txt");

			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			

			String lineToRemove = "C_1";
			String currentLine;
			String newData="";
			

			while((currentLine = reader.readLine()) != null) {
			    // trim newline when comparing with lineToRemove
			    String trimmedLine = currentLine.trim();
			    if(trimmedLine.equals(lineToRemove))
			    {
//			    	System.out.println("Yes");
//			    	System.out.println(trimmedLine);
//			    	 Files.write(Paths.get(fileName1), ".Net".getBytes(), StandardOpenOption.APPEND);
			    	
			    }
			    else{
			    	System.out.println("Yes1");
			    	System.out.println(trimmedLine);
			    	newData+=currentLine+ System.getProperty("line.separator");
			   
			    }
			}
			newData+=".Net";
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName1));
			writer.write(newData);
			writer.close(); 
			reader.close(); 

			
			
//			For Txt file	
			
				File inputFile2 = new File(fileName2);

				BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
				

				String lineToRemove1 = "Physics1";
				String currentLine2;
				String newData2="";
				

				while((currentLine2 = reader2.readLine()) != null) {
				    // trim newline when comparing with lineToRemove
				    String trimmedLine2 = currentLine2.trim();
				    if(trimmedLine2.equals(lineToRemove1))
				    {
				    	System.out.println("Yes");
				    	System.out.println(trimmedLine2);
				    	
				    }
				    else{
				    	System.out.println("Yes1");
				    	System.out.println(trimmedLine2);
				    	newData2+=currentLine2+ System.getProperty("line.separator");
				   
				    }
				}
				newData2+="LCM";
				BufferedWriter writer2 = new BufferedWriter(new FileWriter(fileName2));
				 writer2.write(newData2);
				writer2.close(); 
				reader2.close(); 
			
			
		}
		catch(Exception e){
			System.out.println("Issue is from update_flatfile()() method "+e.toString());
		}
	}
	
	private void delete_flatfile(){
		try{
			
			File inputFile = new File(fileName1);

			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			

			String lineToRemove = "PHP";
			String currentLine;
			String newData="";
			

			while((currentLine = reader.readLine()) != null) {
			    // trim newline when comparing with lineToRemove
			    String trimmedLine = currentLine.trim();
			    if(trimmedLine.equals(lineToRemove))
			    {
			    	System.out.println("Yes");
			    	System.out.println(trimmedLine);
			    }
			    else{
			    	System.out.println("Yes1");
			    	System.out.println(trimmedLine);
			    	newData+=currentLine+ System.getProperty("line.separator");
			   
			    }
			}
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName1));
			 writer.write(newData);
			writer.close(); 
			reader.close(); 
			
//		For Txt file	
			
			File inputFile2 = new File(fileName2);

			BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
			

			String lineToRemove2 = "Chemistory";
			String currentLine2;
			String newData2="";
			

			while((currentLine2 = reader2.readLine()) != null) {
			    // trim newline when comparing with lineToRemove
			    String trimmedLine2 = currentLine2.trim();
			    if(trimmedLine2.equals(lineToRemove2))
			    {
			    	System.out.println("Yes");
			    	System.out.println(trimmedLine2);
			    }
			    else{
			    	System.out.println("Yes1");
			    	System.out.println(trimmedLine2);
			    	newData2+=currentLine2+ System.getProperty("line.separator");
			   
			    }
			}
			BufferedWriter writer2 = new BufferedWriter(new FileWriter(fileName2));
			 writer2.write(newData2);
			writer2.close(); 
			reader2.close(); 

			
		}
		catch(Exception e){
			System.out.println("Issue is from delete_flatfile()() method "+e.toString());
		}
	}
	
	
}
