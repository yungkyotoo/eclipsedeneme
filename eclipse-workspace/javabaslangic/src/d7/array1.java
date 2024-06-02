package d7;



public class array1 {
public static void main(String[] args) {
	
	int []sumarr = new int[5];
	int []sumarr2= {3,5,7,2,9,10,17,20,25,13};
	int sum=0;
	//System.out.println(sumarr2.length);
	for (int i = 0; i < sumarr2.length; i++) {
		System.out.print(sumarr2[i]+" ");
		sum+=sumarr2[i];
		
	}
	System.out.println("\n"+sum);
	int sumcift=0;
	int sumtek=0;
	//dizideki tek sayilarin toplamini yazdirin
	for (int i = 0; i < sumarr2.length; i++) {
		if (sumarr2[i]%2==0) {
		sumcift+=sumarr2[i];
		}else {
			sumtek+=sumarr2[i];
		}
		
	}System.out.println(sumcift);
	System.out.println(sumtek);
}
}
