package Stringmethods;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "abbdfdc";
		String ans ="";
		char a []=str.toCharArray();
		//int s= a.length;
		for(int i=0;i<a.length;i++)
		{
			if(ans.indexOf(a[i])<0)
			{
				ans+=a[i];
			}
		}
		System.out.println(a);
	}

}
