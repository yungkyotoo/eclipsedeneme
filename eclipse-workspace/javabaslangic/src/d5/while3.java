package d5;

import java.util.Scanner;

public class while3 {
	
public static void main(String[] args) {
	/*
	3 basamakli 4 ve 9a  tam bolunebilen tam sayilari kaç tane oldugunu print eden code create ediniz.

	 */
	int a=100;
	int counter=0;
	while (a<1000) {
		if (a%4==0 && a%9==0) {
			counter++;
		System.out.print(a +" ");	
		}a++;
	
	} System.out.println("\nbolunen "+counter +" tane vardir");
}
}
