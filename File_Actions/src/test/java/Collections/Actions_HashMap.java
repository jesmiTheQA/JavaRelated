package Collections;

import java.util.HashMap;

public class Actions_HashMap {

	HashMap<String, String> capitalCities = new HashMap<String, String>();
	HashMap<String,Integer> HM1=new HashMap<String,Integer>();
	
	public static void main(String[] args) {
		
		Actions_HashMap obj=new Actions_HashMap();
//		obj.HashMap_creation();
//		obj.HashMap_dispaly();
//		obj.HashMap_empty();
//		obj.HashMap_keyidex();
//		obj.HashMap_remove();
//		obj.HashMap_size();
//		obj.HashMap_dispaly1();
//		obj.HashMap_copy();
//		obj.HashMap_keys();
//	    obj.HashMap_values();
//	    obj.HashMap_keysValues();
//	    obj.HashMap_removeAll();
//	    obj.HashMap_another();
//	    obj.HashMap_contains();
	   String s="asdasdasdsfdfsdfsdfsdfsdfsdfsdfsdreghghghjggjhgjghjgjgjhvghjvgjhgjhgjhgfdsjhfgsdjfhgsdjfhgsdfjhsgdfsjhdgfsdjhfgsdjfhsgdfhsdjfgsdkjfhgsdfkjshdfgsdjhfgsdkjfhsgdfkjhsdgfsdjhfgsdjfhsdgfjsdgfhjsdfgsdjhfgsdkjfhsgdfkhjsdgfsdjhfgdsjhfgsdfhjsdgfhjsdgfsdkjhfgsdjkfhsgdfkjgdsfkjhsdgfksdjgfsdjhfgsdjfhgdsfhsjdgfksdjhfgdsjhfgdsfhjgsdjhfgsdjhfgsdjhfgsdjhfgsdhjfgsdjfhgsdfjhsdgfsjdgfdsjhfgdsjhfgsdjfhsdgfksjhdgfshwrwerwerwerwerwerwerwerwerwerewrweerewrwerwerewrewrewrewrewrwerewrwerewrewrewrewrewrewrewrewrwerwerewrewrewrewrewrwerewrewrewrewrewrewrewrewrewrwerwerwerwerwerwerewrwerewrewrewrewrwerwerewrewrwerwerfsdfsdfsdfsdf@gadfsdfdsdfsdmail.com";
System.out.println(s.length());
	}
	
	//To create a HashMap >> Working
	private void HashMap_creation(){
		try{
			
		    // Add keys and values (Country, City)
		    capitalCities.put("England", "London");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    System.out.println("HahMap created successfully.");
		}
		catch(Exception e){
			System.out.println("Error is from HashMap_creation() "+e.toString());
		}
	}
	
	//To show in [] >> Working
	private void HashMap_dispaly1(){
		System.out.println("Entry set Keys & values shown in []: "+capitalCities.entrySet());
	}
	
	//To check empty or not >> working
	private void HashMap_empty(){
		try{
			
			Boolean n=capitalCities.isEmpty(); //Returns true if the map is empty.
		    System.out.println("capitalCities conatin any value: "+ n);
		    
		    HashMap<String, String> cap = new HashMap<String, String>();
		    Boolean n1=cap.isEmpty(); //Returns true if the map is empty.
		    System.out.println("cap conatin any value: "+ n1);
		    

		}
		catch(Exception e){
			System.out.println("Error is from HashMap_empty() "+e.toString());
		}
		
	}
	
	//To get value based on key >> working
	private void HashMap_keyidex(){
		System.out.println("The value corresponding to key idex England is:  "+ capitalCities.get("England"));
	}
	
	//To remove an item >>working
	private void HashMap_remove(){
	    System.out.println("Remove the value corresponding to key idex England: "+capitalCities.remove("England"));
	}
	
	//To show within { } >> working
	private void HashMap_dispaly(){
		try{
			System.out.println("HashMap values are: "+capitalCities);
		}
	    catch(Exception e){
	    	System.out.println("Error is from HashMap_dispaly() "+e.toString());
	    }
	}

	//To dispaly size >> working
	private void HashMap_size(){
		System.out.println("HashMap size is: "+ capitalCities.size());
	}
	
	//To copy values fro one HasMap to Another HashMap >> Working
	private void HashMap_copy(){
		HashMap<String, String> capitalCities1 = new HashMap();
	    capitalCities1.put("Number", "1");
	    capitalCities1.putAll(capitalCities);
	    System.out.println("Entry set Keys & values shown in []: "+capitalCities1.entrySet());

	}
	
	//To dispaly all the Keys using loop >> working
	private void HashMap_keys(){
	    System.out.println("The keys are: ");
	    for (String i : capitalCities.keySet()) {
	    	  System.out.println(i);
	    	}
	    System.out.println();

	}
	
	//To dispaly all the values using loop >> working
	private void HashMap_values(){

	    System.out.println("The values are: ");
	    for(String i : capitalCities.values()){
	    	System.out.println(i);
	    }

	}
	
	   //To get the key & values >> working
	private void HashMap_keysValues(){
		System.out.println();
	    System.out.println("To get the key & values");
	    for(String i: capitalCities.keySet()){
	    	System.out.println( i +" : "+ capitalCities.get(i));
	    }
	}
	
	//To remove all values >> working
	private void HashMap_removeAll(){
		capitalCities.clear();	    
	    System.out.println("After removal key & Values from HashMap: "+ capitalCities);

	}
	
	//Create different type of HashMap >> working
	private void HashMap_another(){
	    HM1.put("A", 1);
	    HM1.put("B", 1);
	    HM1.put("c", 1);
	    HM1.put("D", 2);
	    HM1.put("A", 0);
	    for(String i : HM1.keySet()){
	    	System.out.println(i +":"+ HM1.get(i));
	    }

	}
	
	//To check contains >> working
	private void HashMap_contains(){
		Boolean V=HM1.containsKey("A");
		if(V.equals(true)){
			System.out.println("Key A is avilable in HM1");
		}
		
		Boolean V1=HM1.containsKey("E");
		if(V1.equals(true)){
			System.out.println("Key E is avilable in HM1");
		}
		else{
			System.out.println("Key E is not avilable in HM1");
		}
	}
    

	
	






}
