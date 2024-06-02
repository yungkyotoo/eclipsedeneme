package d7;

import java.util.Arrays;

public class string1 {
public static void main(String[] args) {
	String aString="Hello";
	char []c=aString.toCharArray();
	System.out.println(Arrays.toString(c));
	String []d=aString.split("");
	System.out.println(Arrays.toString(d));
	for (int i = 0; i < d.length; i++) {
		d[i]+="a";
		
	}System.out.println(Arrays.toString(d));
}
}
