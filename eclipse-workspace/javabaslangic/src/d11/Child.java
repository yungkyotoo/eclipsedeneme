package d11;

public class Child extends Parent implements Aunt, Uncle{

	// chil class ı sadce tek bir sınıftan extend edilebilir birden fazla interface i implement edebilir
	//implementlerin default ve statik hariç tüm methodları abstractır
	
	@Override
	public void soyad() {// parent
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uncle_method() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uncle_eye() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aunt_sac() {
		// TODO Auto-generated method stub
		System.out.println("Halanın gözü alın");
		
	}
	public static void main(String[] args) {
		
		Child child=new Child();
		child.boy();
		child.aunt_default();
		
	}
	
	

}
