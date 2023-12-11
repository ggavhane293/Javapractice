package javaChallangesQ;

public class SuperMethod extends Test7 {
	
	SuperMethod()//default constr
	{
		super(4);//calling the single para constructor
		System.out.println("this is child class default");
	}
	SuperMethod(int a)//one para constr
	{
		super();//calling the default constructor
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperMethod sp = new SuperMethod();// it will print the default constr
		SuperMethod sp1 = new SuperMethod(2);//it will print the one para constr
	}

}
class Test7
{
	static
	{
		System.out.println("this is static block");// it will print once at the time of class loading
	}
	{
		System.out.println("this is instance block");// it will print every time at the object creation
	}
	Test7(int a)//one para constr
	{
		System.out.println("this is parent class one para");
	}
	Test7()//default constr
	{
		System.out.println("this is parent class default");
	}
}