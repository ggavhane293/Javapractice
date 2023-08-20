package Plymorphisam;

abstract class Parrent
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}

abstract class Test1 extends Parrent
{
	void m1()
	{
		System.out.println("method m1");
	}
}

abstract class Test2 extends Test1
{
	void m2()
	{
		System.out.println("method m2");
	}
}
class Test3 extends Test2
{
	void m3()
	{
		System.out.println("mehod m3");
	}
}

public class MultilevelAbstarctClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t = new Test3();
		t.m1();
		t.m2();
		t.m3();

	}

}
