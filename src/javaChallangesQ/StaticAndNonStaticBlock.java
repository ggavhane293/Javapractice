package javaChallangesQ;

// print the static and non static block
public class StaticAndNonStaticBlock {
	
	static // it will print when class file is loading
	{
		System.out.println("static block");
	}
	{
	System.out.println("non static block");// it will print everytime when object is created
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		StaticAndNonStaticBlock one = new StaticAndNonStaticBlock();
		StaticAndNonStaticBlock two = new StaticAndNonStaticBlock();

	}

}
