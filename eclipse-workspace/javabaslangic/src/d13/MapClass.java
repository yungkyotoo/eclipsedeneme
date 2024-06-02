package d13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapClass {
	
	public static void main(String[] args) {
		//Key value mantığı il verileri listelememiz sağlar
		
		Map<Integer,String> studentMap=new HashMap<Integer, String>();
		
		studentMap.put(120, "Asya");
		
		studentMap.put(121, "Can");
		
		studentMap.put(122, "Yusuf");
		studentMap.put(122, "Yasin");
		studentMap.put(123, "Can");

		studentMap.put(124, "Yusufaa");
		studentMap.put(125, "Yasinaa");
		studentMap.put(12, "Canan");
		
		System.out.println(studentMap);
		
	
		System.out.println(studentMap.keySet());// Keyler unique set (küme) şeklinde tutar
		
		for(String each:studentMap.values()) { // map'teki value değerlerini verir
			System.out.println(each);
		
		}
		System.out.println(studentMap.entrySet());//listenin kendisini yazdırır
		System.out.println(	studentMap.get(121));// Key değeri yazılarak değeri dönderir
		
		studentMap.remove(121);
		
		System.out.println(studentMap);
		
		for(Integer i:studentMap.keySet())
		{
			if(i>122) {
			System.out.println(	studentMap.get(i));
			}
		}
		
		
		
		
		
		
	}

}
