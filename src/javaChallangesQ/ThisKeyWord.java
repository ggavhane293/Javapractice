package javaChallangesQ;

public class ThisKeyWord {
	
	//call the method using this keyword
	void access()
	{
		this.m1();// calling m1 method with this keyword
		this.m2();//calling m2 method with this keyword
		System.out.println("acces method");
	}
	void m1()
	{
		System.out.println("m1 mehtod");
	}
	static void m2()
	{
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyWord th = new ThisKeyWord();
		th.access();

	}

}
