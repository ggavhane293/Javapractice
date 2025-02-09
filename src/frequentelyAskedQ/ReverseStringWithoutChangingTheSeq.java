package frequentelyAskedQ;

public class ReverseStringWithoutChangingTheSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "my test in java";
		String arr[] =str.split(" ");
		String rev="";
		for(int i=arr.length-1;i>=0;i--)
		{
			rev=rev+arr[i];
			rev=rev+ " ";
			
		}
		System.out.println(rev);
	}

}
