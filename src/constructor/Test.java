package constructor;

public class Test {
	
	int eid;//instance variable 
	
	Test(int id)
	{
		this.eid=id;//converting the local values to instance values
	}
	void disp()
	{
		System.out.println("emp id---"+eid);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t =new Test(111);
		t.disp();

	}

}
