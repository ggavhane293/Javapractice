package constructor;

public class Parameterized_Constructor {

	private String name;

	public Parameterized_Constructor(String n) {
		System.out.println("Parameterized Constructor");
		this.name = n;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Parameterized_Constructor d = new Parameterized_Constructor("Java");
		System.out.println(d.getName());
	}
}
