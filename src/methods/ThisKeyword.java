package methods;

public class ThisKeyword {
	
	int a=1000;//instance variable
	int b=2000;
	
	void m1(int a, int b)//local variable
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);//using the This keyword for calling the instance variable
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword th = new ThisKeyword();
		th.m1(100, 200);

	}

}
