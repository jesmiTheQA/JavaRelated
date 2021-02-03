package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Actions_LinkedList {

	LinkedList<String> LK=new LinkedList<>();
	public static void main(String[] args) {
		
		Actions_LinkedList obj=new Actions_LinkedList();
		obj.LinkedList_addindData();
		obj.LinkedList_addData2();
		obj.LinkedList_remove();
		obj.LinkedList_addFirst();
		obj.LinkedList_addLast();
		obj.LinkedList_contains();
		obj.LinkedList_Decending();
		obj.LinkedList_First_LastElements();
		obj.LinkedList_removeFirst();
		obj.LinkedList_removeAll();
		
	}
	
	private void LinkedList_addindData(){
		
		LK.add("Anith");
		LK.add("Sanith");
		LK.add("Binith");
		LK.add("Smith");
		System.out.println("LK values are: "+LK);
	}
	

	
	private void LinkedList_remove(){
		LK.remove("Smith");
		System.out.println("After one Removal >> LK values are: "+LK);
	
	}
	
	private void LinkedList_addData2(){
		LK.add(3, "Manoj");
		System.out.println("LK values are: "+LK);
	}
	
	private void LinkedList_addFirst(){
		LK.addFirst("Firester");
		System.out.println("AddFirst>> LK values are: "+LK);
	}
	

	private void LinkedList_addLast(){
		LK.addLast("Laster");
		System.out.println("AddLast>> LK values are: "+LK);
	}
	
	private void LinkedList_contains(){
		Boolean b1=LK.contains("Laster");
		System.out.println("Whether 'Laster' is availble in LK: "+ b1);
		Boolean b2=LK.contains("Blaster");
		System.out.println("Whether 'Blaster' is availble in LK: "+ b2);
	}
	
	
	private void LinkedList_Decending(){
		
		Iterator x =LK.descendingIterator();
		System.out.println("In descending order");
		while (x.hasNext()) { 
            System.out.println("Value is : "
                               + x.next()); 
        }
	}
	
	private void LinkedList_First_LastElements(){
		System.out.println("First element is LK is: "+ LK.getFirst()); 
		System.out.println("Last element is LK is: "+ LK.getLast());
	}
	
	
	private void LinkedList_removeFirst(){
		LK.removeFirst();
		System.out.println("after removal of first item: "+ LK);
	}
	private void LinkedList_removeAll(){
		LK.clear();
		System.out.println("After Clearing LK values are: "+LK);
	}

}
