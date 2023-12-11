package javaChallangesQ;

public class CounstructorChaining {
	//construction chaining
	CounstructorChaining()
	{
		this(3);//calling single para cunstr
		System.out.println("hi");
	}
	CounstructorChaining(int x)
	{
		this(4,5);//calling double para cunstr
		System.out.println("hello");
	}
	CounstructorChaining(int x, int y)
	{
		System.out.println("bye");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CounstructorChaining bt =new CounstructorChaining();
	}

}
