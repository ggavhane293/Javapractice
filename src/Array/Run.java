package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str = "testing234**&7";
	String str1="";
	String str2="";
	//char a[]=str.toCharArray();
	
	//System.out.println(Arrays.toString(a));
	for(int i=0;i<str.length();i++)
	{
		
		char c=str.charAt(i);
		  if( '0' <= c && c <= '9' )  
              str1=str1+c;  
     if( 'a' <= c && c <= 'z' )  
              str2=str2+c;  
     
}
	System.out.println(str1);  
	   System.out.println(str2);  
	}
}


