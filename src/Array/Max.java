package Array;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

			int []num={1,43,2,34};
			int max=num[0];

			for(int i=1;i<num.length;i++)
			if(num[i]>max)
			{
			 max=num[i];
			
			}
			System.out.println(max);
			System.out.println("Above is the max num");
		}

	}


