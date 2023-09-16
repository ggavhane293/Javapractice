package LogicalPrograms;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,34,5,6,66};
		
		int search=10;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(search==a[i])
			{
				System.out.println("element found at : "+i);
				flag=true;
				break;
		}
		}
	if(flag==false)
	{
		System.out.println("element is not found");
	}

}
}
