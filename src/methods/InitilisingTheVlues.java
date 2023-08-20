package methods;

public class InitilisingTheVlues {
	
	int empid;
	int empno;
	String name;
	
	void setdata(int eid, int eno, String ename)
	{
		empid=eid;
		empno=eno;
		name=ename;
	}
	void display()
	{
		System.out.println(empid);
		System.out.println(empno);
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitilisingTheVlues e1 = new InitilisingTheVlues();
		e1.setdata(100, 1, "ganesh");
		e1.display();
	}

}
