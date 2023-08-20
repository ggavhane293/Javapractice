package methods;


class Parrent1
{
	int marry()
	{
		System.out.println("black girl");
		return 1;
	}
}

public class Overridermathod extends Parrent1 {
	
	int marry()
	{
		System.out.println("red girl");
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Overridermathod().marry();
	}

}
