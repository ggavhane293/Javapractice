package interviews;

public class Coferge3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Virat Kohli is a good player";
		String ans="";
		String[] str1=str.split("[ ]");
		int len=str1.length;
		for(int i=len-1;i>=0;i--)
		{
			ans=ans+str1[i];
			ans+=" ";
		}
		System.out.println(ans);

	}

}
