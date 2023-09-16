package LogicalPrograms;

public class ReverseStringWithCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcd";
		String rev= "";
		int len =str.length();
		char a[]=str.toCharArray();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		
		System.out.println(rev);

	}

}
