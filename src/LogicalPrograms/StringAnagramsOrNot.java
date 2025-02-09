package LogicalPrograms;

import java.util.Arrays;

public class StringAnagramsOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="testing";
		String str2="etsitgn";
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("string is anagram");
		}
		else
		{
			System.out.println("String is not anagram");
		}

	}

}
