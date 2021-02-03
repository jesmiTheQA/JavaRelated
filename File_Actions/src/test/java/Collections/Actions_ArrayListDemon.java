package Collections;

import java.util.ArrayList;

public class Actions_ArrayListDemon {

	public static void main(String[] args) {

		Actions_ArrayListDemon obj = new Actions_ArrayListDemon();

		ArrayList<Object> ar = new ArrayList<Object>();

		obj.getSize(ar);
		obj.addDatatoArrayList(ar);
		obj.printAllValues(ar);
		obj.getSize(ar);
		obj.printFormParticularIndex(ar);
		obj.lowsetIndex();
		obj.hightestIndexNow(ar);
		obj.addMoreValues(ar);
		obj.getSize(ar);
		obj.genericIntegerArray();
		obj.genericStringArray();

	}

	// to add elements to array List
	public void addDatatoArrayList(ArrayList<Object> ar1) {
		ar1.add(1);
		ar1.add("anu");
		ar1.add(1.3);
		ar1.add(true);
		ar1.add('&');
		ar1.add(false);
		System.out.println("Data aaded to ArrayList");
	}

	// To print all values
	public void printAllValues(ArrayList<Object> ar1) {
		System.out.println("To print all values: " + ar1);
	}

	// To get value from particular index
	public void printFormParticularIndex(ArrayList<Object> ar1) {
		System.out.println("To get value from particular index: " + ar1.get(1));
	}

	// To get the size
	public void getSize(ArrayList<Object> ar1) {
		System.out.println("To get the size: " + ar1.size());
	}

	// to get lowest Index
	public void lowsetIndex() {
		System.out.println("Lowest index is: " + 0);
	}

	// To get highest Index
	public void hightestIndexNow(ArrayList<Object> ar1) {
		int size = ar1.size();
		System.out.println("Highest index is: " + (size - 1));
	}

	// Add more values
	public void addMoreValues(ArrayList<Object> ar1) {
		ar1.add(5.3);
		ar1.add(false);
		System.out.println("More values added: " + ar1);
	}

	// generic type of arraylists
	public void genericIntegerArray() {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(20);
		a1.add(11);
		System.out.println("Integer generic ArrayList a1: " + a1);

	}

	// generic type of arraylists
	public void genericStringArray() {
		ArrayList<String> b1 = new ArrayList<String>();
		b1.add("ABC");
		b1.add("sdfsdfs");
		System.out.println("String generic ArrayList b1: " + b1);

	}

}
