package Inheritance;


class Parrent1
{
	Parrent1()
	{
		System.out.println("0-org parrent cons");
	}
}
public class SuperConstrctor extends Parrent1 {
	
	SuperConstrctor()
	{
		this(20);
		System.out.println("0-org child cons");
	}
	SuperConstrctor(int a)
	{
		super();
		System.out.println("1-org child cons");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SuperConstrctor();
	}

}
