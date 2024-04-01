package interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coferge4 {
	
	public static void splitword(String str)
	{
		String arr[]=str.split(" ");
		int count=0;
		List ls=new ArrayList();
		for(int i=0;i<arr.length;i++)
		{
			String s=arr[i];
			ls.add(s.charAt(0));//Adding to list first char of first two strings
			count++;
			if(count==2)
			break;	
		}
		for(int j=2;j<arr.length;j++)
		{
				ls.add(arr[j]);//adding to list the words after 3 rd word
		}
		System.out.println("with list: "+ls);
		
		 StringBuilder sb = new StringBuilder();// if we want we can convert the list to string
		        // Appends characters one by one
	        for (Object ch : ls) {
	            sb.append(ch);
	            sb.append(" ");
	        }
	        System.out.println("With String: "+sb);
	        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print the "V K is a good player"
		String str1="Virat Kohli is a good player";
		String str="Sachin Tenduark is a good player";
		splitword(str);
		
	}

}
