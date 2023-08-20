package LogicalPrograms;

public class Q2 {
	
	Q2()
	{
		this(1);
		System.out.println("first");
	}
	Q2(int a)
	{
		this(1,2);
		System.out.println("second");
	}
	Q2(int a, int b)
	{
		System.out.println("third");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2 a = new Q2();
		

	}

}
//defined 3 constructor and calling in one line object creation