package d11;

public abstract class Parent {
	
	public abstract void  soyad();// child klass mutlaka implement
	
	public void boy() {// bu da miras istediği zaman ulaşabilir
		System.out.println("Baba nın boyu miras ");
	}

}
