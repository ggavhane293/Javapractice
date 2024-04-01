package Stringmethods;

public class FirstCharOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "my first java";
		printwords(str);
		
	}
	public static void printwords(String str)
	{
		String arr[]=str.split(" ");

		for(int i=0;i<arr.length;i++)
		{
			String s= arr[i];

			System.out.println(s.charAt(0));
	
		}
			
	}

}
