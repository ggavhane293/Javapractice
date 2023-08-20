package methods;

public class MethodCalling {
	
	void m1()
	{
		m2();//calling method 2
		System.out.println("method m1");
		m2();
	}
	void m2()
	{
		m3(10);//calling method 3
		System.out.println("method m2");
	}
	
	void m3(int a)
	{
		System.out.println("method m3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodCalling m = new MethodCalling();
		m.m1();//printing the method 1
	}

}
