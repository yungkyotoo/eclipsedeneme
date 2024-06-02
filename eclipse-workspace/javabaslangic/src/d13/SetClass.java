package d13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
	
	public static void main(String[] args) {
		//Setlerin genel çalışma mantığı kümelere benzer .Tekrar edilen verileri listede tutmaz
		
		//HashSet:Sıralama dikkat etmez
		  Set<String> students = new HashSet<>();
		  
		  students.add("Asya");
		  students.add("Can");
		  students.add("Yusuf");
		  //students.add("Yusuf");// tekrar eden elemanları listeye eklemez
		  
		  System.out.println(students);
		  students.remove("Asya");// silinicek isim girildiğinde
		  System.out.println(students);
		  System.out.println(students.size());
		  
	

	       
			
		//LinkedHashSet// sıralamaya dikkat eder
		  
		 Set<String> meyveSet= new LinkedHashSet<String>(Arrays.asList("elma","portakal","muz"));
		  
		 for(String herbir:meyveSet) {
			 System.out.println(herbir);
		 }
		  
	
		//TreeSet: 
		 
		 Set<Integer> numberSet=new TreeSet<Integer>(Arrays.asList(1,18,8,45,7,85,8));		 
		 
		 System.out.println(numberSet);
		
	}

}
