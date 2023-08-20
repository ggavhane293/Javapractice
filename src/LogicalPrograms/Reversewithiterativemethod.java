package LogicalPrograms;

public class Reversewithiterativemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "myjava";
				
		char [] strarray = str.toCharArray();
		
		for(int i=strarray.length-1;i>=0;i--)
		{
			System.out.print(strarray[i]);
		}

	}

}
