package Inheritance;

class parrent2
{
	void m1()
	{
		System.out.println("this is parrent m1");
	}
}

public class SuperKeyword extends parrent2 {
	
	void m1() 
	{
		System.out.println("this is child m1");
	}
	void m2()
	{
		this.m1();//using this keyword for calling the current call method
		super.m1();//using super keyword for calling parrent class method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SuperKeyword().m2();
	}

}
