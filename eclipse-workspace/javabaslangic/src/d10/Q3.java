package d10;

public class Q3 {
	public static void main(String[] args) {
		Musteri canMusteri=new Musteri("Can", 1000, "Can Mumcu", "canmmc15@hotmail.com");
		System.out.println(canMusteri.BANKANAME);
		System.out.println(canMusteri.getPersonelMail());
		canMusteri.setPersonelMail("asdasdasd@gmail.com");
		System.out.println(canMusteri.getPersonelMail());
		System.out.println(canMusteri.getBakiye());
		canMusteri.paraEkle(200);
		System.out.println(canMusteri.getBakiye());
		canMusteri.paraCek(1400);
		System.out.println(canMusteri.getBakiye());
		canMusteri.paraCek(400);
		System.out.println(canMusteri.getBakiye());
	}
}
