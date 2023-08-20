package Array;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {10,30,2,499};
		int max=array[0];
		
		for(int i=0;i<array.length;i++)
			
			if(array[i]>max)
			{
				max=array[i];
			}
			
			System.out.println(max);
		}
		
			
	}


