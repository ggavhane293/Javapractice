package methods;

class X{
		void m3()
		{
		System.out.println("class x");
	}
}
class Y{}
class Emp{}
class Student{}
public class MultiClass {

	void m1( X x, Emp e)
	{
		System.out.println("m1 method");
	}
	void m2(Y y, Student s)
	{
		System.out.println("m2 method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		X x =new X();
		Y y = new Y();
		Emp e = new Emp();
		Student s = new Student();
		MultiClass m = new MultiClass();
		m.m1(x, e);
		m.m2(y, s);
		x.m3();
		

	}

}
