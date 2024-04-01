package Test;

public class CompareTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1= "sandeep";
		String str2 ="sandeep";
		boolean isCompare=false;
		
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=str2.charAt(i)) {
				isCompare=false;
				break;
			}
			isCompare=true;
		}
		System.out.println(isCompare);
	}

}
