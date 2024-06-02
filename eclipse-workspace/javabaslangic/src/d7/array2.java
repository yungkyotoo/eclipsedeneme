package d7;

import java.util.Arrays;

public class array2 {
public static void main(String[] args) {

	int []sumarr= {3,5,7,2,9,10,17,20,25,13};
	int []sumarr2= {3,85,73,22,91,106,173,20,25,13};
	Arrays.sort(sumarr2);
	can(sumarr2);
	System.out.println(Arrays.toString(can(sumarr)));
	Arrays.sort(sumarr);
	//System.out.println(Arrays.toString(sumarr));
	System.out.println("min="+sumarr[0]+" "+"max="+sumarr[sumarr.length-1]);
	int []buyukarr= new int [sumarr.length];
	for (int i = sumarr.length-1,j=0; i >= 0; i--,j++) {
		buyukarr[j]=sumarr[i];
		
	}System.out.println(Arrays.toString(buyukarr));
}
public static int[] can (int arr[]) {
	int []buyukarr= new int [arr.length];
	for (int i = arr.length-1,j=0; i >= 0; i--,j++) {
		buyukarr[j]=arr[i];
		
	}System.out.println(Arrays.toString(buyukarr));
	
	return (buyukarr);
}

}
