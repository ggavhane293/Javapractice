package LogicalPrograms;

public class MinAndMaxNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,45,3,45,43,234,5};
		
		int max = a[0];
		int min = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			 if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("max num is : "+max+" and min number is : "+min);
		
		

	}

}
