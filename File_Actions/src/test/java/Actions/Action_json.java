package Actions;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.StringReader;
import java.io.StringWriter;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;
import javax.json.JsonValue;
import javax.json.JsonWriter;
//import javax.json.stream.JsonParser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Action_json {

//	public static JSONObject jsonObject;
	public static String nameRead;
	public static String fileName="D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn\\File_Actions_Help\\test1.json"; 
	
	public static void main(String[] args) {
		
		try{
			Action_json obj=new Action_json();
//			obj.create_json("101", "Anoop", "NR", "anoop.nr", "HR");
			obj.addDetail_json();
//			obj.update_json();
//			obj.delete_json();
		
			


		}
		catch(Exception e){
			System.out.println("Issue is from main() method "+e.toString());
		}
			
	}
	
	
	/* Creating json file with data>> working successfully */
	private void create_json(String e_id,String e_fname,String e_lastname,String e_email,String e_department){
		try{
			
			//Creating a JSONObject object
			JSONObject jsonObject = new JSONObject();

		      //Inserting key-value pairs into the json object
		      jsonObject.put("ID", e_id);
		      jsonObject.put("First_Name", e_fname);
		      jsonObject.put("Last_Name", e_lastname);
		      jsonObject.put("Email", e_email);
		      jsonObject.put("Department", e_department);
		      
		      JSONObject employeeObject = new JSONObject(); 
		      employeeObject.put("employee", jsonObject);
		      
		      
		      
		      // add second employee
		      JSONObject jsonObject2 = new JSONObject();

		      //Inserting key-value pairs into the json object
		      /*
		      jsonObject2.put("ID", e_id);
		      jsonObject2.put("First_Name", e_fname);
		      jsonObject2.put("Last_Name", e_lastname);
		      jsonObject2.put("Email", e_email);
		      jsonObject2.put("Department", e_department);
		      
		      JSONObject employeeObject2 = new JSONObject(); 
		      employeeObject2.put("employee", jsonObject2);
		      */
		      
		        //Add employees to list
		        JSONArray employeeList = new JSONArray();
		        employeeList.add(employeeObject);
		        //employeeList.add(employeeObject2);
		
			FileWriter file = new FileWriter(fileName);

            file.write(employeeList.toJSONString());
            file.flush();
            file.close();
            System.out.println("Json file created successfully.");
		}

		catch(Exception e){
			
			System.out.println("Issue is from create_json() method "+e.toString());
		}
	}
	
	
	
	/* add details to existing jason. >> working successfully.*/
	private void addDetail_json(){

			try{
				
				JSONParser jsonParser = new JSONParser();
				 Object obj = jsonParser.parse(new FileReader(fileName));
		            JSONArray jsonArray = (JSONArray)obj;

		            System.out.println("Already: "+jsonArray);

		            JSONObject student1 = new JSONObject();
		            student1.put("ID", "200");
		            student1.put("First_Name", "Manes");
		            student1.put("Last_Name", "M");
		            student1.put("Email", "Manesh@gmail.com");
		            student1.put("Department", "HR");
		           
				      JSONObject employeeObject3 = new JSONObject(); 
				      employeeObject3.put("employee", student1);
		            

		            JSONObject student2 = new JSONObject();

		            student2.put("ID", "201");
		            student2.put("First_Name", "A");
		            student2.put("Last_Name", "B");
		            student2.put("Email", "C@gmail.com");
		            student2.put("Department", "HRA");

		            
				      JSONObject employeeObject4 = new JSONObject(); 
				      employeeObject4.put("employee", student2);
				      
			            JSONObject student3 = new JSONObject();
			            student3.put("ID", "200");
			            student3.put("First_Name", "Manes");
			            student3.put("Last_Name", "M");
			            student3.put("Email", "Manesh@gmail.com");
			            student3.put("Department", "HR");
			           
					      JSONObject employeeObject5 = new JSONObject(); 
					      employeeObject5.put("employee1", student3);

		            jsonArray.add(employeeObject3);
		            jsonArray.add(employeeObject4);
		            jsonArray.add(employeeObject5);

		            System.out.println(jsonArray);

		            FileWriter file = new FileWriter(fileName);
		            file.write(jsonArray.toJSONString());
		            file.flush();
		            file.close();
		            System.out.println("Added new data to Json file.");
				
		    }

		catch(Exception e){
			
			System.out.println("Issue is from addDetail_json() method "+e.toString());
		}
	}
	
	private void update_json(){
		try{
//			JSONParser jsonParser = new JSONParser();
//			 Object obj = jsonParser.parse(new FileReader(fileName));
//            JSONArray jsonArray = (JSONArray)obj;
//	            System.out.println("no of objects "+jsonArray.size());
//	            for(int i=0;i<jsonArray.size();i++){
//	            	//jsonArray.getString(i);
//	            }

			 JSONParser parser = new JSONParser();
		        try {
		            Object obj = parser.parse(new FileReader(fileName));
		            JSONArray array = (JSONArray) obj;
		            FileWriter file = new FileWriter(fileName);
		            for (int index = 0; index < array.size(); ++index) {
		                JSONObject jsonObject = (JSONObject) array.get(index);
		                jsonObject.put("First_Name", "Jesmi");
		                file.write(jsonObject.toJSONString());
		                file.flush();
		                if (index == array.size() - 1)
		                    file.close();
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        }

		        
		        
		        
			
		}
		catch(Exception e){
			System.out.println("Issue is from update_json() method "+e.toString());
		}
	}
	
	
	//To remove employee details from json >> working successfully
	private void delete_json(){
		try{
			
	            
			 JSONParser parser = new JSONParser();
		        try {
		            Object obj = parser.parse(new FileReader(fileName));
		            JSONArray array = (JSONArray) obj;
		            FileWriter file = new FileWriter(fileName);
		            for (int index = 0; index < array.size(); ++index) {
		                JSONObject jsonObject = (JSONObject) array.get(index);
		                jsonObject.remove("employee1");
		                file.write(jsonObject.toJSONString());
		                file.flush();
		                if (index == array.size() - 1)
		                    file.close();
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		}
		catch(Exception e){
			System.out.println("Issue is from delete_json() method "+e.toString());
		}
	}

}
