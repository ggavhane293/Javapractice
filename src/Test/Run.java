package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Run {

	public static void main(String[] args) {
		int a[]= {2,4,5,53,38,6,25};
		int count=0;
		
		System.out.println("before sorting the array"+Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					count++;
				}
			}
		}
		System.out.println("after sorted array"+Arrays.toString(a));
		System.out.println(count);
		

	}

}
