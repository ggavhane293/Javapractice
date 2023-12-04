package LogicalPrograms;

public class Reversewithiterativemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "myjava";
				
		char [] ar = str.toCharArray();
		
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]);
		}

	}

}
