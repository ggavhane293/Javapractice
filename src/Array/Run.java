package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s = "i.love.java";
	
	String st[] =s.split("\\.");
	
	int len = st.length;
	
	String rev ="";
	
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+st[i];
		
	if(i!=0)
	{
		rev+=".";
	}
	}
	System.out.println(rev);
}
}

