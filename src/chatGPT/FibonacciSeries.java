package chatGPT;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		m1(num);
	}
	public static Integer m1(int num)
	{
		int first=0, second=1, next=0;
		
		for(int i=0;i<=num;i++)
		{
		
			next=first+second;
			first=second;
			second=next;
			System.out.println(next);
		}
		
		return 0;
	}

}
