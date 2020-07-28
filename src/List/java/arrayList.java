package List.java;

import java.util.ArrayList;
import java.util.List;

public class arrayList {

	public static void main(String[]args) {
		
		List<String>arraylist=new ArrayList<String>();
		
		arraylist.add("tata");
		arraylist.add("Maruthi");
		arraylist.add("Nexa");
		arraylist.add("Kia");
		arraylist.add("Hyundai");
		arraylist.add("verna");
		
		System.out.println(arraylist);
		
		//to find size
		int size =arraylist.size();
		System.out.println(arraylist.size());
		
		//to get particular value
		String get =arraylist.get(3);
		System.out.println(arraylist.get(3));
		
		//to find the index of the value
		System.out.println(arraylist.lastIndexOf("hyundai"));
		
		//for loop
		for(int i=0;i<=arraylist.size();i++) {
			System.out.println(arraylist.get(i));
			
		}
		
		
		
	}
}
