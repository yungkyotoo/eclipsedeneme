package d9;

public class Student {
	String name;// verilieri initialize etmek zorunda değiliz
	int age;
	// static keyword:1) variable static int a 2)veya methodlarda veya 3)blok
	static String nation = "Turkey";

	double not;
	String status;

	static {
		System.out.println("static blok herşeyden önce çalışır ");
	}

	// class a methodlar bu methodlara sınıf üzerinde ulaşılır
	public static void method1Static() {
		System.out.println("public Statik methdod1 çalıştı");
	}

	// Statik olmayan methodlar diğer sınıflardan sadece obje üzerinden ulaşılır
	public void method2Void() {
		System.out.println("public Void  methdod2 çalıştı");
	}

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", not=" + not + ", status=" + status + "]";
	}
}
