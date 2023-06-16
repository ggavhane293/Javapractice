package Oops;


 public class Methodoverriding extends Methodoverloading{
	
	 public void test() {
		System.out.println("chield class method");
	}
	 public void test(int a)
	 {
	 System.out.print("chield class second method");
}
 	public static void main(String args[])
 	{
 		Methodoverriding a = new Methodoverriding();
 		a.test();//same name method from chield class
 		Methodoverloading b =new Methodoverloading();
 		b.test();//same name method from parrent class
 	}}