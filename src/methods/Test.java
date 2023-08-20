package methods;

public class Test {
	int a=5;
	static String b="xyz";//instance variable
	
	void m1(int a, String b)//Parameterized method
	{
		int a1=10;//local variable
		String b1="abc";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a1);
		System.out.println(b1);
	}
	void m2() {//instance method
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.m1(15, "best");//printing m1 with parameterized and local variable value
		t.m2();// printing the m2
		System.out.println(b); //printing the b instance variable

	}

}
