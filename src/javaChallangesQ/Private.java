package javaChallangesQ;

public class Private {
	
	private int a;
	
	private void m1()
	{
		System.out.println("this is private method");
		}
	private Private()
	{
		System.out.println("this is private constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Private p = new Private();
		p.m1();
		System.out.println("this is private variable :"+p.a);

	}

}
