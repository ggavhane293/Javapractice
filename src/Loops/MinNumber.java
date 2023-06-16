package Loops;

public class MinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b [] = {10,38,4,5,67};
		int smallestNum = minimum(b);
		System.out.println("minimum number is :"+smallestNum);

	}


	public static int minimum(int []number)
	{
		int minnumber = number[0];
		for(int c : number)
		{
			if(c>minnumber)
			{
			minnumber=c;
		}
		}
		return minnumber;
	}
}