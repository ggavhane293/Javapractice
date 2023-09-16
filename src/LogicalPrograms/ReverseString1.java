package LogicalPrograms;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcd";
		String rev="";
		
		int len =str.length();// size 4
		
		for(int i=len-1;i>=0;i--)// 3 2 1 0 -1
		{
			rev=rev+str.charAt(i);//dcba
			
		}
			System.out.println(rev);
	}

}
