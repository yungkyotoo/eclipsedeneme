package d4;

import java.util.Iterator;
import java.util.Scanner;

public class task5 {
	/*
	# # # # #
    # # # # #
    # # # # #
    # # # # #
    
    yukarıdaki ekran görüntüsünü elde eden kod yazınız
    kullanicidan satir sayisi alip o kadar sayida yapsin
	 */
 public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int a=scanner.nextInt();
	for (int i=a;i>0;i--) {
		System.out.println("# # # # #");
	}
}
}
