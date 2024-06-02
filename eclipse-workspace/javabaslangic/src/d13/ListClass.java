package d13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClass {
	public static void main(String[] args) {
		
		//sıaralamayı korur 
		
		List <String> str = new ArrayList<>();
		
		str.add("ali");
		str.add("asya");
		
		System.out.println(str);
		
		
		str.set(0,"can");
		
		
		System.out.println(str);
		
		
		System.out.println(str.get(1));
		
		
		LinkedList<String> str2=new LinkedList<String>();		
		
		str2.add("asya");
		str2.add("ali");
		str2.add("can");
		str2.addFirst("veli");// 
		str2.addLast("zeynep");
		
		System.out.println(str2);
	}
	// Collection
	// List
	// ArrayList
	// LİnkedList


}
