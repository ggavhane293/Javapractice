package Loops;

public class FoorEach {
	
	//to finding the maximum number
	
	    public static void main(String[] arg)
	    {
	        {
	            int[] marks = { 125, 132, 95, 116, 110 };
	              
	            int highest_marks = maximum(marks);
	            int smallest_marks = maximum1(marks);
	            System.out.println("The max score is " + highest_marks);
	            System.out.println("The min score is " + smallest_marks);
	        }
	    }
	    public static  int maximum(int[] numbers)
	    { 
	        int maxSoFar = numbers[0];
	          
	        // for each loop
	        for (int num : numbers) 
	        {
	            if (num > maxSoFar)
	            {
	                maxSoFar = num;
	            }
	        }
	    return maxSoFar;
	    }
	    public static  int maximum1(int[] numbers)
	    { 
	        int maxSoFar = numbers[0];
	          
	        // for each loop
	        for (int num : numbers) 
	        {
	            if (num < maxSoFar)
	            {
	                maxSoFar = num;
	            }
	        }
	    return maxSoFar;
	    }
	    
	}
