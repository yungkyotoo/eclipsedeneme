package d13;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
	
	public static void main(String[] args) {
		
		
		
//FIFO: First in First Out 
		
		Queue<String> dayS=new LinkedList<String>(Arrays.asList("pzt","salı","crs","prs","cuma","cmt"));
		
		System.out.println(dayS);
		
		dayS.add("pzr");

		System.out.println(dayS);
		
		for (int i = 0; i <3; i++) {
			dayS.remove();		}
	// ilk eklenen ilk çıkar
		

		System.out.println(dayS);
		System.out.println(dayS.element()); // listenin ilk elemanını verir
		System.out.println("=====================================================================================");
		//Last in First Out
		//Çift taraflı kuyruk
		
		Deque<String>idoDeque=new LinkedList<String>(Arrays.asList("pzt","salı","crs","prs","cuma","cmt"));
		Deque<String>idoDeque2=new ArrayDeque<String>(Arrays.asList("pzt","salı","crs","prs","cuma","cmt"));
		
		System.out.println(idoDeque);
		idoDeque.add("pzr");
		System.out.println(idoDeque);// sona ekledi
		idoDeque.removeLast(); // son elemanı çıkarır
		System.out.println(idoDeque);// sona ekledi
	
		  

			}
		
	}

