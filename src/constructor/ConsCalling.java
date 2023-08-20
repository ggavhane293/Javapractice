package constructor;

public class ConsCalling {
	
	ConsCalling()
	{
		this(10);
		System.out.println("0-org cons");
		
	}
	ConsCalling(int a)
	{
		System.out.println("1- org cons");
		
	}
	ConsCalling(int a, int b)
	{
		System.out.println("2-org cons");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsCalling c = new ConsCalling();

	}

}
