package LogicalPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=100, t1=0, t2=1;
		while(t1<=n)
		{
		System.out.println(t1);
		int sum =t1+t2;
		t1=t2;
		t2=sum;
		
		}
	}

}
