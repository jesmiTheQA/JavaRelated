package Collections;

import java.util.ArrayList;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class Actions_MultiMap {

	 Multimap<String,String> multimap = ArrayListMultimap.create();
	 
	public static void main(String[] args) {
		
		Actions_MultiMap obj=new Actions_MultiMap();
		obj.MultiMap_Creation();
		obj.MultiMap_add();
		obj.MultiMap_addifnot();
		obj.Multmap_putIfAbsent();
		obj.Multmap_containsKey();
		obj.Multmap_containsValue();
		obj.Multmap_containsKeyValue();
		obj.Multmap_isEmpty();
		obj.Multmap_size();
		obj.Multmap_removeAll();
		obj.Multmap_Clear();
	}
	
	private void MultiMap_Creation(){
		
		 multimap.put("lower", "a");
	      multimap.put("lower", "b");
	      multimap.put("lower", "c");
	      multimap.put("lower", "d");
	      multimap.put("lower", "e");

	      multimap.put("upper", "A");
	      multimap.put("upper", "B");
	      multimap.put("upper", "C");
	      multimap.put("upper", "D");
	      
	      for (String lastName : multimap.keySet()) {
				System.out.println(lastName + ": " + multimap.get(lastName));
			}
	      System.out.println("**************");
	}
	
	
	private void MultiMap_add(){
		if (multimap.get("Number") == null)
			multimap.putAll("Number", new ArrayList<String>());
		multimap.get("Number").add("1");
		for (String lastName : multimap.keySet()) {
			System.out.println(lastName + ": " + multimap.get(lastName));
		}
		 System.out.println("**************");
	}
	
	private void MultiMap_addifnot(){
		if (multimap.get("upper") == null)
			multimap.putAll("upper", new ArrayList<String>());
		multimap.get("upper").add("E");
		for (String lastName : multimap.keySet()) {
			System.out.println(lastName + ": " + multimap.get(lastName));
		}
		 System.out.println("**************");
	}

	private void Multmap_putIfAbsent(){
		if (multimap.get("Number") == null)
			multimap.putAll("Number", new ArrayList<String>());

		// if value is absent, insert it
		if (!multimap.get("Number").contains("2")) {
			multimap.get("Number").add("2");
		}
		
		System.out.println("Details from putIfAbsent: ");
		for (String lastName : multimap.keySet()) {
			System.out.println(lastName + ": " + multimap.get(lastName));
		}
		 System.out.println("**************");
	}
	
	
	private void Multmap_containsKey(){
		Boolean a= multimap.containsKey("Number");
		System.out.println("If Number key contains in multimap:"+a);
		
		Boolean a1= multimap.containsKey("Number1");
		System.out.println("If Number1 key contains in multimap:"+a1);
		System.out.println("**************");
	}
	
	private void Multmap_containsValue(){
		Boolean a=multimap.containsValue("a");
		System.out.println("If a values contains in multimap:"+a);
		
		Boolean a1=multimap.containsValue("j");
		System.out.println("If j values contains in multimap:"+a1);
		System.out.println("**************");
	}
	
	private void Multmap_containsKeyValue(){
		Boolean a= multimap.containsEntry("Number", "1");
		System.out.println("Whether in Key number 1 is exist: "+a );
		Boolean a1= multimap.containsEntry("Number", "11");
		System.out.println("Whether in Key number 11 is exist: "+a1 );
		System.out.println("**************");
	}
	
	
	private void Multmap_isEmpty(){
		Boolean a=multimap.isEmpty();
		System.out.println("multimap is Empty: "+ a);
		System.out.println("**************");
	}
	
	
	private void Multmap_size(){
		System.out.println("multimap size is: "+multimap.size());
		System.out.println("**************");
	}
	
	private void Multmap_removeAll(){
		multimap.removeAll("Number");
		 for (String lastName : multimap.keySet()) {
				System.out.println(lastName + ": " + multimap.get(lastName));
			}
	      System.out.println("**************");
	}
	
	private void Multmap_Clear(){
		multimap.clear();
		
		System.out.println("after clear values:");
		for (String lastName : multimap.keySet()) {
			System.out.println(lastName + ": " + multimap.get(lastName));
		}
		System.out.println("**************");
	}
}
