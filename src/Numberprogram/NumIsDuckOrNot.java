package Numberprogram;

public class NumIsDuckOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we have to check number contains 0 or not
		int n=43;
		int count=0;
		while(n!=0)
		{
			int d=n%10;
			if(d==0)//checking the digit is zero or not
			{
				count++;
			}
			n=n/10;
		}
		if(count>0)
		{
			System.out.println("num is duck");
		}
		else
		{
			System.out.println("num is not duck");
		}
	}

}
