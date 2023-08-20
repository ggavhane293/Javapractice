package constructor;

public class Emp {
	
	int eid;
	String ename;
	float esal;
	
	void disp()
	{
		System.out.println("emp id--"+ eid);
		System.out.println("emp name--"+ ename);
		System.out.println("emp sal--"+ esal);
	}
	Emp()//user defined constructor executed during the object creation
	{
		eid=111;
		ename="ganesh";
		esal=180.23f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e =new Emp();
		e.disp();
	}

}
