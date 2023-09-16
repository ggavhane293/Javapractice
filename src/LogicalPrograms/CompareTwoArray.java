package LogicalPrograms;

import java.util.Arrays;

public class CompareTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		
		Boolean status=Arrays.equals(a1, a2);
		
		if(status==true)
		{
			System.out.println("arrays are equals");
		}
		else
		{
			System.out.println("arrays are not equals");
		}

	}

}
