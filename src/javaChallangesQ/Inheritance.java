package javaChallangesQ;

public class Inheritance {
//jvm should intiate the constructor first of parrent class

		{
			System.out.println("parrent class");
		}

	}

class Test extends Inheritance{
	
	{
		System.out.println("child class");
	}
	
	public static void main(String[] args) {
		Test t  = new Test();
		Inheritance l = new Inheritance();// print only parrent class block
		Inheritance j = new Test();
		//Test tt = new Inheritance(); this is not allowded
	}
}
