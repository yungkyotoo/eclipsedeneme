package d3;

import java.util.Scanner;

public class task2 {
	//Kullanıcıdan ara sınav ve final notu alnız
    //Ortalama not bilgisini hesaplamak için ara sınavın %40 ve finalin %60 hesaplayınız
    //Eğer Kullanıcını notu 50^nini üzerinde ise pass
    //50'nin altında ise fail
    //80 'nin üzerinde ise good olacak şekilde ekrana yazdırın
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int ara=scanner.nextInt();
		int fin=scanner.nextInt();
		int not=(int) ((ara*0.4)+ (fin*0.6));
		if (not>=50 && not<80) {
			System.out.println("Passed");
		}else if (not>=80) {
			System.out.println("Good");
			
		}else {
			System.out.println("Failed");
		}
	}
}
