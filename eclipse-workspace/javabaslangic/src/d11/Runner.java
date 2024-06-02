package d11;

public class Runner {
	
	public static void main(String[] args) {
		
		Hayvan hayvan=new Hayvan();
		hayvan.ses();
		System.out.println("=============================");
		
		Cat cat=new Cat();
		cat.ses();
		cat.scratch();
		
		System.out.println("=============================");
		
		Dog dog=new Dog();
		dog.ses();
		dog.oyun();
		
		
		System.out.println("=============================");
		
		Hayvan hayvan2=new Cat();
		hayvan2.ses();// polimorfizm kullanılarak hayvan2 objesi cat class'ındaki ovveride edilmiş methodlara ulaşabilir ama cat class'ın kendine ait methodalrına ulaşamaz
		

		Hayvan hayvan3=new Dog();
		hayvan3.ses();
		
		System.out.println("============================= cast");
		//Cat cat3=new Dog();// yatayda bir çeşitlilik yapmak mümkün değil
		
		Cat cat4=(Cat) new Hayvan();
		cat4.ses();
		

	}

	  
	}
