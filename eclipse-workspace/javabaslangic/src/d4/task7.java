package d4;

import java.util.Iterator;

public class task7 {
	/*
	 * 1'den 30 'a kadar sayıları sıralayın eğer sayılar 3' bölünürse "üç" 5'e
	 * bölünürse "beş" 15'e bölünürse "onbeş yazdırın"
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {
			if (i % 15 == 0) {
				System.out.print("onbes ");

			}else if (i % 3 == 0) {
				System.out.print("uc ");
				
			}else if (i % 5 == 0) {
				System.out.print("bes ");
			
			}
		else {
			System.out.print(i+" ");
		}}
	}
}
