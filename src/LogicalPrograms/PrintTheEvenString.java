package LogicalPrograms;

public class PrintTheEvenString {
	
	
	public static void pringstring(String s)
	{
		//s.split(" ");
		for(String word:s.split(" "))
		{
			if(word.length()%2==0)
			{
				System.out.println(word);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTheEvenString ps = new PrintTheEvenString();
		ps.pringstring("i am new as the ls");
	}

}
