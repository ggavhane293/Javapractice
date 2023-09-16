package LogicalPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortingWithInbuildMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Approch1
		int a[]= {10,3,5,4,7,56};
		
		System.out.println("beforesort"+Arrays.toString(a));
		//Arrays.parallelSort(a);//sort in accending
		Arrays.sort(a);//sort in accending
		System.out.println("aftersort"+Arrays.toString(a));
		
		//Apporch2
		Integer b[]= {10,3,5,4,7,56};
		
		System.out.println("beforesort"+Arrays.toString(a));
		Arrays.sort(b,Collections.reverseOrder());//sort in decending
		System.out.println("aftersort"+Arrays.toString(b));
	}

}
