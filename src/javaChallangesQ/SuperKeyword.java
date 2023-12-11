package javaChallangesQ;

public class SuperKeyword extends Test4{
	
	void m1()
	{
		super.m1();// calling parrent class method in child
		System.out.println("hello m1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperKeyword test = new SuperKeyword();
		test.m1();
		
	}

}
class Test4 {
	
	void m1()
	{
		
		System.out.println("hello m2");
	}
}