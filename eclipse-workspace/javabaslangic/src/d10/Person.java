package d10;

public class Person {

	String name = "", surName = "";
	int title = 0;// titles:1=Student,2=Prof.3=Dr.,all others=None

	public Person(String Name, String Surname, int Title) {
		name = Name;
		surName = Surname;
		title = Title;
	}
	

	public String toString() {
		String message = "Person is ";

////TODO improve message with title in string, name and surname, see output for example, you can use toUpperCase() Method
		switch (title) {
		case 1:
			message += "Student ";
			break;
		case 2:
			message += "Prof. ";
			break;
		case 3:
			message += "Dr. ";
			break;
		default:
			message += "";
		}
		message += name + " " + surName.toUpperCase();

		return message;

	}

}