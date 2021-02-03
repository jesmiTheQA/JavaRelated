package Collections;

import java.util.HashSet;

public class Actions_HashSet {

	HashSet<String> HS=new HashSet<>();
	HashSet<String> HS1=new HashSet<>();
	
	public static void main(String[] args) {
		
		Actions_HashSet obj=new Actions_HashSet();
		obj.HashSet_Creation();
		obj.HashSet_checkAnItem();
		obj.HashSet_removeAnItem();
		obj.HashSet_size();
		obj.HashSet_dispalyUsingLoop();
		obj.HashSet_conatins();
		obj.HashSet_removeAllItems();
		obj.HashSet_empty();

	}
	
	//To display the value in [] >> Working fine
	private void HashSet_Creation(){
		try{
			
			HS.add("Anu");
			HS.add("Manu");
			HS.add("Sinu");
			HS.add("Shinu");
			System.out.println(HS);
			
		}
		catch (Exception e) {
			System.out.println("Error is from HashSet_Creation() "+e.toString());
		}
	}
	
	//To check whether an item exists in a HashSet >> Working
	private void HashSet_checkAnItem(){
		try{
			
			Boolean v1=HS.contains("Anu");
			System.out.println("Whether HS have value ANU: "+ v1);
			
			Boolean v2=HS.contains("Finu");
			System.out.println("Whether HS have value Finu: "+ v2);
		}
		catch(Exception e){
			System.out.println("Error is from HashSet_checkAnItem() "+e.toString());
		}
	}

	//To remove an item from HashSet >> Working
	private void HashSet_removeAnItem(){
		try{
			HS.remove("Shinu");
			System.out.println("After Removal of Shinu remaining values are: "+ HS);
		}
		catch(Exception e){
			System.out.println("Error is from HashSet_removeAnItem() "+e.toString());
		}
	}
	
	//To get size of HashSet >> Working
	private void HashSet_size(){
		try{
			int i=HS.size();
			System.out.println("Size of HS is: "+i);
		}
		catch(Exception e){
			System.out.println("Error is from HashSet_size() "+e.toString());
		}
	}
	
	//To display all the values>> working
	private void HashSet_dispalyUsingLoop(){
		try{
			System.out.println("HS values are: ");
			for(String i: HS){
				System.out.println(i);
			}
		}
		catch(Exception e){
			System.out.println("Error is from HashSet_dispalyUsingLoop() "+e.toString());
		}
	}
	
	//To check contains>> working
	private void HashSet_conatins(){
		try{
			
			Boolean v= HS.contains("Sinu");
			System.out.println("Shinu is available in the list: "+ v);
			
			Boolean v1= HS.contains("Minnu");
			System.out.println("Minnu is available in the list: "+ v1);
		}
		catch(Exception e){
			System.out.println("Error is from HashSet_conatins() "+e.toString());
		}
	}
	
	//To remove all items from HashSet >> Working
	private void HashSet_removeAllItems(){
		try{
			HS.clear();
			System.out.println("After removing all item HS is: "+ HS);
			
		}
		catch(Exception e){
			System.out.println("Error is from removeAllItems() "+e.toString());
		}
	}
	
	private void HashSet_empty(){
		
		 System.out.println("Whether HS is empty: "+ HS.isEmpty());   //Returns true if this set contains no elements.
		 System.out.println("Whether HS1 is empty: "+ HS1.isEmpty());
		 
	}
}
