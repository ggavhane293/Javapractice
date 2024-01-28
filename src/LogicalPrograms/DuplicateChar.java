package LogicalPrograms;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="sofegeek";
		int count=0;
		char a[]=str.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
				
			{
				if(a[i]==a[j])
				{
					System.out.println("duplicate char are: " +a[j]);
					count++;
				}
			}
		}
		System.out.println("duplicate char count"+count);

	}

}
