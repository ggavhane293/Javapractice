package Test;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// checking both strings are same or not
		String str1="java";
		String str2="avaj";
		System.out.println(anagramcheck(str1,str2));
	}
	
	public static boolean anagramcheck(String str1, String  str2) {
		char[] carArray1=str1.toCharArray();
		char[] carArray2=str2.toCharArray();
		Arrays.sort(carArray1);
		Arrays.sort(carArray2);
		
		return Arrays.equals(carArray1, carArray2);
	}

}
