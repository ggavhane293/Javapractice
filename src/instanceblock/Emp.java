package instanceblock;

public class Emp {
	
	int eid;
	//instance block initilizing to variable during the objec creation
	{
		eid=111;
	}
	void disp()
	{
		System.out.println(eid);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Emp().disp();

	}

}
