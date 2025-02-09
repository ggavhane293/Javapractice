package LogicalPrograms;

import java.util.Arrays;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {23,3,5,6,23,66,77,4};
		int size=a.length;
		Arrays.sort(a);
		System.out.println("sorted array"+ Arrays.toString(a));
		
		System.out.println(a[size-1]);

	}

}
