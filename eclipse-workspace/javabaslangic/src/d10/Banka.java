package d10;

public class Banka {
	final static String BANKANAME= "ZİRAAT";
	private int bankaId=112;
	private int bakiye;
	private String personelName;
	private String personelMail;
	
	
	public Banka(int bakiye, String personelName, String personelMail, int bankaId) {
		super();
		this.bankaId = bankaId;
		this.bakiye = bakiye;
		this.personelName = personelName;
		this.personelMail = personelMail;
	}


	public Banka() {
		// TODO Auto-generated constructor stub
	}


	public void setBakiyeekle(int bakiye) {
		this.bakiye +=bakiye;
	}
	
	public void setBakiyeCıkar(int bakiye) {
		this.bakiye -=bakiye;
	}


	public void setPersonelMail(String personelMail) {
		this.personelMail = personelMail;
	}


	@Override
	public String toString() {
		return "Banka [bankaId=" + bankaId + ", bakiye=" + bakiye + ", personelName=" + personelName + ", personelMail="
				+ personelMail + "]";
	}


	public static String getBankaname() {
		return BANKANAME;
	}


	public int getBakiye() {
		return bakiye;
	}


	public String getPersonelName() {
		return personelName;
	}


	public String getPersonelMail() {
		return personelMail.toUpperCase().substring(0,7);
	}
	
	
	
	

}
