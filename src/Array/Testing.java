package Array;

public class Testing {
	
	void m()
	{
		System.out.println("method m1");
	}
	static void m2()
	{
		System.out.println("method m2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing t = new Testing();
		t.m();//instance method calling with object 
		t.m2();//static method calling with objec
		Testing.m2();//static method calling with classname

	}

}
