package d10;

public class Musteri extends Banka{
	

    // Müşteriye özel değişkenler
    private String musteriIsmi;

    // Parametreli kurucu (Müşteri nesnesi oluşturmak için)
    public Musteri(String musteriIsmi, int bakiye, String personelName, String personelMail) {
        super(bakiye, personelName, personelMail, bakiye); // Superclass'ın kurucusunu çağır
        this.musteriIsmi = super.getPersonelName();
    }

    // Müşterilerin isimlerini ve bakiyelerini görüntüleyen metod
    public void musteriBilgileriniGoster() {
        System.out.println("Müşteri İsmi: " + musteriIsmi);
        System.out.println("Bakiye: " + super.getBakiye());
    }

    // Müşterilerin maillerini değiştiren metod
    public void mailDegistir(String yeniMail) {
        setPersonelMail(yeniMail); 
        System.out.println("Yeni mail adresi: " + yeniMail);
    }

    // Müşterilerin para eklemesini sağlayan metod
    public void paraEkle(int miktar) {
        if (miktar > 0) {
        	setBakiyeekle(miktar);
          
            System.out.println(miktar + "₺ hesabınıza eklendi. Yeni bakiyeniz: " + getBakiye());
        } else {
            System.out.println("Para ekleme işlemi için miktar 0'dan büyük olmalıdır.");
        }
    }

    // Müşterilerin para çekmesini sağlayan metod
    public void paraCek(int miktar) {
        if (miktar > 0 && miktar <= getBakiye()) {
            setBakiyeCıkar(miktar);
            System.out.println(miktar + "₺ hesabınızdan çekildi. Kalan bakiyeniz: " + getBakiye());
        } else {
            System.out.println("Yetersiz bakiye veya hatalı işlem miktarı.");
        }
    }
}
	
	

