package interviews;

public class Nice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input-my java program!! / output-program java my !!
		
		String str="my java program !!";
		String arr[]=str.split(" ");
		int len=arr.length;
		String rev ="";
		for(int i=len-2;i>=0;i--)
		{
			rev=rev+arr[i];
			rev+=" ";
			
		}
		System.out.println(rev+""+arr[len-1]);
		
	}

}
