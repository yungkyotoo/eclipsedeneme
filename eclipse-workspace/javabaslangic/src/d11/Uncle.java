package d11;

public interface  Uncle {
	
	final static int tc=12345;// final  ve static yazsak da yazmasak da değimez default olarak gelir
	
	public abstract void  uncle_eye();// child klass mutlaka implement
	
	/*public void boy() {// bu da miras istediği zaman ulaşabilir
		System.out.println("Baba nın boyu miras ");
	}*/ //interface de somut body li method olamaz 
	
	
	void uncle_method(); // soyut abstarct method  public abstract void uncle_method();
	
	
	public static void uncle_static_method() { // 
		System.out.println("Amcanın statik methodu");
	}
	
	
	public default void uncle_default ()
	{
		System.out.println("Amcanın default methodu");
	}
	

}
