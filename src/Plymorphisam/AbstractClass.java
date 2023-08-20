package Plymorphisam;


abstract class Test
{
	abstract void m1();
	abstract void m2();
	abstract void m3();//--------abstract method
	void m5()//-----------------normal method
	{
		System.out.println("method m5");
	}
}
public class AbstractClass extends Test {
	void m1()//---------------Implementation of abstract method
	{
		System.out.println("method m1");
	}
	void m2()
	{
		System.out.println("method m2");
	}
	void m3()
	{
		System.out.println("method m3");
	}
	void m4() {
		System.out.println("method m4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass a = new AbstractClass();//child class object creation
		a.m4();
		a.m1();
		a.m2();
		a.m3();
		a.m5();
		Test t = new AbstractClass();//Reference variables from abstract class
		t.m1();
		t.m2();
		t.m3();

	}

}
