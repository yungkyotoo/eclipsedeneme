package d12;

import java.util.HashMap;
import java.util.Map;

public class map {
	
	
 public static void main(String[] args) {
	
	 Map<String, String>urunlerMap= new HashMap<String, String>();
	 
	 urunlerMap.put("pzt", "patlican");
	 urunlerMap.put("sal", "makarna");
	 urunlerMap.put("crs", "kofte");
	 urunlerMap.put("prs", "brokoli");
	 System.out.println(urunlerMap.keySet());
	 System.out.println(urunlerMap.values());
	 System.out.println(urunlerMap.get("pzt"));
 
}
}
