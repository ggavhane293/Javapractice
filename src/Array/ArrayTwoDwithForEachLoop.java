package Array;

public class ArrayTwoDwithForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] []= new int [2][3];
		
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=40;
		a[1][1]=444;
		a[1][2]=4445;
		
		for(int i[]:a)//printing the first row and incresing
		{
			for(int j:i)//printing the value of i
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
