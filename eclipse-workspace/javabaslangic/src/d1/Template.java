package d1;

/**
 * java documentation (javadoc) comment for class
 * 
 * @author bingol
 */
public class Template {

	/**
	 * javadoc comment for field a.
	 */
	int a;

	/**
	 * javadoc comment for constructor
	 * 
	 * @param a
	 */
	public Template(int a) {
		this.a = a;
	}

	/**
	 * javadoc comment for method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO reminder for a thing that will be done later

		// line comment
		Template template = new Template(7); // line comment
		System.out.println("template.a:" + template.a);

		/*
		 * block comment
		 * 
		 */
		template.a = 9;
		System.out.println("template.a:" + template.a);
	}

}
