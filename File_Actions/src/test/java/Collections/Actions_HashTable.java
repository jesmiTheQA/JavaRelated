package Collections;

import java.util.Hashtable;
import java.util.Map;

public class Actions_HashTable {

	Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
	
	public static void main(String[] args) {
		
		Actions_HashTable obj=new Actions_HashTable();
		obj.Hashtable_creation();
		obj.Hashtable_dispaly();
		obj.Hashtable_dispaly1();
		obj.Hashtable_remove();
		obj.Hashtable_ifMatch();
		obj.Hashtable_putIfAbsent();
		obj.Hashtable_removeAll();
	}
	
	
	//To created HashTable
	private void Hashtable_creation(){
		 ht.put(100,"Amit");  
		 ht.put(102,"Ravi");  
		 ht.put(101,"Vijay");  
		 ht.put(103,"Rahul");  
		 System.out.println("HashTable created successfully");
	}
	
	//To display in {} >> Working
	private void Hashtable_dispaly(){
		System.out.println("HT values are: "+ht);
	}
	
	//To display in {} >> Working
	private void Hashtable_dispaly1(){
		System.out.println();
		 for(Map.Entry m:ht.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
	}
	
	//To remove an item >> Working
	private void Hashtable_remove(){
		ht.remove(101);
		System.out.println("After removel HT values are: "+ht);
	}
	
	
	//if 1st vlue is not existing then show the 2nd value
	private void Hashtable_ifMatch(){
		System.out.println(ht.getOrDefault(100, "Exist"));
		System.out.println(ht.getOrDefault(101, "Not Exist"));
	}
	
	private void Hashtable_putIfAbsent(){
		ht.putIfAbsent(101, "Shinoy");
		System.out.println("After updation HT values are: "+ht);
	}
	private void Hashtable_removeAll(){
		ht.clear();
		System.out.println("After claer all HT values are: "+ht);
	}

}
