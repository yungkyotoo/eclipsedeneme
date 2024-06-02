package d11;

public interface Aunt {
	
	
	final static int tc=12345;// final  ve static yazsak da yazmasak da değimez default olarak gelir
	
	public abstract void  aunt_sac();// child klass mutlaka implement
	
	/*public void boy() {// bu da miras istediği zaman ulaşabilir
		System.out.println("Baba nın boyu miras ");
	}*/ //interface de somut body li method olamaz 
	
	
	void uncle_method(); // soyut abstarct method  public abstract void uncle_method();
	
	
	public static void aunt_static_method() { // 
		System.out.println("halanın statik methodu");
	}
	
	
	public default void aunt_default ()
	{
		System.out.println("halanın default methodu");
	}

}
