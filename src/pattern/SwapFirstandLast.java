package pattern;

public class SwapFirstandLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[]= {"one", "two", "four"};
		
		for(int i=0;i<=a.length-1;i++)
		{
				char first=a[i].charAt(0);
				int len =a[i].length();
				char last=a[i].charAt(len-1);
				String s=a[i].substring(1,len-1);
				System.out.println(last + s + first);
		}
		
	}

}
